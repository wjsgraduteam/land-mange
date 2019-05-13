package com.lete.land.landdal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "d_net_income_statistics")
public class DataNetIncomeStatistics {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "plot_number")
    private String plotNumber;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "contracted_area")
    private Integer contractedArea;
    @Column(name = "rice_fields")
    private String riceFields;
    @Column(name = "vegetable_field")
    private String vegetableField;
    @Column(name = "orchard")
    private String orchard;
    @Column(name = "fish_pond")
    private String fishPond;
    @Column(name = "qita")
    private String qita;
    @Column(name = "operator_name")
    private String operatorName;
    @Column(name = "operator_type")
    private Integer operatorType;
    @Column(name = "total_net_income")
    private Integer totalNetIncome;
    @Column(name = "year")
    private String year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(String plotNumber) {
        this.plotNumber = plotNumber;
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

    public Integer getContractedArea() {
        return contractedArea;
    }

    public void setContractedArea(Integer contractedArea) {
        this.contractedArea = contractedArea;
    }

    public String getRiceFields() {
        return riceFields;
    }

    public void setRiceFields(String riceFields) {
        this.riceFields = riceFields;
    }

    public String getVegetableField() {
        return vegetableField;
    }

    public void setVegetableField(String vegetableField) {
        this.vegetableField = vegetableField;
    }

    public String getOrchard() {
        return orchard;
    }

    public void setOrchard(String orchard) {
        this.orchard = orchard;
    }

    public String getFishPond() {
        return fishPond;
    }

    public void setFishPond(String fishPond) {
        this.fishPond = fishPond;
    }

    public String getQita() {
        return qita;
    }

    public void setQita(String qita) {
        this.qita = qita;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Integer getTotalNetIncome() {
        return totalNetIncome;
    }

    public void setTotalNetIncome(Integer totalNetIncome) {
        this.totalNetIncome = totalNetIncome;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
