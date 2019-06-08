package com.lete.land.landdal.vo.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.util.Date;

public class DataHolderInformationModel extends BaseRowModel {
    @ExcelProperty(value = "序号",index = 0)
    private String id;
    @ExcelProperty(value = "镇编号",index = 1)
    private String townId;
    @ExcelProperty(value = "股东姓名",index = 2)
    private String shareholderName;
    @ExcelProperty(value = "股东编号",index = 3)
    private String shareholderNum;
    @ExcelProperty(value = "身份证号",index = 4)
    private String idCard;
    @ExcelProperty(value = "联系电话",index = 5)
    private String tel;
    @ExcelProperty(value = "家庭人数",index = 6)
    private Integer familyNum;
    @ExcelProperty(value = "所在镇",index = 7)
    private String town;
    @ExcelProperty(value = "所在村",index = 8)
    private String village;
    @ExcelProperty(value = "股金总数",index = 9)
    private String toalStock;
    @ExcelProperty(value = "股份类型",index = 10)
    private Integer stockType;
    @ExcelProperty(value = "入股时间",index = 11)
    private String joinDate;
    @ExcelProperty(value = "统计年份",index = 12)
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

    public String getShareholderName() {
        return shareholderName;
    }

    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName;
    }

    public String getShareholderNum() {
        return shareholderNum;
    }

    public void setShareholderNum(String shareholderNum) {
        this.shareholderNum = shareholderNum;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getFamilyNum() {
        return familyNum;
    }

    public void setFamilyNum(Integer familyNum) {
        this.familyNum = familyNum;
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

    public String getToalStock() {
        return toalStock;
    }

    public void setToalStock(String toalStock) {
        this.toalStock = toalStock;
    }

    public Integer getStockType() {
        return stockType;
    }

    public void setStockType(Integer stockType) {
        this.stockType = stockType;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
