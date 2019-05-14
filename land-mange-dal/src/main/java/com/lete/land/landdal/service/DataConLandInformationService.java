package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataConLandInformation;
import com.lete.land.landdal.repository.DataConLandInformationRepository;
import com.lete.land.landdal.vo.excelModel.DataConLandInformationModel;
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
public class DataConLandInformationService {

    @Resource
    private DataConLandInformationRepository dataConLandInformationRepository;
    public Page<DataConLandInformation> getDataConLandInformationPage(String townId, String village, String year, Pageable pageable) {
        Page<DataConLandInformation> page =  dataConLandInformationRepository.findAll((Specification<DataConLandInformation>)(root, criteriaQuery, criteriaBuilder) -> {
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
        return  page;
    }



    public Result delete(String id) {
        try{
            dataConLandInformationRepository.deleteById(id);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    public Result save(DataConLandInformation dataConLandInformation) {
        try{
            dataConLandInformationRepository.save(dataConLandInformation);
            return ResultFactory.buildSuccessResult("保存成功");
        }catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    public void transferAndSave(List<Object> modelList, String year, String townId) {
        List<DataConLandInformation> list = new ArrayList<>();
        for(Object obj : modelList){
            DataConLandInformation dataConLandInformation = new DataConLandInformation();
            DataConLandInformationModel model = (DataConLandInformationModel) obj;
            dataConLandInformation.setId(model.getId());
            dataConLandInformation.setTownId(model.getTownId());
            dataConLandInformation.setCadastralNum(model.getCadastralNum());
            dataConLandInformation.setHrName(model.getHrName());
            dataConLandInformation.setIdCard(model.getIdCard());
            dataConLandInformation.setFamilyNum(model.getFamilyNum());
            dataConLandInformation.setConLandNum(model.getConLandNum());
            dataConLandInformation.setBackground(model.getBackground());
            dataConLandInformation.setTown(model.getTown());
            dataConLandInformation.setVillage(model.getVillage());
            dataConLandInformation.setYear(model.getYear());
            list.add(dataConLandInformation);
        }

        dataConLandInformationRepository.saveAll(list);
    }
}
