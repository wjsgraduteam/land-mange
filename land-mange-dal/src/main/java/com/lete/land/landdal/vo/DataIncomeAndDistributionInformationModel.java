package com.lete.land.landdal.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DataIncomeAndDistributionInformationModel extends BaseRowModel {
    @ExcelProperty(value = "序号",index = 0)
    private String id;
    @ExcelProperty(value = "镇编号",index = 1)
    private String townId;
    @ExcelProperty(value = "编号",index = 2)
    private String number;
    @ExcelProperty(value = "镇",index = 3)
    private String town;
    @ExcelProperty(value = "村",index = 4)
    private String village;
    @ExcelProperty(value = "净收益总额",index = 5)
    private Integer totalNetIncome;
    @ExcelProperty(value = "土地经营及租赁收入",index = 6)
    private Integer lmAndReIncome;
    @ExcelProperty(value = "村集体分配额",index = 7)
    private Integer vca;
    @ExcelProperty(value = "股东分配额",index = 8)
    private Integer shareholderAllocation;
    @ExcelProperty(value = "本期留存额",index = 9)
    private Integer currentRetention;
    @ExcelProperty(value = "上期结转额",index = 10)
    private Integer lta;
    @ExcelProperty(value = "农村型股份总数",index = 11)
    private Integer rsTolNum;
    @ExcelProperty(value = "农村型股份单价",index = 12)
    private Integer ruralUnitPrice;
    @ExcelProperty(value = "城市型股份总数",index = 13)
    private Integer csTolNum;
    @ExcelProperty(value = "城市型股份单价",index = 14)
    private Integer ctup;
    @ExcelProperty(value = "统计年份",index = 15)
    private String year;

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public Integer getTotalNetIncome() {
        return totalNetIncome;
    }

    public void setTotalNetIncome(Integer totalNetIncome) {
        this.totalNetIncome = totalNetIncome;
    }

    public Integer getLmAndReIncome() {
        return lmAndReIncome;
    }

    public void setLmAndReIncome(Integer lmAndReIncome) {
        this.lmAndReIncome = lmAndReIncome;
    }

    public Integer getVca() {
        return vca;
    }

    public void setVca(Integer vca) {
        this.vca = vca;
    }

    public Integer getShareholderAllocation() {
        return shareholderAllocation;
    }

    public void setShareholderAllocation(Integer shareholderAllocation) {
        this.shareholderAllocation = shareholderAllocation;
    }

    public Integer getCurrentRetention() {
        return currentRetention;
    }

    public void setCurrentRetention(Integer currentRetention) {
        this.currentRetention = currentRetention;
    }

    public Integer getLta() {
        return lta;
    }

    public void setLta(Integer lta) {
        this.lta = lta;
    }

    public Integer getRsTolNum() {
        return rsTolNum;
    }

    public void setRsTolNum(Integer rsTolNum) {
        this.rsTolNum = rsTolNum;
    }

    public Integer getRuralUnitPrice() {
        return ruralUnitPrice;
    }

    public void setRuralUnitPrice(Integer ruralUnitPrice) {
        this.ruralUnitPrice = ruralUnitPrice;
    }

    public Integer getCsTolNum() {
        return csTolNum;
    }

    public void setCsTolNum(Integer csTolNum) {
        this.csTolNum = csTolNum;
    }

    public Integer getCtup() {
        return ctup;
    }

    public void setCtup(Integer ctup) {
        this.ctup = ctup;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

