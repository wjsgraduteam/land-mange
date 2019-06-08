package com.lete.land.landdal.vo.business;

import java.io.Serializable;

/**
 * Created by WJ on 2019/5/18 0018
 */
public class YearAnalysisChartVO implements Serializable {
    private static final long serialVersionUID = 2449039325175130872L;

    private String year;

    private Double selfTotalIncome;

    private Double villageTotalIncome;

    private Double retalTotalIncome;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getSelfTotalIncome() {
        return selfTotalIncome;
    }

    public void setSelfTotalIncome(Double selfTotalIncome) {
        this.selfTotalIncome = selfTotalIncome;
    }

    public Double getVillageTotalIncome() {
        return villageTotalIncome;
    }

    public void setVillageTotalIncome(Double villageTotalIncome) {
        this.villageTotalIncome = villageTotalIncome;
    }

    public Double getRetalTotalIncome() {
        return retalTotalIncome;
    }

    public void setRetalTotalIncome(Double retalTotalIncome) {
        this.retalTotalIncome = retalTotalIncome;
    }
}
