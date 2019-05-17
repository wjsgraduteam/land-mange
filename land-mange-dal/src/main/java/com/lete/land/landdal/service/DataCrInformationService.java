package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataCrInformation;
import com.lete.land.landdal.repository.DataCrInformationRepository;
import com.lete.land.landdal.vo.excelModel.DataCrInformationModel;
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
public class DataCrInformationService {
    @Resource
    private DataCrInformationRepository dataCrInformationRepository;

    public Page<DataCrInformation> getCrInformationPage(String townId, String village, String year, Pageable pageable) {
        return dataCrInformationRepository.findAll((Specification<DataCrInformation>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();

            if (!StringUtils.isEmpty(year)) {
                predicates.add(criteriaBuilder.equal(root.get("year"), year));
            }
            if (!StringUtils.isEmpty(village)) {
                predicates.add(criteriaBuilder.equal(root.get("village"), village));
            }
            if (!StringUtils.isEmpty(townId)) {
                predicates.add(criteriaBuilder.equal(root.get("townId"), townId));
            }
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        }, pageable);
    }

    public Result save(DataCrInformation dataCrInformation) {
        try {
            dataCrInformationRepository.save(dataCrInformation);
            return ResultFactory.buildSuccessResult("保存成功");
        } catch (Exception e) {
            System.out.println(e);
            return ResultFactory.buildFailResult("保存失败");
        }

    }

    public Result delete(String id) {
        try {
            dataCrInformationRepository.deleteById(id);
            return ResultFactory.buildSuccessResult("保存成功");
        } catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }

    }

    public void transferAndSave(List<Object> modelList, String year, String townId) {
        List<DataCrInformation> list = new ArrayList<>();

        for (Object obj : modelList) {
            DataCrInformation dataCrInformation = new DataCrInformation();
            DataCrInformationModel model = (DataCrInformationModel) obj;
            dataCrInformation.setId(model.getId());
            dataCrInformation.setTownId(model.getTownId());
            dataCrInformation.setHrNum(model.getHrNum());
            dataCrInformation.setHrName(model.getHrName());
            dataCrInformation.setIdCard(model.getIdCard());
            dataCrInformation.setIdCard(model.getIdCard());
            dataCrInformation.setVillage(model.getVillage());
            dataCrInformation.setIsSpecial(model.getIsSpecial());
            dataCrInformation.setYear(model.getYear());

            list.add(dataCrInformation);
        }

        dataCrInformationRepository.saveAll(list);
    }
}
