package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataHolderInformation;
import com.lete.land.landdal.repository.DataHolderInformationRepository;
import com.lete.land.landdal.vo.excelModel.DataHolderInformationModel;
import com.lete.land.landdal.vo.dataCenter.ShareEnum;
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
public class DataHolderInformationService {
    @Resource
    private DataHolderInformationRepository dataHolderInformationRepository;
    public Page<DataHolderInformation> getDataHolderInformationPage(String townId, String village, String year, Pageable pageable) {
        return   dataHolderInformationRepository.findAll((Specification<DataHolderInformation>)(root, criteriaQuery, criteriaBuilder) -> {
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

    public Result save(DataHolderInformation dataHolderInformation) {
        try{
            dataHolderInformationRepository.save(dataHolderInformation);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }

    }

    public Result delete(String id) {
        try{
            dataHolderInformationRepository.deleteById(id);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    public void transferAndSave(List<Object> modelList, String year, String townId) {
        List<DataHolderInformation> list = new ArrayList<>();
        for(Object obj : modelList){
            DataHolderInformation dataHolderInformation = new DataHolderInformation();
            DataHolderInformationModel model = (DataHolderInformationModel) obj;
            dataHolderInformation.setId(model.getId());
            dataHolderInformation.setTownId(model.getTownId());
            dataHolderInformation.setShareholderName(model.getShareholderName());
            dataHolderInformation.setShareholderNum(model.getShareholderNum());
            dataHolderInformation.setIdCard(model.getIdCard());
            dataHolderInformation.setTel(model.getTel());
            dataHolderInformation.setFamilyNum(model.getFamilyNum());
            dataHolderInformation.setTown(model.getTown());
            dataHolderInformation.setVillage(model.getVillage());
            dataHolderInformation.setToalStock(model.getToalStock());
            if (model.getStockType().equals(ShareEnum.City.getDesc())){
                dataHolderInformation.setStockType(ShareEnum.City.getIdnex());
            }else {
                dataHolderInformation.setStockType(ShareEnum.Vill.getIdnex());
            }
            dataHolderInformation.setJoinDate(model.getJoinDate());
            dataHolderInformation.setYear(model.getYear());
            list.add(dataHolderInformation);
        }

        dataHolderInformationRepository.saveAll(list);
    }
}
