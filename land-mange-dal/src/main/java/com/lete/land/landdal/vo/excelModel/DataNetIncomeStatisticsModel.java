package com.lete.land.landdal.vo.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DataNetIncomeStatisticsModel extends BaseRowModel {
    @ExcelProperty(value = "序号",index = 0)
    private String id;
    @ExcelProperty(value = "地块编号",index = 1)
    private String plotNumber;
    @ExcelProperty(value = "所在镇",index = 2)
    private String town;
    @ExcelProperty(value = "所在村",index = 3)
    private String village;
    @ExcelProperty(value = "承包地面积",index = 4)
    private Integer contractedArea;
    @ExcelProperty(value = "水稻田",index = 5)
    private String riceFields;
    @ExcelProperty(value = "蔬菜地",index = 6)
    private String vegetableField;
    @ExcelProperty(value = "果园",index = 7)
    private String orchard;
    @ExcelProperty(value = "鱼塘",index = 8)
    private String fishPond;
    @ExcelProperty(value = "其它",index = 9)
    private String qita;
    @ExcelProperty(value = "经营者姓名或名称",index = 10)
    private String operatorName;
    @ExcelProperty(value = "经营者类型",index = 11)
    private Integer operatorType;
    @ExcelProperty(value = "净收益总额",index = 12)
    private Integer totalNetIncome;
    @ExcelProperty(value = "统计年份",index = 13)
    private String year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getContractedArea() {
        return contractedArea;
    }

    public void setContractedArea(Integer contractedArea) {
        this.contractedArea = contractedArea;
    }

    public String getRiceFields() {
        return riceFields;
    }

    public void setRiceFields(String riceFields) {
        this.riceFields = riceFields;
    }

    public String getVegetableField() {
        return vegetableField;
    }

    public void setVegetableField(String vegetableField) {
        this.vegetableField = vegetableField;
    }

    public String getOrchard() {
        return orchard;
    }

    public void setOrchard(String orchard) {
        this.orchard = orchard;
    }

    public String getFishPond() {
        return fishPond;
    }

    public void setFishPond(String fishPond) {
        this.fishPond = fishPond;
    }

    public String getQita() {
        return qita;
    }

    public void setQita(String qita) {
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

    public Integer getTotalNetIncome() {
        return totalNetIncome;
    }

    public void setTotalNetIncome(Integer totalNetIncome) {
        this.totalNetIncome = totalNetIncome;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
