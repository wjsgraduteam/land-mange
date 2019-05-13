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
    @Column(name = "village")
    private String village;
    @Column(name = "town")
    private String town;
    @Column(name = "year")
    private String year;
    @Column(name = "village_collective_income")
    private Integer villageCollectiveIncome;
    @Column(name = "toal_income")
    private Integer toalIncome;
    @Column(name = "can_use_income")
    private Integer canUseIncome;
    @Column(name = "dividend")
    private Integer dividend;

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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
}
