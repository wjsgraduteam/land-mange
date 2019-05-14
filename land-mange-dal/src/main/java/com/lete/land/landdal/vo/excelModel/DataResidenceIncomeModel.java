package com.lete.land.landdal.vo.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DataResidenceIncomeModel extends BaseRowModel {
    @ExcelProperty(value = "序号", index = 0)
    private String id;
    @ExcelProperty(value = "镇编号", index = 1)
    private String townId;
    @ExcelProperty(value = "村名", index = 2)
    private String village;
    @ExcelProperty(value = "所在镇", index = 3)
    private String town;
    @ExcelProperty(value = "村集体收入", index = 4)
    private Double villageCollectiveIncome;
    @ExcelProperty(value = "年末村集体资产总额", index = 5)
    private Double toalIncome;
    @ExcelProperty(value = "农村居民人均可支配收入", index = 6)
    private Double canUseIncome;
    @ExcelProperty(value = "全年本村居民人均从村集体获得的收益", index = 7)
    private Double dividend;
    @ExcelProperty(value = "统计年份", index = 8)
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

    public Double getVillageCollectiveIncome() {
        return villageCollectiveIncome;
    }

    public void setVillageCollectiveIncome(Double villageCollectiveIncome) {
        this.villageCollectiveIncome = villageCollectiveIncome;
    }

    public Double getToalIncome() {
        return toalIncome;
    }

    public void setToalIncome(Double toalIncome) {
        this.toalIncome = toalIncome;
    }

    public Double getCanUseIncome() {
        return canUseIncome;
    }

    public void setCanUseIncome(Double canUseIncome) {
        this.canUseIncome = canUseIncome;
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
