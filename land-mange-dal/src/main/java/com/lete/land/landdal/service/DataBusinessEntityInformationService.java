package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataBusinessEntityInformation;
import com.lete.land.landdal.repository.DataBusinessEntityInformationRepository;
import com.lete.land.landdal.vo.excelModel.DataBusinessEntityInformationModel;
import com.lete.land.landdal.vo.dataCenter.OperatorTypeEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Service
public class DataBusinessEntityInformationService {
    @Resource
    private DataBusinessEntityInformationRepository dataBusinessEntityInformationRepository;
    @Transactional
    public void alterTemplate(String column, String comment) {
        dataBusinessEntityInformationRepository.alterTemplate("表头1");
    }
    public void transferAndSave(List<Object> modelList, String year, String townId) {
        List<DataBusinessEntityInformation> list = new ArrayList<>();

        try {
            for(Object obj : modelList){
                DataBusinessEntityInformation dataBusinessEntityInformation = new DataBusinessEntityInformation();
                DataBusinessEntityInformationModel model = (DataBusinessEntityInformationModel) obj;
                String uuid = UUID.randomUUID().toString().replace("-", "");
                dataBusinessEntityInformation.setId(uuid);
                dataBusinessEntityInformation.setPlotNumber(model.getIdCard());
                dataBusinessEntityInformation.setContractedArea(model.getContractedArea());
                dataBusinessEntityInformation.setTownId(model.getTownId());
                dataBusinessEntityInformation.setOperatorName(model.getOperatorName());
                dataBusinessEntityInformation.setIdCard(model.getIdCard());
                dataBusinessEntityInformation.setStartDate(model.getStartDate());
                dataBusinessEntityInformation.setOperatingPeriod(model.getOperatingPeriod());
                dataBusinessEntityInformation.setYear(model.getYear());

                if(model.getOperatorType().equals(OperatorTypeEnum.Geti.getDesc())) {
                    dataBusinessEntityInformation.setOperatorType(OperatorTypeEnum.Geti.getIdnex());
                }else if (model.getOperatorType().equals(OperatorTypeEnum.CunJiTi.getIdnex())){
                    dataBusinessEntityInformation.setOperatorType(OperatorTypeEnum.CunJiTi.getIdnex());
                }else if (model.getOperatorType().equals(OperatorTypeEnum.ZuLin.getIdnex())){
                    dataBusinessEntityInformation.setOperatorType(OperatorTypeEnum.ZuLin.getIdnex());
                }
                dataBusinessEntityInformation.setTown(model.getTown());
                dataBusinessEntityInformation.setVillage(model.getVillage());
                list.add(dataBusinessEntityInformation);
            }
        }catch (Exception e){
            System.out.println("日期类型转换错误");
        }

        dataBusinessEntityInformationRepository.saveAll(list);
    }

    public Page<DataBusinessEntityInformation> getDataBusinessEntityInformation(String townId, String village, String year, Pageable pageable) {
        return dataBusinessEntityInformationRepository.findAll((Specification<DataBusinessEntityInformation>)(root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();

            if(!StringUtils.isEmpty(year)) {
                predicates.add(criteriaBuilder.equal(root.get("year"),year));
            }
            if(!StringUtils.isEmpty(village)) {
                predicates.add(criteriaBuilder.equal(root.get("village"),village));
            }
            if(!StringUtils.isEmpty(townId)) {
                predicates.add(criteriaBuilder.equal(root.get("townId"),townId));
            }
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        },pageable );
    }

    public Result save() {
        DataBusinessEntityInformation dataBusinessEntityInformation = new DataBusinessEntityInformation();
        dataBusinessEntityInformation.setTown("什么镇");
        try{
            dataBusinessEntityInformationRepository.save(dataBusinessEntityInformation);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
          //  System.out.println(e);
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    public Result delete(String id) {
        try{
            dataBusinessEntityInformationRepository.deleteById(id);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }
}
