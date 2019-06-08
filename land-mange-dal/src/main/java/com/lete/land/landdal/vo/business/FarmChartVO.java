package com.lete.land.landdal.vo.business;

import java.io.Serializable;
import java.util.List;

/**
 * Created by WJ on 2019/5/18 0018
 */
public class FarmChartVO implements Serializable {

    private static final long serialVersionUID = -9170456914882860123L;

    private List<FarmTypeVO> incomeChart;

    private List<FarmTypeChartVO> typeChart;

    public static FarmChartVO buildFarmChartVO(List<FarmTypeVO> incomeChart, List<FarmTypeChartVO> typeChart) {
        return new FarmChartVO(incomeChart, typeChart);
    }

    private FarmChartVO(List<FarmTypeVO> incomeChart, List<FarmTypeChartVO> typeChart) {
        this.incomeChart = incomeChart;
        this.typeChart = typeChart;
    }

    public List<FarmTypeVO> getIncomeChart() {
        return incomeChart;
    }

    public void setIncomeChart(List<FarmTypeVO> incomeChart) {
        this.incomeChart = incomeChart;
    }

    public List<FarmTypeChartVO> getTypeChart() {
        return typeChart;
    }

    public void setTypeChart(List<FarmTypeChartVO> typeChart) {
        this.typeChart = typeChart;
    }
}
