package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "d_population_status")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class DataPopulationStatus {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @Column(name = "town_id")
    private String townId;
    @Column(name = "village")
    private String village;
    @Column(name = "town")
    private String town;
    @Column(name = "total_resident_pop")
    private Integer totalResidentPop;
    @Column(name = "total_registered_pop")
    private Integer totalRegisteredPop;
    @Column(name = "total_num_reg")
    private Integer totalNumReg;
    @Column(name = "total_num_migrants")
    private Integer totalNumMigrants;
    @Column(name = "nrcm_insurance")
    private Integer nrcmInsurance;
    @Column(name = "pension_insurance")
    private Integer pensionInsurance;
    @Column(name = "mlar_residents")
    private Integer mlarResidents;
    @Column(name = "nrfs")
    private Integer nrfs;
    @Column(name = "households_num")
    private Integer householdsNum;
    @Column(name = "ri_population")
    private Integer riPopulation;
    @Column(name = "hp_num")
    private Integer hpNum;
    @Column(name = "scale_growers")
    private Integer scaleGrowers;
    @Column(name = "dividend")
    private Double dividend;
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

    public Integer getTotalResidentPop() {
        return totalResidentPop;
    }

    public void setTotalResidentPop(Integer totalResidentPop) {
        this.totalResidentPop = totalResidentPop;
    }

    public Integer getTotalRegisteredPop() {
        return totalRegisteredPop;
    }

    public void setTotalRegisteredPop(Integer totalRegisteredPop) {
        this.totalRegisteredPop = totalRegisteredPop;
    }

    public Integer getTotalNumReg() {
        return totalNumReg;
    }

    public void setTotalNumReg(Integer totalNumReg) {
        this.totalNumReg = totalNumReg;
    }

    public Integer getTotalNumMigrants() {
        return totalNumMigrants;
    }

    public void setTotalNumMigrants(Integer totalNumMigrants) {
        this.totalNumMigrants = totalNumMigrants;
    }

    public Integer getNrcmInsurance() {
        return nrcmInsurance;
    }

    public void setNrcmInsurance(Integer nrcmInsurance) {
        this.nrcmInsurance = nrcmInsurance;
    }

    public Integer getPensionInsurance() {
        return pensionInsurance;
    }

    public void setPensionInsurance(Integer pensionInsurance) {
        this.pensionInsurance = pensionInsurance;
    }

    public Integer getMlarResidents() {
        return mlarResidents;
    }

    public void setMlarResidents(Integer mlarResidents) {
        this.mlarResidents = mlarResidents;
    }

    public Integer getNrfs() {
        return nrfs;
    }

    public void setNrfs(Integer nrfs) {
        this.nrfs = nrfs;
    }

    public Integer getHouseholdsNum() {
        return householdsNum;
    }

    public void setHouseholdsNum(Integer householdsNum) {
        this.householdsNum = householdsNum;
    }

    public Integer getRiPopulation() {
        return riPopulation;
    }

    public void setRiPopulation(Integer riPopulation) {
        this.riPopulation = riPopulation;
    }

    public Integer getHpNum() {
        return hpNum;
    }

    public void setHpNum(Integer hpNum) {
        this.hpNum = hpNum;
    }

    public Integer getScaleGrowers() {
        return scaleGrowers;
    }

    public void setScaleGrowers(Integer scaleGrowers) {
        this.scaleGrowers = scaleGrowers;
    }

    public Double getDividend() {
        return dividend;
    }

    public void setDividend(Double dividend) {
        this.dividend = dividend;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
