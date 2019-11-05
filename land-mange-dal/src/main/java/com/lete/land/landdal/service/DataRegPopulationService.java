package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataRegPopulation;
import com.lete.land.landdal.repository.DataRegPopulationRepository;
import com.lete.land.landdal.vo.excelModel.DataRegPopulationModel;
import com.lete.land.landdal.vo.dataCenter.SocialSecurityEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.Predicate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by WJ on 2019/4/22 0022
 */
@Service
public class DataRegPopulationService {
    @PersistenceContext
    private EntityManager entityManager;

    @Resource
    private DataRegPopulationRepository dataRegPopulationRepository;

    @Transactional
    public void alterTemplate(String column, String comment) {
        // dataRegPopulationRepository.alterTemplate("表头1");
    }

    public  void transferAndSave(List<Object> modelList,String year,String townId){
        List<DataRegPopulation> list = new ArrayList<>();

        try {
            for(Object obj : modelList){
                DataRegPopulation dataRegPopulation = new DataRegPopulation();
                DataRegPopulationModel model = (DataRegPopulationModel)obj;
                String uuid = UUID.randomUUID().toString().replace("-", "");
                dataRegPopulation.setId(uuid);
                dataRegPopulation.setIdCard(model.getIdCard());
                dataRegPopulation.setName("测试人吴杰");// new SimpleDateFormat("yyyy-MM-dd").parse(model.getBornDate())
               //  LocalDate da = new LocalDate(1,"01","08");
               // dataRegPopulation.setBornDate(LocalDate.parse(time, DateTimeFormatter.ofPattern("yyyy-mm-dd")));
                dataRegPopulation.setBornDate(LocalDate.of(1998,10,1));
                dataRegPopulation.setCadastralNum(model.getCadastralNum());
                dataRegPopulation.setSex(model.getSex());
                dataRegPopulation.setYear(year);
                dataRegPopulation.setTownId(townId);

                if(model.getSocialSecurityType().equals(SocialSecurityEnum.City.getDesc())) {
                    dataRegPopulation.setSocialSecurityType(SocialSecurityEnum.City.getIdnex());
                }else {
                    dataRegPopulation.setSocialSecurityType(SocialSecurityEnum.Vill.getIdnex());
                }

                dataRegPopulation.setTown(model.getTown());
                dataRegPopulation.setVillage(model.getVillage());
                list.add(dataRegPopulation);
            }
        }catch (Exception e){
            System.out.println("日期类型转换错误");
        }

        dataRegPopulationRepository.saveAll(list);
    }

    public Page<DataRegPopulation> getRegPopulationPage(String townId,String year,String name,String idCard,Pageable pageable) {
        return dataRegPopulationRepository.findAll((Specification<DataRegPopulation>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();
            predicates.add(criteriaBuilder.equal(root.get("townId"),townId));
            if(StringUtils.isNotEmpty(year)) {
                predicates.add(criteriaBuilder.equal(root.get("year"),year));
            }
            if(StringUtils.isNotEmpty(name)) {
                predicates.add(criteriaBuilder.equal(root.get("name"),name));
            }
            if(StringUtils.isNotEmpty(idCard)) {
                predicates.add(criteriaBuilder.equal(root.get("idCard"),idCard));
            }
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        },pageable);
    }

    @Transactional
    public Result saveRegPopulation(DataRegPopulation dataRegPopulation) {
        try{
            dataRegPopulationRepository.save(dataRegPopulation);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    @Transactional
    public Result deleteRegPopulation(String regId) {
        try{
            dataRegPopulationRepository.deleteById(regId);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }

}
