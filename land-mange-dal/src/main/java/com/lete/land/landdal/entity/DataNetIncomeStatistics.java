package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "d_net_income_statistics")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class DataNetIncomeStatistics {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @Column(name = "town_id")
    private String townId;
    @Column(name = "plot_number")
    private String plotNumber;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "contracted_area")
    private Integer contractedArea;
    @Column(name = "rice_fields")
    private Double riceFields;
    @Column(name = "vegetable_field")
    private Double vegetableField;
    @Column(name = "orchard")
    private Double orchard;
    @Column(name = "fish_pond")
    private Double fishPond;
    @Column(name = "qita")
    private Double qita;
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

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
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

    public Double getRiceFields() {
        return riceFields;
    }

    public void setRiceFields(Double riceFields) {
        this.riceFields = riceFields;
    }

    public Double getVegetableField() {
        return vegetableField;
    }

    public void setVegetableField(Double vegetableField) {
        this.vegetableField = vegetableField;
    }

    public Double getOrchard() {
        return orchard;
    }

    public void setOrchard(Double orchard) {
        this.orchard = orchard;
    }

    public Double getFishPond() {
        return fishPond;
    }

    public void setFishPond(Double fishPond) {
        this.fishPond = fishPond;
    }

    public Double getQita() {
        return qita;
    }

    public void setQita(Double qita) {
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
