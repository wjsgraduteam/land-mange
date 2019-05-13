package com.lete.land.landdal.vo.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DataResidenceIncomeModel extends BaseRowModel {
    @ExcelProperty(value = "序号",index = 0)
    private String id;
    @ExcelProperty(value = "村名",index = 1)
    private String village;
    @ExcelProperty(value = "所在镇",index = 2)
    private String town;
    @ExcelProperty(value = "村集体收入",index = 3)
    private Integer villageCollectiveIncome;
    @ExcelProperty(value = "年末村集体资产总额",index = 4)
    private Integer toalIncome;
    @ExcelProperty(value = "农村居民人均可支配收入",index = 5)
    private Integer canUseIncome;
    @ExcelProperty(value = "全年本村居民人均从村集体获得的收益",index = 6)
    private Integer dividend;
    @ExcelProperty(value = "统计年份",index = 7)
    private String year;

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

    public Integer getVillageCollectiveIncome() {
        return villageCollectiveIncome;
    }

    public void setVillageCollectiveIncome(Integer villageCollectiveIncome) {
        this.villageCollectiveIncome = villageCollectiveIncome;
    }

    public Integer getToalIncome() {
        return toalIncome;
    }

    public void setToalIncome(Integer toalIncome) {
        this.toalIncome = toalIncome;
    }

    public Integer getCanUseIncome() {
        return canUseIncome;
    }

    public void setCanUseIncome(Integer canUseIncome) {
        this.canUseIncome = canUseIncome;
    }

    public Integer getDividend() {
        return dividend;
    }

    public void setDividend(Integer dividend) {
        this.dividend = dividend;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
