package com.lete.land.landdal.vo.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DataNetIncomeStatisticsModel extends BaseRowModel {
    @ExcelProperty(value = "序号",index = 0)
    private String id;
    @ExcelProperty(value = "镇编号",index = 1)
    private String townId;
    @ExcelProperty(value = "地块编号",index = 2)
    private String plotNumber;
    @ExcelProperty(value = "所在镇",index = 3)
    private String town;
    @ExcelProperty(value = "所在村",index = 4)
    private String village;
    @ExcelProperty(value = "承包地面积",index = 5)
    private Double contractedArea;
    @ExcelProperty(value = "水稻田",index = 6)
    private Double riceFields;
    @ExcelProperty(value = "蔬菜地",index = 7)
    private Double vegetableField;
    @ExcelProperty(value = "果园",index = 8)
    private Double orchard;
    @ExcelProperty(value = "鱼塘",index = 9)
    private Double fishPond;
    @ExcelProperty(value = "其它",index = 10)
    private Double qita;
    @ExcelProperty(value = "经营者姓名或名称",index = 11)
    private String operatorName;
    @ExcelProperty(value = "经营者类型",index = 12)
    private Integer operatorType;
    @ExcelProperty(value = "净收益总额",index = 13)
    private Double totalNetIncome;
    @ExcelProperty(value = "统计年份",index = 14)
    private String year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

    public String getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(String plotNumber) {
        this.plotNumber = plotNumber;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public Double getContractedArea() {
        return contractedArea;
    }

    public void setContractedArea(Double contractedArea) {
        this.contractedArea = contractedArea;
    }

    public Double getRiceFields() {
        return riceFields;
    }

    public void setRiceFields(Double riceFields) {
        this.riceFields = riceFields;
    }

    public Double getVegetableField() {
        return vegetableField;
    }

    public void setVegetableField(Double vegetableField) {
        this.vegetableField = vegetableField;
    }

    public Double getOrchard() {
        return orchard;
    }

    public void setOrchard(Double orchard) {
        this.orchard = orchard;
    }

    public Double getFishPond() {
        return fishPond;
    }

    public void setFishPond(Double fishPond) {
        this.fishPond = fishPond;
    }

    public Double getQita() {
        return qita;
    }

    public void setQita(Double qita) {
        this.qita = qita;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Double getTotalNetIncome() {
        return totalNetIncome;
    }

    public void setTotalNetIncome(Double totalNetIncome) {
        this.totalNetIncome = totalNetIncome;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
