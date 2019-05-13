package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataLandTransfer;
import com.lete.land.landdal.repository.DataLandTransferRepository;
import com.lete.land.landdal.vo.excelModel.DataLandTransferModel;
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
public class DataLandTransferService {
    @Resource
    private DataLandTransferRepository dataLandTransferRepository;

    public Page<DataLandTransfer> getDataLandTransferPage(String townId, String village, String year, Pageable pageable) {
        return   dataLandTransferRepository.findAll((Specification<DataLandTransfer>)(root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();

            if(!StringUtils.isEmpty(year)) {
                predicates.add(criteriaBuilder.equal(root.get("year"),year));
            }
            if(!StringUtils.isEmpty(village)) {
                predicates.add(criteriaBuilder.equal(root.get("village"),year));
            }
            if(!StringUtils.isEmpty(townId)) {
                predicates.add(criteriaBuilder.equal(root.get("townId"),year));
            }
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        },pageable);

    }

    public Result save(DataLandTransfer dataLandTransfer) {

        try{
            dataLandTransferRepository.save(dataLandTransfer);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }

    }

    public Result delete(String id) {
        try{
            dataLandTransferRepository.deleteById(id);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    public void transferAndSave(List<Object> modelList, String year, String townId) {
        List<DataLandTransfer> list = new ArrayList<>();
        for(Object obj : modelList){
            DataLandTransfer dataLandTransfer = new DataLandTransfer();
            DataLandTransferModel model = (DataLandTransferModel) obj;
            dataLandTransfer.setId(model.getId());
            dataLandTransfer.setTownId(model.getTownId());
            dataLandTransfer.setTown(model.getTown());
            dataLandTransfer.setVillage(model.getVillage());
            dataLandTransfer.setAlat(model.getAlat());
            dataLandTransfer.setLatfc(model.getLatfc());
            dataLandTransfer.setLate(model.getLate());
            dataLandTransfer.setLatlh(model.getLatlh());
            dataLandTransfer.setLatoe(model.getLatoe());
            dataLandTransfer.setYear(model.getYear());

            dataLandTransferRepository.saveAll(list);
        }
    }
}
