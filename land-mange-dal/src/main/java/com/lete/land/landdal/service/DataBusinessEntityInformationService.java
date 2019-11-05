package com.lete.land.landdal.service;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataBusinessEntityInformation;
import com.lete.land.landdal.repository.DataBusinessEntityInformationRepository;
import com.lete.land.landdal.vo.business.BusinessAnalysisChartVO;
import com.lete.land.landdal.vo.business.SummaryAnalysisVO;
import com.lete.land.landdal.vo.excelModel.DataBusinessEntityInformationModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.util.*;
import java.util.stream.Collectors;

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
            for (Object obj : modelList) {
                DataBusinessEntityInformation dataBusinessEntityInformation = new DataBusinessEntityInformation();
                DataBusinessEntityInformationModel model = (DataBusinessEntityInformationModel) obj;
                String uuid = UUID.randomUUID().toString().replace("-", "");
                dataBusinessEntityInformation.setId(uuid);
                dataBusinessEntityInformation.setTownId(model.getTownId());
                dataBusinessEntityInformation.setPlotNumber(model.getPlotNumber());
                dataBusinessEntityInformation.setContractedArea(model.getContractedArea());
//                if ("东渚镇".equals(model.getTown())) {
//                    dataBusinessEntityInformation.setTownId(5);
//                } else if ("通安镇".equals(model.getTown())) {
//                    dataBusinessEntityInformation.setTownId(4);
//                } else if ("浒墅关镇".equals(model.getTown())) {
//                    dataBusinessEntityInformation.setTownId(3);
//                } else if ("镇湖".equals(model.getTown())) {
//                    dataBusinessEntityInformation.setTownId(2);
//                }
                dataBusinessEntityInformation.setOperatorName(model.getOperatorName());
                dataBusinessEntityInformation.setIdCard(model.getIdCard());
                dataBusinessEntityInformation.setYear("2019");
                dataBusinessEntityInformation.setOperatorType(model.getOperatorType());
                dataBusinessEntityInformation.setTown(model.getTown());
                dataBusinessEntityInformation.setVillage(model.getVillage());
                list.add(dataBusinessEntityInformation);
            }
        } catch (Exception e) {
            System.out.println("日期类型转换错误");
        }

        dataBusinessEntityInformationRepository.saveAll(list);
    }

    // 经营主体分析的时候，将所有数据展出
    public Page<DataBusinessEntityInformation> getDataBusinessEntityInformation(String townId, String town, String village, String year, String operatorType, String operatorName, Pageable pageable) {
        return dataBusinessEntityInformationRepository.findAll((Specification<DataBusinessEntityInformation>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();
            if (!StringUtils.isEmpty(town)) {
                predicates.add(criteriaBuilder.like(root.get("town"), "%" + town + "%"));
            }

            if (!StringUtils.isEmpty(year)) {
                predicates.add(criteriaBuilder.equal(root.get("year"), year));
            }
            if (!StringUtils.isEmpty(village)) {
                predicates.add(criteriaBuilder.equal(root.get("village"), village));
            }
            if (!StringUtils.isEmpty(operatorType)) {
                predicates.add(criteriaBuilder.equal(root.get("operatorType"), operatorType));
            }

            if (!StringUtils.isEmpty(operatorName)) {
                predicates.add(criteriaBuilder.equal(root.get("operatorName"), operatorName));
            }

            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        }, pageable);
    }

    public Result save() {
        DataBusinessEntityInformation dataBusinessEntityInformation = new DataBusinessEntityInformation();
        dataBusinessEntityInformation.setTown("什么镇");
        try {
            dataBusinessEntityInformationRepository.save(dataBusinessEntityInformation);
            return ResultFactory.buildSuccessResult("保存成功");
        } catch (Exception e) {
            //  System.out.println(e);
            return ResultFactory.buildFailResult("保存失败");
        }
    }

    public Result delete(String id) {
        try {
            dataBusinessEntityInformationRepository.deleteById(id);
            return ResultFactory.buildSuccessResult("保存成功");
        } catch (Exception e) {
            return ResultFactory.buildFailResult("保存失败");
        }
    }
//// 经营主体分析
    public Page<SummaryAnalysisVO> getSummaryAnalysis(Integer townId, String year, Pageable pageable) {
        Page<SummaryAnalysisVO> data = dataBusinessEntityInformationRepository.getVillagePageByTown(townId, year, pageable);//所有村
        data.getContent().forEach(summaryAnalysisVO -> {
            Long reatalCount = dataBusinessEntityInformationRepository.countByOperatorTypeAndVillageLike(2, "%" + summaryAnalysisVO.getVillage() + "%"); // 租聘者数量
            Double retalMangeArea = dataBusinessEntityInformationRepository.summaryArea(2,"%" + summaryAnalysisVO.getVillage() + "%"); // 租凭者面积
            if(retalMangeArea != null) {
                summaryAnalysisVO.setRentalMangeArea(retalMangeArea);
            }
            summaryAnalysisVO.setRentalMangeCount(reatalCount);

            Long selfMangeCount = dataBusinessEntityInformationRepository.countByOperatorTypeAndVillageLike(0, "%" + summaryAnalysisVO.getVillage() + "%");
            Double selfMangeArea = dataBusinessEntityInformationRepository.summaryArea(0,"%" + summaryAnalysisVO.getVillage() + "%");
            if(selfMangeArea != null) {
                summaryAnalysisVO.setSelfMangeArea(selfMangeArea);
            }
            summaryAnalysisVO.setSelfMangeCount(selfMangeCount);

            Long villageMangeCount = dataBusinessEntityInformationRepository.countByOperatorTypeAndVillageLike(1, "%" + summaryAnalysisVO.getVillage() + "%");
            Double villageMangeArea = dataBusinessEntityInformationRepository.summaryArea(1,"%" + summaryAnalysisVO.getVillage() + "%");
            if(villageMangeArea != null) {
                summaryAnalysisVO.setVillageMangeArea(villageMangeArea);
            }
            summaryAnalysisVO.setVillageMangeCount(villageMangeCount);
        });
        return data;
    }

    //经营主体分析表
    public List<BusinessAnalysisChartVO> getCharts(Integer townId, String village, String year) {
        List<DataBusinessEntityInformation> list = dataBusinessEntityInformationRepository.findAll((Specification<DataBusinessEntityInformation>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();
            if (townId != null) {
                predicates.add(criteriaBuilder.equal(root.get("townId"),townId));
            }
            if (!StringUtils.isEmpty(year)) {
                predicates.add(criteriaBuilder.equal(root.get("year"), year));
            }
            if (!StringUtils.isEmpty(village)) {
                predicates.add(criteriaBuilder.equal(root.get("village"), village));
            }
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        });

        try {
            Map<Integer,List<DataBusinessEntityInformation>> data = list.stream().collect(Collectors.groupingBy(DataBusinessEntityInformation::getOperatorType));
            if(data.size() == 3) {
                return BusinessAnalysisChartVO.buildChartList(data.get(0).size(),data.get(1).size(),data.get(2).size());
            } else {
                return BusinessAnalysisChartVO.buildChartList(data.get(0).size(),data.get(1).size(),0);
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        return null;
    }




}
