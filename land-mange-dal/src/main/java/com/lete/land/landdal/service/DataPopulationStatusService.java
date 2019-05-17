package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataPopulationStatus;
import com.lete.land.landdal.repository.DataPopulationStatusRepository;
import com.lete.land.landdal.vo.excelModel.DataPopulationStatusModel;
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
public class DataPopulationStatusService {
    @Resource
    private DataPopulationStatusRepository dataPopulationStatusRepository;

    public Page<DataPopulationStatus> getDataPopulationStatusPage(String townId, String village, String year, Pageable pageable) {
        return dataPopulationStatusRepository.findAll((Specification<DataPopulationStatus>) (root, criteriaQuery, criteriaBuilder) -> {
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

    public Result save(DataPopulationStatus dataPopulationStatus) {
        try {
            dataPopulationStatusRepository.save(dataPopulationStatus);
            return ResultFactory.buildSuccessResult("保存成功");
        } catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }

    }

    public Result delete(String id) {
        try {
            dataPopulationStatusRepository.deleteById(id);
            return ResultFactory.buildSuccessResult("保存成功");
        } catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    public void transferAndSave(List<Object> modelList, String year, String townId) {
        List<DataPopulationStatus> list = new ArrayList<>();
        for (Object obj : modelList) {
            DataPopulationStatus dataPopulationStatus = new DataPopulationStatus();
            DataPopulationStatusModel model = (DataPopulationStatusModel) obj;
            dataPopulationStatus.setId(model.getId());
            dataPopulationStatus.setTownId(model.getTownId());
            dataPopulationStatus.setVillage(model.getVillage());
            dataPopulationStatus.setTown(model.getTown());
            dataPopulationStatus.setTotalRegisteredPop(model.getTotalRegisteredPop());
            dataPopulationStatus.setTotalResidentPop(model.getTotalResidentPop());
            dataPopulationStatus.setTotalNumReg(model.getTotalNumReg());
            dataPopulationStatus.setTotalNumMigrants(model.getTotalNumMigrants());
            dataPopulationStatus.setNrcmInsurance(model.getNrcmInsurance());
            dataPopulationStatus.setPensionInsurance(model.getPensionInsurance());
            dataPopulationStatus.setMlarResidents(model.getMlarResidents());
            dataPopulationStatus.setNrfs(model.getNrfs());
            dataPopulationStatus.setHouseholdsNum(model.getHouseholdsNum());
            dataPopulationStatus.setRiPopulation(model.getRiPopulation());
            dataPopulationStatus.setHpNum(model.getHpNum());
            dataPopulationStatus.setScaleGrowers(model.getScaleGrowers());
            dataPopulationStatus.setDividend(model.getDividend());
            dataPopulationStatus.setYear(model.getYear());
            list.add(dataPopulationStatus);
        }
        dataPopulationStatusRepository.saveAll(list);
    }
}
