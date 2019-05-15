package com.lete.land.landdal.vo.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;


import java.util.Date;

public class DataBusinessEntityInformationModel extends BaseRowModel {
    @ExcelProperty(value = "序号", index = 0)
    private String id;
    @ExcelProperty(value = "镇编号", index = 1)
    private String townId;
    @ExcelProperty(value = "地块编号", index = 2)
    private String plotNumber;
    @ExcelProperty(value = "所在镇", index = 3)
    private String town;
    @ExcelProperty(value = "所在村", index = 4)
    private String village;
    @ExcelProperty(value = "承包地面积", index = 5)
    private Double contractedArea;
    @ExcelProperty(value = "经营者姓名或名称", index = 6)
    private String operatorName;
    @ExcelProperty(value = "身份证号码或组织机构代码", index = 7)
    private String idCard;
    @ExcelProperty(value = "经营者类型", index = 8)
    private Integer operatorType;
    @ExcelProperty(value = "起始日期", index = 9)
    private Date startDate;
    @ExcelProperty(value = "经营期限", index = 10)
    private String operatingPeriod;
    @ExcelProperty(value = "统计年份", index = 11)
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

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getOperatingPeriod() {
        return operatingPeriod;
    }

    public void setOperatingPeriod(String operatingPeriod) {
        this.operatingPeriod = operatingPeriod;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
