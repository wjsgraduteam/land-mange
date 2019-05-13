package com.lete.land.landdal.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "d_business_entity_information")
public class DataBusinessEntityInformation {
    @Id
    @Column(name = "id")
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
    @Column(name = "operator_name")
    private String operatorName;
    @Column(name = "id_card")
    private String idCard;
    @Column(name = "operator_type")
    private Integer operatorType;
    @Column(name = "start_date")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String startDate;
    @Column(name = "operating_period")
    private String operatingPeriod;
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

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getOperatingPeriod() {
        return operatingPeriod;
    }

    public void setOperatingPeriod(String operatingPeriod) {
        this.operatingPeriod = operatingPeriod;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}