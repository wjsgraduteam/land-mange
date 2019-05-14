package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataResidenceIncome;
import com.lete.land.landdal.repository.DataResidenceIncomeRepository;
import com.lete.land.landdal.vo.excelModel.DataResidenceIncomeModel;
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
public class DataResidenceIncomeService {
    @Resource
    private DataResidenceIncomeRepository dataResidenceIncomeRepository;

    public Page<DataResidenceIncome> getDataResidenceIncomePage(String townId, String village, String year, Pageable pageable) {
        return dataResidenceIncomeRepository.findAll((Specification<DataResidenceIncome>) (root, criteriaQuery, criteriaBuilder) -> {
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

    public Result save(DataResidenceIncome dataResidenceIncome) {
        try {
            dataResidenceIncomeRepository.save(dataResidenceIncome);
            return ResultFactory.buildSuccessResult("保存成功");
        } catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }

    }

    public Result delete(String id) {
        try {
            dataResidenceIncomeRepository.deleteById(id);
            return ResultFactory.buildSuccessResult("保存成功");
        } catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    public void transferAndSave(List<Object> modelList, String year, String townId) {
        List<DataResidenceIncome> list = new ArrayList<>();
        for (Object obj : modelList) {
            DataResidenceIncome dataResidenceIncome = new DataResidenceIncome();
            DataResidenceIncomeModel model = (DataResidenceIncomeModel) obj;
            dataResidenceIncome.setId(model.getId());
            dataResidenceIncome.setTownId(model.getTownId());
            dataResidenceIncome.setVillage(model.getVillage());
            dataResidenceIncome.setTown(model.getTown());
            dataResidenceIncome.setVillageCollectiveIncome(model.getVillageCollectiveIncome());
            dataResidenceIncome.setToalIncome(model.getToalIncome());
            dataResidenceIncome.setCanUseIncome(model.getCanUseIncome());
            dataResidenceIncome.setDividend(model.getDividend());
            dataResidenceIncome.setYear(model.getYear());

            dataResidenceIncomeRepository.saveAll(list);
        }
    }
}
