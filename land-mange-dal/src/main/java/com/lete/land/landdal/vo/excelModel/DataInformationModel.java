package com.lete.land.landdal.vo.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.util.Date;

public class DataInformationModel extends BaseRowModel {
    @ExcelProperty(value = "序号",index = 0)
    private String id;
    @ExcelProperty(value = "姓名",index = 1)
    private String name;
    @ExcelProperty(value = "身份证号",index = 2)
    private String id_card;
    @ExcelProperty(value = "性别",index = 3)
    private String sex;
    @ExcelProperty(value = "出生日期",index = 4)
    private Date bornDate;
    @ExcelProperty(value = "地籍编号",index = 5)
    private String cadastralNum;
    @ExcelProperty(value = "所在镇",index = 6)
    private String town;
    @ExcelProperty(value = "所在村",index = 7)
    private String village;
    @ExcelProperty(value = "社保类型",index = 8)
    private Integer socialSecurityType;
    @ExcelProperty(value = "统计年份",index = 9)
    private String year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getCadastralNum() {
        return cadastralNum;
    }

    public void setCadastralNum(String cadastralNum) {
        this.cadastralNum = cadastralNum;
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

    public Integer getSocialSecurityType() {
        return socialSecurityType;
    }

    public void setSocialSecurityType(Integer socialSecurityType) {
        this.socialSecurityType = socialSecurityType;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
