package com.lete.land.landdal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "d_residence_income")
public class DataResidenceIncome {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "townId")
    private String townId;
    @Column(name = "village")
    private String village;
    @Column(name = "town")
    private String town;
    @Column(name = "year")
    private String year;
    @Column(name = "village_collective_income")
    private Double villageCollectiveIncome;
    @Column(name = "toal_income")
    private Double toalIncome;
    @Column(name = "can_use_income")
    private Double canUseIncome;
    @Column(name = "dividend")
    private Double dividend;

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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
}
