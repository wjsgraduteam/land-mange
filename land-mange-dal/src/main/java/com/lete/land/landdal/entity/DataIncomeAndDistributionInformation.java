package com.lete.land.landdal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "d_income_and_distribution_information")
public class DataIncomeAndDistributionInformation {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "town_id")
    private String townId;
    @Column(name = "number")
    private String number;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "total_net_income")
    private Integer totalNetIncome;
    @Column(name = "lm_and_re_income")
    private Integer lmAndReIncome;
    @Column(name = "vca")
    private Integer vca;
    @Column(name = "shareholder_allocation")
    private Integer shareholderAllocation;
    @Column(name = "current_retention")
    private Integer currentRetention;
    @Column(name = "lta")
    private Integer lta;
    @Column(name = "rs_tol_num")
    private Integer rsTolNum;
    @Column(name = "rural_unit_price")
    private Integer ruralUnitPrice;
    @Column(name = "cs_tol_num")
    private Integer csTolNum;
    @Column(name = "ctup")
    private Integer ctup;
    @Column(name = "year")
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public Integer getTotalNetIncome() {
        return totalNetIncome;
    }

    public void setTotalNetIncome(Integer totalNetIncome) {
        this.totalNetIncome = totalNetIncome;
    }

    public Integer getLmAndReIncome() {
        return lmAndReIncome;
    }

    public void setLmAndReIncome(Integer lmAndReIncome) {
        this.lmAndReIncome = lmAndReIncome;
    }

    public Integer getVca() {
        return vca;
    }

    public void setVca(Integer vca) {
        this.vca = vca;
    }

    public Integer getShareholderAllocation() {
        return shareholderAllocation;
    }

    public void setShareholderAllocation(Integer shareholderAllocation) {
        this.shareholderAllocation = shareholderAllocation;
    }

    public Integer getCurrentRetention() {
        return currentRetention;
    }

    public void setCurrentRetention(Integer currentRetention) {
        this.currentRetention = currentRetention;
    }

    public Integer getLta() {
        return lta;
    }

    public void setLta(Integer lta) {
        this.lta = lta;
    }

    public Integer getRsTolNum() {
        return rsTolNum;
    }

    public void setRsTolNum(Integer rsTolNum) {
        this.rsTolNum = rsTolNum;
    }

    public Integer getRuralUnitPrice() {
        return ruralUnitPrice;
    }

    public void setRuralUnitPrice(Integer ruralUnitPrice) {
        this.ruralUnitPrice = ruralUnitPrice;
    }

    public Integer getCsTolNum() {
        return csTolNum;
    }

    public void setCsTolNum(Integer csTolNum) {
        this.csTolNum = csTolNum;
    }

    public Integer getCtup() {
        return ctup;
    }

    public void setCtup(Integer ctup) {
        this.ctup = ctup;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
