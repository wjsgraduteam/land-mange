package com.lete.land.landdal.vo.business;

import java.io.Serializable;

/**
 * Created by WJ on 2019/5/18 0018
 */
public class FarmTypeChartVO implements Serializable {
    private static final long serialVersionUID = 5629912158096891763L;
    private String landType;

    private Double selfMangeArea;

    private Double villageArea;

    private Double retalArea;

    private Double totalIncome;

    public static FarmTypeChartVO buildChartData(String landType,Double selfMangeArea,Double villageArea,Double retalArea) {
        return new FarmTypeChartVO(landType, selfMangeArea, villageArea, retalArea);
    }

    private FarmTypeChartVO(String landType, Double selfMangeArea, Double villageArea, Double retalArea) {
        this.landType = landType;
        this.selfMangeArea = selfMangeArea;
        this.villageArea = villageArea;
        this.retalArea = retalArea;
    }
    public FarmTypeChartVO(String landType) {
        this.landType = landType;
    }

    public String getLandType() {
        return landType;
    }

    public void setLandType(String landType) {
        this.landType = landType;
    }

    public Double getSelfMangeArea() {
        return selfMangeArea;
    }

    public void setSelfMangeArea(Double selfMangeArea) {
        this.selfMangeArea = selfMangeArea;
    }

    public Double getVillageArea() {
        return villageArea;
    }

    public void setVillageArea(Double villageArea) {
        this.villageArea = villageArea;
    }

    public Double getRetalArea() {
        return retalArea;
    }

    public void setRetalArea(Double retalArea) {
        this.retalArea = retalArea;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }
}
