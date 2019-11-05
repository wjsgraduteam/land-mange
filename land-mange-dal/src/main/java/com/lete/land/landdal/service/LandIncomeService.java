package com.lete.land.landdal.service;

import com.lete.land.landdal.entity.DataNetIncomeStatistics;
import com.lete.land.landdal.entity.DataResidenceIncome;
import com.lete.land.landdal.repository.DataNetIncomeStatisticsRepository;
import com.lete.land.landdal.repository.DataResidenceIncomeRepository;
import com.lete.land.landdal.vo.business.FarmChartVO;
import com.lete.land.landdal.vo.business.FarmTypeChartVO;
import com.lete.land.landdal.vo.business.FarmTypeVO;
import com.lete.land.landdal.vo.business.YearAnalysisChartVO;
import com.lete.land.landdal.vo.dataCenter.OperatorTypeEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.Column;
import javax.persistence.criteria.Predicate;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by WJ on 2019/5/18 0018
 */
@Service
public class LandIncomeService {
    @Resource
    private DataNetIncomeStatisticsRepository dataNetIncomeStatisticsRepository;

    @Resource
    private DataResidenceIncomeRepository dataResidenceIncomeRepository;

    //分页信息
    public Page<FarmTypeVO> getFarmTypePage(String townId, String village, String year, Pageable pageable) {
        return new PageImpl<FarmTypeVO>(getFarmTypeVOList(townId, village, year), pageable, 3);
    }

    //年度收益分析——按年份分析三种类型的总收入
    public List<YearAnalysisChartVO>   getYearAnalysisList(String townId, String village, String year) {
        List<DataNetIncomeStatistics> list = getDataNetIncomeStatisticsList(townId, village, year);
        List<YearAnalysisChartVO> yearChartList = new ArrayList<>();
        try {
            Map<String, List<DataNetIncomeStatistics>> data = list.stream().collect(Collectors.groupingBy(e -> fetchGroupKey(e)));

            List<Object> yearList = dataNetIncomeStatisticsRepository.findYear();
            yearList.forEach(yearKey -> {
                YearAnalysisChartVO yearAnalysisChartVO = new YearAnalysisChartVO();
                yearAnalysisChartVO.setYear(yearKey.toString());
                // 个人类型
                String mapKey = OperatorTypeEnum.Geti.getIdnex() + "#" + yearKey.toString();
                yearAnalysisChartVO.setSelfTotalIncome(getTotalIncome(data.get(mapKey)));
                // 村类型
                mapKey = OperatorTypeEnum.CunJiTi.getIdnex() + "#" + yearKey.toString();
                yearAnalysisChartVO.setVillageTotalIncome(getTotalIncome(data.get(mapKey)));
                // 租凭类型
                mapKey = OperatorTypeEnum.ZuLin.getIdnex() + "#" + yearKey.toString();
                yearAnalysisChartVO.setRetalTotalIncome(getTotalIncome(data.get(mapKey)));

                yearChartList.add(yearAnalysisChartVO);
            });

            return yearChartList;
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        return null;
    }

    public Double getTotalIncome(List<DataNetIncomeStatistics> list) {
        Double totalIncome = 0d;
        for(DataNetIncomeStatistics dataNetIncomeStatistics: list) {
            totalIncome += dataNetIncomeStatistics.getTotalNetIncome();
        }

        return  totalIncome;
    }


    private  String fetchGroupKey(DataNetIncomeStatistics user){
        return user.getOperatorType() +"#"+ user.getYear();
    }

    //农用地收益分析 计算农业用地使用情况
    public FarmChartVO getFarmTypeChartList(String townId, String village, String year) {
        List<FarmTypeVO> list = getFarmTypeVOList(townId, village, year);

        FarmTypeChartVO rice = new FarmTypeChartVO("水稻田");
        FarmTypeChartVO vegetable = new FarmTypeChartVO("蔬菜地");
        FarmTypeChartVO orchard = new FarmTypeChartVO("果园");
        FarmTypeChartVO fishPond = new FarmTypeChartVO("鱼塘");
        FarmTypeChartVO other = new FarmTypeChartVO("其他");

        list.forEach(farmTypeVO -> {
            if (farmTypeVO.getOperatorType().equals(OperatorTypeEnum.Geti.getDesc())) {
                rice.setSelfMangeArea(farmTypeVO.getRiceFileds());
                vegetable.setSelfMangeArea(farmTypeVO.getVegetableFields());
                orchard.setSelfMangeArea(farmTypeVO.getOrchardFields());
                fishPond.setSelfMangeArea(farmTypeVO.getFishPondFields());
                other.setSelfMangeArea(farmTypeVO.getOtherFields());
            } else if (farmTypeVO.getOperatorType().equals(OperatorTypeEnum.CunJiTi.getDesc())) {
                rice.setVillageArea(farmTypeVO.getRiceFileds());
                vegetable.setVillageArea(farmTypeVO.getVegetableFields());
                orchard.setVillageArea(farmTypeVO.getOrchardFields());
                fishPond.setVillageArea(farmTypeVO.getFishPondFields());
                other.setVillageArea(farmTypeVO.getOtherFields());
            } else if (farmTypeVO.getOperatorType().equals(OperatorTypeEnum.ZuLin.getDesc())) {
                rice.setRetalArea(farmTypeVO.getRiceFileds());
                vegetable.setRetalArea(farmTypeVO.getVegetableFields());
                orchard.setRetalArea(farmTypeVO.getOrchardFields());
                fishPond.setRetalArea(farmTypeVO.getFishPondFields());
                other.setRetalArea(farmTypeVO.getOtherFields());
            }
        });

        List<FarmTypeChartVO> data = new ArrayList<>();
        data.add(rice);
        data.add(vegetable);
        data.add(orchard);
        data.add(fishPond);
        data.add(other);

        return FarmChartVO.buildFarmChartVO(list,data);
    }

    public List<DataNetIncomeStatistics> getDataNetIncomeStatisticsList(String townId, String village, String year) {
        List<DataNetIncomeStatistics> list = dataNetIncomeStatisticsRepository.findAll((Specification<DataNetIncomeStatistics>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();
            if (StringUtils.isNotEmpty(townId)) {
                predicates.add(criteriaBuilder.equal(root.get("townId"), townId));
            }
            if (StringUtils.isNotEmpty(village)) {
                predicates.add(criteriaBuilder.equal(root.get("village"), village));
            }
            if (StringUtils.isNotEmpty(year)) {
                predicates.add(criteriaBuilder.equal(root.get("year"), year));
            }
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        });

        return list;
    }

    // 根据经营者类型刷选
    public List<FarmTypeVO> getFarmTypeVOList(String townId, String village, String year) {
        List<DataNetIncomeStatistics> list = getDataNetIncomeStatisticsList(townId, village, year);
        List<FarmTypeVO> content = new ArrayList<>();

        try {
            Map<Integer, List<DataNetIncomeStatistics>> data = list.stream().collect(Collectors.groupingBy(DataNetIncomeStatistics::getOperatorType));
            content.add(getFarmTypeVo(0, data));
            content.add(getFarmTypeVo(1, data));
            content.add(getFarmTypeVo(2, data));
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        return content;
    }

    // 根据operator类型分类
    public FarmTypeVO getFarmTypeVo(Integer operatorType, Map<Integer, List<DataNetIncomeStatistics>> data) {
        FarmTypeVO farmTypeVo = new FarmTypeVO();
        Double riceFileds = 0d;
        Double vegetableFields = 0d;
        Double orchardFields = 0d;
        Double fishPondFields = 0d;
        Double otherFields = 0d;
        Double totalIncome = 0d;

        for (DataNetIncomeStatistics dataNetIncomeStatistics : data.get(operatorType)) {
            riceFileds += dataNetIncomeStatistics.getRiceFields();
            vegetableFields += dataNetIncomeStatistics.getVegetableField();
            orchardFields += dataNetIncomeStatistics.getOrchard();
            fishPondFields += dataNetIncomeStatistics.getFishPond();
            otherFields += dataNetIncomeStatistics.getQita();
            totalIncome += dataNetIncomeStatistics.getTotalNetIncome();
        }
        if (operatorType.equals(0)) {
            farmTypeVo.setOperatorType("个体经营");
        } else if (operatorType.equals(1)) {
            farmTypeVo.setOperatorType("村集体经营");
        } else if (operatorType.equals(2)) {
            farmTypeVo.setOperatorType("租凭经营");
        }

        farmTypeVo.setRiceFileds(riceFileds);
        farmTypeVo.setVegetableFields(vegetableFields);
        farmTypeVo.setOrchardFields(orchardFields);
        farmTypeVo.setFishPondFields(fishPondFields);
        farmTypeVo.setOtherFields(otherFields);

        double averageIncome = totalIncome/(riceFileds + vegetableFields + orchardFields + fishPondFields + otherFields);
        DecimalFormat df = new DecimalFormat("#.00");
        farmTypeVo.setAverageIncome(df.format(averageIncome));

        return farmTypeVo;
    }

    public Page<DataNetIncomeStatistics> getNetIncomePage(String townId, String village, String year, String plotNumber, Pageable pageable) {
        return dataNetIncomeStatisticsRepository.findAll((Specification<DataNetIncomeStatistics>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();
            if (StringUtils.isNotEmpty(townId)) {
                predicates.add(criteriaBuilder.equal(root.get("townId"), townId));
            }
            if (StringUtils.isNotEmpty(village)) {
                predicates.add(criteriaBuilder.equal(root.get("village"), village));
            }
            if (StringUtils.isNotEmpty(year)) {
                predicates.add(criteriaBuilder.equal(root.get("year"), year));
            }
            if (StringUtils.isNotEmpty(plotNumber)) {
                predicates.add(criteriaBuilder.equal(root.get("plotNumber"), plotNumber));
            }
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        }, pageable);
    }

    // 增收效果分析
    public List<DataResidenceIncome> getResidenceChart(String townId, String village) {
        List<DataResidenceIncome> data = dataResidenceIncomeRepository.findAll((Specification<DataResidenceIncome>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new LinkedList<>();
            if (StringUtils.isNotEmpty(townId)) {
                predicates.add(criteriaBuilder.equal(root.get("townId"), townId));
            }
            if (StringUtils.isNotEmpty(village)) {
                predicates.add(criteriaBuilder.equal(root.get("village"), village));
            }

            criteriaQuery.orderBy(criteriaBuilder.asc(root.get("year")));
            Predicate[] array = new Predicate[predicates.size()];
            return criteriaBuilder.and(predicates.toArray(array));
        });

        if(StringUtils.isEmpty(townId)) {
          return   getTotalYearData(data);
        }

        return data;
    }

    private List<DataResidenceIncome> getTotalYearData(List<DataResidenceIncome> data) {
        Map<String, List<DataResidenceIncome>> map = data.stream().collect(Collectors.groupingBy(DataResidenceIncome::getYear));
        List<DataResidenceIncome> result = new ArrayList<>();
        result.add(getYearData(map.get("2015"),"2015"));
        result.add(getYearData(map.get("2016"),"2016"));
        result.add(getYearData(map.get("2017"),"2017"));
        result.add(getYearData(map.get("2018"),"2018"));
        result.add(getYearData(map.get("2019"),"2019"));

        return result;
    }

    public DataResidenceIncome getYearData(List<DataResidenceIncome> list,String year) {
        DataResidenceIncome yearData = new DataResidenceIncome();
        Double villageCollectiveIncome = 0D;
        Double toalIncome= 0D;
        Double canUseIncome= 0D;
        Double dividend= 0D;
        for(DataResidenceIncome dataResidenceIncome : list) {
            villageCollectiveIncome += dataResidenceIncome.getVillageCollectiveIncome();
            toalIncome += dataResidenceIncome.getToalIncome();
            canUseIncome += dataResidenceIncome.getCanUseIncome();
            dividend += dataResidenceIncome.getDividend();
        }

        yearData.setYear(year);
        yearData.setCanUseIncome(canUseIncome);
        yearData.setDividend(dividend);
        yearData.setToalIncome(toalIncome);
        yearData.setVillageCollectiveIncome(villageCollectiveIncome);

        return yearData;
    }
}
