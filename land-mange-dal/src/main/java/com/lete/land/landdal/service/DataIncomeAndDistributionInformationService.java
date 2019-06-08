package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataIncomeAndDistributionInformation;
import com.lete.land.landdal.repository.DataIncomeAndDistributionInformationRepository;
import com.lete.land.landdal.vo.excelModel.DataIncomeAndDistributionInformationModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class DataIncomeAndDistributionInformationService {
    @Resource
    private DataIncomeAndDistributionInformationRepository dataIncomeAndDistributionInformationRepository;
    public Page<DataIncomeAndDistributionInformation> getDataIncomeAndDistributionInformationPage(String townId, String village, String year, Pageable pageable) {
        return   dataIncomeAndDistributionInformationRepository.findAll((Specification<DataIncomeAndDistributionInformation>)(root, criteriaQuery, criteriaBuilder) -> {
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
        },pageable);
    }

    public Result save(DataIncomeAndDistributionInformation dataIncomeAndDistributionInformation) {
        try{
            dataIncomeAndDistributionInformationRepository.save(dataIncomeAndDistributionInformation);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    public Result delete(String id) {
        try{
            dataIncomeAndDistributionInformationRepository.deleteById(id);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }

    }

//    public void transferAndSave(List<Object> modelList, String year, String townId) {
//        List<DataIncomeAndDistributionInformation> list = new ArrayList<>();
//        for(Object obj : modelList){
//            DataIncomeAndDistributionInformation dataIncomeAndDistributionInformation = new DataIncomeAndDistributionInformation();
//            DataIncomeAndDistributionInformationModel model = (DataIncomeAndDistributionInformationModel) obj;
//            dataIncomeAndDistributionInformation.setId(model.getId());
//            dataIncomeAndDistributionInformation.setTownId(model.getTownId());
//            dataIncomeAndDistributionInformation.setNumber(model.getNumber());
//            dataIncomeAndDistributionInformation.setTown(model.getTown());
//            dataIncomeAndDistributionInformation.setVillage(model.getVillage());
//            dataIncomeAndDistributionInformation.setTotalNetIncome(model.getTotalNetIncome());
//            dataIncomeAndDistributionInformation.setLmAndReIncome(model.getLmAndReIncome());
//            dataIncomeAndDistributionInformation.setVca(model.getVca());
//            dataIncomeAndDistributionInformation.setShareholderAllocation(model.getShareholderAllocation());
//            dataIncomeAndDistributionInformation.setCurrentRetention(model.getCurrentRetention());
//            dataIncomeAndDistributionInformation.setLta(model.getLta());
//            dataIncomeAndDistributionInformation.setRsTolNum(model.getRsTolNum());
//            dataIncomeAndDistributionInformation.setRuralUnitPrice(model.getRuralUnitPrice());
//            dataIncomeAndDistributionInformation.setCsTolNum(model.getCsTolNum());
//            dataIncomeAndDistributionInformation.setCtup(model.getCtup());
//            dataIncomeAndDistributionInformation.setYear(model.getYear());
//
//        dataIncomeAndDistributionInformationRepository.saveAll(list);
//        }
//    }
}
