package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "d_income_and_distribution_information")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class DataIncomeAndDistributionInformation {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "jpa-uuid")
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
    private Double totalNetIncome;
    @Column(name = "lm_and_re_income")
    private Double lmAndReIncome;
    @Column(name = "vca")
    private Double vca;
    @Column(name = "shareholder_allocation")
    private Double shareholderAllocation;
    @Column(name = "current_retention")
    private Double currentRetention;
    @Column(name = "lta")
    private Double lta;
    @Column(name = "rs_tol_num")
    private Integer rsTolNum;
    @Column(name = "rural_unit_price")
    private Double ruralUnitPrice;
    @Column(name = "cs_tol_num")
    private Integer csTolNum;
    @Column(name = "ctup")
    private Double ctup;
    @Column(name = "year")
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

    public Double getTotalNetIncome() {
        return totalNetIncome;
    }

    public void setTotalNetIncome(Double totalNetIncome) {
        this.totalNetIncome = totalNetIncome;
    }

    public Double getLmAndReIncome() {
        return lmAndReIncome;
    }

    public void setLmAndReIncome(Double lmAndReIncome) {
        this.lmAndReIncome = lmAndReIncome;
    }

    public Double getVca() {
        return vca;
    }

    public void setVca(Double vca) {
        this.vca = vca;
    }

    public Double getShareholderAllocation() {
        return shareholderAllocation;
    }

    public void setShareholderAllocation(Double shareholderAllocation) {
        this.shareholderAllocation = shareholderAllocation;
    }

    public Double getCurrentRetention() {
        return currentRetention;
    }

    public void setCurrentRetention(Double currentRetention) {
        this.currentRetention = currentRetention;
    }

    public Double getLta() {
        return lta;
    }

    public void setLta(Double lta) {
        this.lta = lta;
    }

    public Integer getRsTolNum() {
        return rsTolNum;
    }

    public void setRsTolNum(Integer rsTolNum) {
        this.rsTolNum = rsTolNum;
    }

    public Double getRuralUnitPrice() {
        return ruralUnitPrice;
    }

    public void setRuralUnitPrice(Double ruralUnitPrice) {
        this.ruralUnitPrice = ruralUnitPrice;
    }

    public Integer getCsTolNum() {
        return csTolNum;
    }

    public void setCsTolNum(Integer csTolNum) {
        this.csTolNum = csTolNum;
    }

    public Double getCtup() {
        return ctup;
    }

    public void setCtup(Double ctup) {
        this.ctup = ctup;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
