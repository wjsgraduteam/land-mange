package com.lete.land.landdal.vo.business;


import com.lete.land.landdal.vo.dataCenter.OperatorTypeEnum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WJ on 2019/5/18 0018
 */
public class BusinessAnalysisChartVO implements Serializable {
    private static final long serialVersionUID = -3638250375254043493L;
    private String operatorType;

    private Integer proportion;

    public static List<BusinessAnalysisChartVO>  buildChartList(Integer selfCount, Integer villageCount, Integer retalCount) {
        List<BusinessAnalysisChartVO> list = new ArrayList<>();
        list.add(new BusinessAnalysisChartVO(OperatorTypeEnum.Geti.getDesc(),selfCount));
        list.add(new BusinessAnalysisChartVO(OperatorTypeEnum.CunJiTi.getDesc(),villageCount));
        list.add(new BusinessAnalysisChartVO(OperatorTypeEnum.ZuLin.getDesc(),retalCount));
        return  list;
    }

    private BusinessAnalysisChartVO(String operatorType, Integer proportion) {
        this.operatorType = operatorType;
        this.proportion = proportion;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public Integer getProportion() {
        return proportion;
    }

    public void setProportion(Integer proportion) {
        this.proportion = proportion;
    }
}
