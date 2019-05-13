package com.lete.land.landdal.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DataLandTransferModel extends BaseRowModel {
    @ExcelProperty(value = "序号",index = 0)
    private String id;
    @ExcelProperty(value = "镇编号",index = 1)
    private String townId;
    @ExcelProperty(value = "所在镇",index = 2)
    private String town;
    @ExcelProperty(value = "所在村",index = 3)
    private String village;
    @ExcelProperty(value = "统计年份",index = 4)
    private String year;
    @ExcelProperty(value = "年末流转的农业用地面积",index = 5)
    private Double alat;
    @ExcelProperty(value = "流转入农民合作社的土地面积",index = 6)
    private Double latfc;
    @ExcelProperty(value = "流转入企业的土地面积",index = 7)
    private Double late;
    @ExcelProperty(value = "流转入规模户的土地面积",index = 8)
    private Double latlh;
    @ExcelProperty(value = "流转入其他主体的土地面积",index = 9)
    private Double latoe;

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

    public Double getAlat() {
        return alat;
    }

    public void setAlat(Double alat) {
        this.alat = alat;
    }

    public Double getLatfc() {
        return latfc;
    }

    public void setLatfc(Double latfc) {
        this.latfc = latfc;
    }

    public Double getLate() {
        return late;
    }

    public void setLate(Double late) {
        this.late = late;
    }

    public Double getLatlh() {
        return latlh;
    }

    public void setLatlh(Double latlh) {
        this.latlh = latlh;
    }

    public Double getLatoe() {
        return latoe;
    }

    public void setLatoe(Double latoe) {
        this.latoe = latoe;
    }
}
