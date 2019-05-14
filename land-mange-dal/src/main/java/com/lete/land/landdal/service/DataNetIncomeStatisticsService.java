package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;

import com.lete.land.landdal.entity.DataNetIncomeStatistics;
import com.lete.land.landdal.repository.DataNetIncomeStatisticsRepository;
import com.lete.land.landdal.vo.dataCenter.OperatorTypeEnum;

import com.lete.land.landdal.vo.excelModel.DataNetIncomeStatisticsModel;
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
public class DataNetIncomeStatisticsService {
    @Resource
    private DataNetIncomeStatisticsRepository dataNetIncomeStatisticsRepository;

    public Page<DataNetIncomeStatistics> getDataNetIncomeStatisticsPage(String townId, String village, String year, Pageable pageable) {
        return dataNetIncomeStatisticsRepository.findAll((Specification<DataNetIncomeStatistics>) (root, criteriaQuery, criteriaBuilder) -> {
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

    public Result save(DataNetIncomeStatistics dataNetIncomeStatistics) {
        try {
            dataNetIncomeStatisticsRepository.save(dataNetIncomeStatistics);
            return ResultFactory.buildSuccessResult("保存成功");
        } catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    public Result delete(String id) {
        try {
            dataNetIncomeStatisticsRepository.deleteById(id);
            return ResultFactory.buildSuccessResult("保存成功");
        } catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    public void transferAndSave(List<Object> modelList, String year, String townId) {
        List<DataNetIncomeStatistics> list = new ArrayList<>();

        try {
            for (Object obj : modelList) {
                DataNetIncomeStatistics dataNetIncomeStatistics = new DataNetIncomeStatistics();
                DataNetIncomeStatisticsModel model = (DataNetIncomeStatisticsModel) obj;

                dataNetIncomeStatistics.setId(model.getId());
                dataNetIncomeStatistics.setTownId(model.getTownId());
                dataNetIncomeStatistics.setPlotNumber(model.getPlotNumber());
                dataNetIncomeStatistics.setTown(model.getTown());
                dataNetIncomeStatistics.setVillage(model.getVillage());
                dataNetIncomeStatistics.setContractedArea(model.getContractedArea());
                dataNetIncomeStatistics.setRiceFields(model.getRiceFields());
                dataNetIncomeStatistics.setVegetableField(model.getVegetableField());
                dataNetIncomeStatistics.setOrchard(model.getOrchard());
                dataNetIncomeStatistics.setFishPond(model.getFishPond());
                dataNetIncomeStatistics.setQita(model.getQita());
                dataNetIncomeStatistics.setOperatorName(model.getOperatorName());
                if (model.getOperatorType().equals(OperatorTypeEnum.Geti.getDesc())) {
                    dataNetIncomeStatistics.setOperatorType(OperatorTypeEnum.Geti.getIdnex());
                } else if (model.getOperatorType().equals(OperatorTypeEnum.CunJiTi.getIdnex())) {
                    dataNetIncomeStatistics.setOperatorType(OperatorTypeEnum.CunJiTi.getIdnex());
                } else if (model.getOperatorType().equals(OperatorTypeEnum.ZuLin.getIdnex())) {
                    dataNetIncomeStatistics.setOperatorType(OperatorTypeEnum.ZuLin.getIdnex());
                }
                dataNetIncomeStatistics.setYear(model.getYear());
                list.add(dataNetIncomeStatistics);
            }
        } catch (Exception e) {
            System.out.println("错误");
        }
        dataNetIncomeStatisticsRepository.saveAll(list);
    }
}
