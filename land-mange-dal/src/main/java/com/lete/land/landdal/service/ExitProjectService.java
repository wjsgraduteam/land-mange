package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.*;
import com.lete.land.landdal.repository.*;
import com.lete.land.landdal.util.ExcelException;
import com.lete.land.landdal.vo.dataCenter.SocialSecurityEnum;
import com.lete.land.landdal.vo.exitMange.ApplyStatusEnum;
import com.lete.land.landdal.vo.exitMange.ExitApplyVo;
import com.lete.land.landdal.vo.exitMange.ExitCompleteVo;
import com.lete.land.landdal.vo.exitMange.ExitSocialChangeVo;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by WJ on 2019/3/27 0027
 */
@Service
public class ExitProjectService {
    @Resource
    private ExitProjectRepository exitProjectRepository;

    @Resource
    private ExitFamersApplyRepository exitFamersApplyRepository;

    @Resource
    private ExitSocialTypeChangeRepository exitSocialTypeChangeRepository;

    @Resource
    private DataRegPopulationRepository dataRegPopulationRepository;

    @Resource
    private DataHolderInformationRepository dataHolderInformationRepository;

    @Resource
    private ExitStockTypeChangeRepository exitStockTypeChangeRepository;

    @Resource
    private ExitAnzhiShenpiRepository exitAnzhiShenpiRepository;

    @Resource
    private ExitMoneyCompensateRepository exitMoneyCompensateRepository;

    private MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();


    @Transactional
    public Result saveExitApplyVo(ExitApplyVo exitApplyVo) {
        MapperFacade mapperFacade = mapperFactory.getMapperFacade();
        // 项目主表
        ExitProject exitProject = new ExitProject();
        exitProject.setProjectNo("P" + (int) (Math.random() * 9 + 1) * 10000);
        exitProject.setProjectName(exitApplyVo.getTown() + exitApplyVo.getVillage() + exitApplyVo.getHouseholderName());
        exitProject.setApplyDate(exitApplyVo.getApplyDate());
        exitProject.setStatus(ApplyStatusEnum.NOT.getIndex()); //未审核
        final String proId = exitProjectRepository.save(exitProject).getId();
        // 农户申请表
        ExitFamersApply exitFamersApply = mapperFacade.map(exitApplyVo, ExitFamersApply.class);
        exitFamersApply.setFamilyNum(exitApplyVo.getFamilyMemberList().size() + 1);
        exitFamersApply.setProId(proId);
        exitFamersApplyRepository.save(exitFamersApply);
        // 业主社保变更表
        DataRegPopulation hourseReg = dataRegPopulationRepository.findByNameAndIdCard(exitApplyVo.getHouseholderName(), exitApplyVo.getIdCard()); // 这边查的结果可能不唯一
        ExitSocialTypeChange hourseHolder = mapperFacade.map(hourseReg, ExitSocialTypeChange.class);
        hourseHolder.setId(null);
        hourseHolder.setRelation("户主");
        hourseHolder.setRegisterDate(exitApplyVo.getApplyDate()); // 注册日期
        hourseHolder.setChangeType(SocialSecurityEnum.City.getIdnex()); // 变更类型
        hourseHolder.setProId(proId);
        hourseHolder.setHourseHolderId("0");
        final String hourseId = exitSocialTypeChangeRepository.save(hourseHolder).getId();
        // 家庭成员信息变更表
        List<ExitSocialTypeChange> socialTypeChangeList = exitApplyVo.getFamilyMemberList().stream().map(member -> {
            DataRegPopulation dataRegPopulation = dataRegPopulationRepository.findById(member.getId()).get();

            ExitSocialTypeChange exitSocialTypeChange = mapperFacade.map(dataRegPopulation, ExitSocialTypeChange.class);
            exitSocialTypeChange.setId(null);
            exitSocialTypeChange.setRelation(member.getRelation());
            exitSocialTypeChange.setChangeType(SocialSecurityEnum.City.getIdnex());
            exitSocialTypeChange.setRegisterDate(exitApplyVo.getApplyDate());
            exitSocialTypeChange.setHourseHolderId(hourseId); // 户主ID
            exitSocialTypeChange.setProId(proId);
            return exitSocialTypeChange;
        }).collect(Collectors.toList());
        exitSocialTypeChangeRepository.saveAll(socialTypeChangeList);
        // 股份类型变更登记表
        mapperFactory.classMap(DataHolderInformation.class, ExitStockTypeChange.class)
                .field("toalStock", "presentToalStock")
                .field("stockType", "presentStockType")
                .field("familyNum", "familyNum")
                .exclude("id")
                .byDefault().register();
        MapperFacade stockMapper = mapperFactory.getMapperFacade();
        DataHolderInformation dataHolderInformation = dataHolderInformationRepository.findByIdCard(exitApplyVo.getIdCard()); // 此处应该加上年份的刷选条件
        ExitStockTypeChange exitStockTypeChange = stockMapper.map(dataHolderInformation, ExitStockTypeChange.class);
        exitStockTypeChange.setId(null);
        exitStockTypeChange.setNewStockType(SocialSecurityEnum.City.getIdnex());
        exitStockTypeChange.setRegisterDate(exitApplyVo.getApplyDate());
        exitStockTypeChange.setProId(proId);
        exitStockTypeChange.setFamilyNum(dataHolderInformation.getFamilyNum());
        exitStockTypeChangeRepository.save(exitStockTypeChange);
        // 动迁安置申请登记表
        ExitAnzhiShenqing exitAnzhiShenqing = mapperFacade.map(exitApplyVo, ExitAnzhiShenqing.class);
        exitAnzhiShenqing.setFamilyNum(exitApplyVo.getFamilyMemberList().size() + 1);
        exitAnzhiShenqing.setPlaceReason("退地动迁户");
        exitAnzhiShenqing.setProId(proId);
        exitAnzhiShenqing.setRegisterDate(exitApplyVo.getApplyDate());
        exitAnzhiShenpiRepository.save(exitAnzhiShenqing);
        // 赔偿表
        ExitMoneyCompensate exitMoneyCompensate = mapperFacade.map(exitApplyVo, ExitMoneyCompensate.class);
        exitMoneyCompensate.setProId(proId);
        exitMoneyCompensate.setRegisterDate(exitApplyVo.getApplyDate());
        exitMoneyCompensateRepository.save(exitMoneyCompensate);

        return ResultFactory.buildSuccessResult("成功");
    }

    public Page<ExitProject> getProjectPage(String status, String town, String village, Pageable pageable) {
        return exitProjectRepository.findAll((Specification<ExitProject>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();

            if (StringUtils.isNotEmpty(status)) {
                predicates.add(criteriaBuilder.equal(root.get("status"), status));
            }
            if (StringUtils.isNotEmpty(town)) {
                predicates.add(criteriaBuilder.equal(root.get("town"), town));
            }
            if (StringUtils.isNotEmpty(village)) {
                predicates.add(criteriaBuilder.equal(root.get("village"), village));
            }

            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        }, pageable);
    }

    public ExitApplyVo getExitApplyInfoByProId(String id) {
        List<Object[]> exitApplyObj = exitProjectRepository.findExitApplyInfoByProId(id);
        List<Object[]> exitSocialChangeObj = exitProjectRepository.findFamilyMemberList(id);
        ExitApplyVo exitApplyVo = new ExitApplyVo();

        Object[] applyObj = exitApplyObj.get(0);
        exitApplyVo.setTown(applyObj[0].toString());
        exitApplyVo.setVillage(applyObj[1].toString());
        exitApplyVo.setHouseholderName(applyObj[2].toString());
        exitApplyVo.setIdCard(applyObj[3].toString());
        exitApplyVo.setSocialSecurityType(applyObj[4].toString());
        exitApplyVo.setStockType(applyObj[5].toString());
        exitApplyVo.setApplyExitLandNo(applyObj[6].toString());
        exitApplyVo.setApplyExitLanArea(applyObj[7].toString());
        exitApplyVo.setHouseSiteArea((applyObj[8].toString()));
        exitApplyVo.setHouseArea((applyObj[9].toString()));

        List<ExitSocialChangeVo> exitSocialChangeVoList = exitSocialChangeObj.stream().map(objects -> {
            ExitSocialChangeVo exitSocialChangeVo = new ExitSocialChangeVo();
            exitSocialChangeVo.setName(objects[0].toString());
            exitSocialChangeVo.setIdCard(objects[1].toString());
            exitSocialChangeVo.setRelation(objects[2].toString());
            exitSocialChangeVo.setSocialSecurityType(objects[3].toString());
            exitSocialChangeVo.setPresentStockType(objects[4].toString());
            return exitSocialChangeVo;
        }).collect(Collectors.toList());

        exitApplyVo.setFamilyMemberList(exitSocialChangeVoList);
        return exitApplyVo;
    }

    public Page<ExitSocialTypeChange> getSocialPage(String proId, Pageable pageable) {
        return exitSocialTypeChangeRepository.findAll((Specification<ExitSocialTypeChange>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();
            predicates.add(criteriaBuilder.equal(root.get("proId"), proId));
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        }, pageable);
    }

    public Page<ExitStockTypeChange> getStockPage(String proId, Pageable pageable) {
        return exitStockTypeChangeRepository.findAll((Specification<ExitStockTypeChange>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();
            predicates.add(criteriaBuilder.equal(root.get("proId"), proId));
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        }, pageable);
    }

    public Page<ExitMoneyCompensate> getCompensationPage(String proId, Pageable pageable) {
        return exitMoneyCompensateRepository.findAll((Specification<ExitMoneyCompensate>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();
            predicates.add(criteriaBuilder.equal(root.get("proId"), proId));
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        }, pageable);
    }

    public Result saveCompensation(String proId, Double compensation) {
        try{
            if(compensation != null) {
                ExitMoneyCompensate exitMoneyCompensate = exitMoneyCompensateRepository.findByProId(proId);
                exitMoneyCompensate.setCompensation(compensation);
                exitMoneyCompensateRepository.save(exitMoneyCompensate);
            }
        }catch (ExcelException e) {
            return ResultFactory.buildFailResult("失败");
        }

        return ResultFactory.buildSuccessResult("成功");
    }


    public Page<ExitAnzhiShenqing> getAnzhiPage(String proId, Pageable pageable) {
        return exitAnzhiShenpiRepository.findAll((Specification<ExitAnzhiShenqing>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();
            predicates.add(criteriaBuilder.equal(root.get("proId"), proId));
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        }, pageable);
    }

    public Result completeApply(ExitCompleteVo exitCompleteVo) {
        try {
            ExitProject exitProject = exitProjectRepository.findById(exitCompleteVo.getId()).get();
            exitProject.setStatus(Integer.valueOf(exitCompleteVo.getStatus()));
            exitProject.setAuditOpinion(exitCompleteVo.getAuditOpinion());
            exitProject.setAuditName(exitCompleteVo.getAuditName());
            exitProject.setApplyDate(exitCompleteVo.getAuditDate());

            exitProjectRepository.save(exitProject);
        } catch (ExcelException e) {
            return ResultFactory.buildFailResult("保存失败");
        }

        return ResultFactory.buildSuccessResult("保存成功");
    }

    public Result completeApprove(ExitCompleteVo exitCompleteVo) {
        try {
            ExitProject exitProject = exitProjectRepository.findById(exitCompleteVo.getId()).get();
            exitProject.setStatus(Integer.valueOf(exitCompleteVo.getStatus()));
            exitProject.setApproveOpinion(exitCompleteVo.getAuditOpinion());
            exitProject.setApproveName(exitCompleteVo.getAuditName());
            exitProject.setApproveDate(exitCompleteVo.getAuditDate());

            exitProjectRepository.save(exitProject);
        } catch (ExcelException e) {
            return ResultFactory.buildFailResult("审批失败");
        }
        return ResultFactory.buildSuccessResult("审批成功");
    }
}
