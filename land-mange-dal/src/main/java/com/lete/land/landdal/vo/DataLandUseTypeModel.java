package com.lete.land.landdal.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DataLandUseTypeModel extends BaseRowModel {
    @ExcelProperty(value = "序号",index = 0)
    private String id;
    @ExcelProperty(value = "村",index = 1)
    private String village;
    @ExcelProperty(value = "镇",index = 2)
    private String town;
    @ExcelProperty(value = "统计年份",index = 3)
    private String year;
    @ExcelProperty(value = "镇编号",index = 4)
    private String townId;
    @ExcelProperty(value = "年末耕地面积",index = 5)
    private Integer yearendCulArea;
    @ExcelProperty(value = "高标准农田面积",index = 6)
    private Integer hsfArea;
    @ExcelProperty(value = "设施农业面积",index = 7)
    private Integer faArea;
    @ExcelProperty(value = "粮食播种面积",index = 8)
    private Integer gsArea;
    @ExcelProperty(value = "蔬菜播种面积",index = 9)
    private Integer vpArea;
    @ExcelProperty(value = "水体养殖面积",index = 10)
    private Integer aqArea;
    @ExcelProperty(value = "村集体经营性建设用地面积",index = 11)
    private Integer constructionLandArea;
    @ExcelProperty(value = "宅基地面积",index = 12)
    private Integer homesteadArea;
    @ExcelProperty(value = "统计面积",index = 13)
    private Integer statisticalYear;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

    public Integer getYearendCulArea() {
        return yearendCulArea;
    }

    public void setYearendCulArea(Integer yearendCulArea) {
        this.yearendCulArea = yearendCulArea;
    }

    public Integer getHsfArea() {
        return hsfArea;
    }

    public void setHsfArea(Integer hsfArea) {
        this.hsfArea = hsfArea;
    }

    public Integer getFaArea() {
        return faArea;
    }

    public void setFaArea(Integer faArea) {
        this.faArea = faArea;
    }

    public Integer getGsArea() {
        return gsArea;
    }

    public void setGsArea(Integer gsArea) {
        this.gsArea = gsArea;
    }

    public Integer getVpArea() {
        return vpArea;
    }

    public void setVpArea(Integer vpArea) {
        this.vpArea = vpArea;
    }

    public Integer getAqArea() {
        return aqArea;
    }

    public void setAqArea(Integer aqArea) {
        this.aqArea = aqArea;
    }

    public Integer getConstructionLandArea() {
        return constructionLandArea;
    }

    public void setConstructionLandArea(Integer constructionLandArea) {
        this.constructionLandArea = constructionLandArea;
    }

    public Integer getHomesteadArea() {
        return homesteadArea;
    }

    public void setHomesteadArea(Integer homesteadArea) {
        this.homesteadArea = homesteadArea;
    }

    public Integer getStatisticalYear() {
        return statisticalYear;
    }

    public void setStatisticalYear(Integer statisticalYear) {
        this.statisticalYear = statisticalYear;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
