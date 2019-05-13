package com.lete.land.landdal.vo.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DataConLandInformationModel extends BaseRowModel {
    @ExcelProperty(value = "序号",index = 0)
    private String id;
    @ExcelProperty(value = "镇编号",index = 1)
    private String townId;
    @ExcelProperty(value = "地籍编号",index = 2)
    private String cadastralNum;
    @ExcelProperty(value = "户主姓名",index = 3)
    private String hrName;
    @ExcelProperty(value = "身份证号",index = 4)
    private String idCard;
    @ExcelProperty(value = "家庭人口数",index = 5)
    private Integer familyNum;
    @ExcelProperty(value = "承包地数量",index = 6)
    private Integer conLandNum;
    @ExcelProperty(value = "是否退地",index = 7)
    private Boolean isBackground;
    @ExcelProperty(value = "所在镇",index = 8)
    private String town;
    @ExcelProperty(value = "所在村",index = 9)
    private String village;
    @ExcelProperty(value = "统计年份",index = 9)
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

    public String getCadastralNum() {
        return cadastralNum;
    }

    public void setCadastralNum(String cadastralNum) {
        this.cadastralNum = cadastralNum;
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

    public Integer getFamilyNum() {
        return familyNum;
    }

    public void setFamilyNum(Integer familyNum) {
        this.familyNum = familyNum;
    }

    public Integer getConLandNum() {
        return conLandNum;
    }

    public void setConLandNum(Integer conLandNum) {
        this.conLandNum = conLandNum;
    }

    public Boolean getBackground() {
        return isBackground;
    }

    public void setBackground(Boolean background) {
        isBackground = background;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
