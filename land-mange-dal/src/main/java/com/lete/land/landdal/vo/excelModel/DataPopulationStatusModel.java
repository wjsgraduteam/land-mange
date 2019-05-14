package com.lete.land.landdal.vo.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DataPopulationStatusModel extends BaseRowModel  {
    @ExcelProperty(value = "序号",index = 0)
    private String id;
    @ExcelProperty(value = "镇编号",index = 1)
    private String townId;
    @ExcelProperty(value = "所在村",index = 5)
    private String village;
    @ExcelProperty(value = "所在镇",index = 3)
    private String town;
    @ExcelProperty(value = "常住人口总数",index = 4)
    private Integer totalResidentPop;
    @ExcelProperty(value = "户籍人口总数",index = 5)
    private Integer totalRegisteredPop;
    @ExcelProperty(value = "户籍人口总户数",index = 6)
    private Integer totalNumReg;
    @ExcelProperty(value = "外来人口总数",index = 7)
    private Integer totalNumMigrants;
    @ExcelProperty(value = "新型农村合作医疗参保人数",index = 8)
    private Integer nrcmInsurance;
    @ExcelProperty(value = "养老保险参保人数",index = 9)
    private Integer pensionInsurance;
    @ExcelProperty(value = "农村居民最低生活保障人数",index = 10)
    private Integer mlarResidents;
    @ExcelProperty(value = "农村五保供养人数",index = 11)
    private Integer nrfs;
    @ExcelProperty(value = "截至本年末耕地被全部征用农户户数",index = 12)
    private Integer householdsNum;
    @ExcelProperty(value = "截至本年末耕地被全部征用涉及人口",index = 13)
    private Integer riPopulation;
    @ExcelProperty(value = "参加农民合作社的户数",index = 14)
    private Integer hpNum;
    @ExcelProperty(value = "规模种植户数",index = 15)
    private Integer scaleGrowers;
    @ExcelProperty(value = "全年本村居民人均从村集体获得的收益",index = 16)
    private Double dividend;
    @ExcelProperty(value = "统计年份",index = 17)
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

    public Integer getTotalResidentPop() {
        return totalResidentPop;
    }

    public void setTotalResidentPop(Integer totalResidentPop) {
        this.totalResidentPop = totalResidentPop;
    }

    public Integer getTotalRegisteredPop() {
        return totalRegisteredPop;
    }

    public void setTotalRegisteredPop(Integer totalRegisteredPop) {
        this.totalRegisteredPop = totalRegisteredPop;
    }

    public Integer getTotalNumReg() {
        return totalNumReg;
    }

    public void setTotalNumReg(Integer totalNumReg) {
        this.totalNumReg = totalNumReg;
    }

    public Integer getTotalNumMigrants() {
        return totalNumMigrants;
    }

    public void setTotalNumMigrants(Integer totalNumMigrants) {
        this.totalNumMigrants = totalNumMigrants;
    }

    public Integer getNrcmInsurance() {
        return nrcmInsurance;
    }

    public void setNrcmInsurance(Integer nrcmInsurance) {
        this.nrcmInsurance = nrcmInsurance;
    }

    public Integer getPensionInsurance() {
        return pensionInsurance;
    }

    public void setPensionInsurance(Integer pensionInsurance) {
        this.pensionInsurance = pensionInsurance;
    }

    public Integer getMlarResidents() {
        return mlarResidents;
    }

    public void setMlarResidents(Integer mlarResidents) {
        this.mlarResidents = mlarResidents;
    }

    public Integer getNrfs() {
        return nrfs;
    }

    public void setNrfs(Integer nrfs) {
        this.nrfs = nrfs;
    }

    public Integer getHouseholdsNum() {
        return householdsNum;
    }

    public void setHouseholdsNum(Integer householdsNum) {
        this.householdsNum = householdsNum;
    }

    public Integer getRiPopulation() {
        return riPopulation;
    }

    public void setRiPopulation(Integer riPopulation) {
        this.riPopulation = riPopulation;
    }

    public Integer getHpNum() {
        return hpNum;
    }

    public void setHpNum(Integer hpNum) {
        this.hpNum = hpNum;
    }

    public Integer getScaleGrowers() {
        return scaleGrowers;
    }

    public void setScaleGrowers(Integer scaleGrowers) {
        this.scaleGrowers = scaleGrowers;
    }

    public Double getDividend() {
        return dividend;
    }

    public void setDividend(Double dividend) {
        this.dividend = dividend;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
