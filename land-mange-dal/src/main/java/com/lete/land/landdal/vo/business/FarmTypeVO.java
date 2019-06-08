package com.lete.land.landdal.vo.business;

/**
 * Created by WJ on 2019/5/18 0018
 */
public class FarmTypeVO {
    private String operatorType;

    private String year;

    private Double riceFileds;

    private Double vegetableFields;

    private Double orchardFields;

    private Double fishPondFields;

    private Double otherFields;

    private String averageIncome;

    private Double totalIncome;

    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public Double getRiceFileds() {
        return riceFileds;
    }

    public void setRiceFileds(Double riceFileds) {
        this.riceFileds = riceFileds;
    }

    public Double getVegetableFields() {
        return vegetableFields;
    }

    public void setVegetableFields(Double vegetableFields) {
        this.vegetableFields = vegetableFields;
    }

    public Double getOrchardFields() {
        return orchardFields;
    }

    public void setOrchardFields(Double orchardFields) {
        this.orchardFields = orchardFields;
    }

    public Double getFishPondFields() {
        return fishPondFields;
    }

    public void setFishPondFields(Double fishPondFields) {
        this.fishPondFields = fishPondFields;
    }

    public Double getOtherFields() {
        return otherFields;
    }

    public void setOtherFields(Double otherFields) {
        this.otherFields = otherFields;
    }

    public String getAverageIncome() {
        return averageIncome;
    }

    public void setAverageIncome(String averageIncome) {
        this.averageIncome = averageIncome;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }
}
