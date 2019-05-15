package com.lete.land.landdal.vo.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DataCrInformationModel extends BaseRowModel {
    @ExcelProperty(value = "序号",index = 0)
    private String id;
    @ExcelProperty(value = "镇编号",index = 1)
    private String townId;
    @ExcelProperty(value = "户籍编号",index = 2)
    private String hrNum;
    @ExcelProperty(value = "户主姓名",index = 3)
    private String hrName;
    @ExcelProperty(value = "身份证号码",index = 4)
    private String idCard;
    @ExcelProperty(value = "所在镇",index = 5)
    private String town;
    @ExcelProperty(value = "所在村",index = 6)
    private String village;
    @ExcelProperty(value = "特色田园村庄农户",index = 7)
    private String isSpecial;
    @ExcelProperty(value = "统计年份",index = 8)
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

    public String getHrNum() {
        return hrNum;
    }

    public void setHrNum(String hrNum) {
        this.hrNum = hrNum;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
