package com.lete.land.landdal.vo.business;

import java.io.Serializable;

/**
 * Created by WJ on 2019/5/16 0016
 */
public class SummaryAnalysisVO implements Serializable {
    private String town;

    private String village;

    private Long rentalMangeCount;

    private Double rentalMangeArea;

    private Long selfMangeCount;

    private Double selfMangeArea;

    private Long villageMangeCount;

    private Double villageMangeArea;

    public SummaryAnalysisVO(String town, String village) {
        this.town = town;
        this.village = village;
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

    public Long getRentalMangeCount() {
        return rentalMangeCount;
    }

    public void setRentalMangeCount(Long rentalMangeCount) {
        this.rentalMangeCount = rentalMangeCount;
    }

    public Double getRentalMangeArea() {
        return rentalMangeArea;
    }

    public void setRentalMangeArea(Double rentalMangeArea) {
        this.rentalMangeArea = rentalMangeArea;
    }

    public Long getSelfMangeCount() {
        return selfMangeCount;
    }

    public void setSelfMangeCount(Long selfMangeCount) {
        this.selfMangeCount = selfMangeCount;
    }

    public Double getSelfMangeArea() {
        return selfMangeArea;
    }

    public void setSelfMangeArea(Double selfMangeArea) {
        this.selfMangeArea = selfMangeArea;
    }

    public Long getVillageMangeCount() {
        return villageMangeCount;
    }

    public void setVillageMangeCount(Long villageMangeCount) {
        this.villageMangeCount = villageMangeCount;
    }

    public Double getVillageMangeArea() {
        return villageMangeArea;
    }

    public void setVillageMangeArea(Double villageMangeArea) {
        this.villageMangeArea = villageMangeArea;
    }
}
