package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "d_land_transfer")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class DataLandTransfer {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @Column(name = "town_id")
    private String townId;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "year")
    private String year;
    @Column(name = "alat")
    private Double alat;
    @Column(name = "latfc")
    private Double latfc;
    @Column(name = "late")
    private Double late;
    @Column(name = "latlh")
    private Double latlh;
    @Column(name = "latoe")
    private Double latoe;

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getAlat() {
        return alat;
    }

    public void setAlat(Double alat) {
        this.alat = alat;
    }

    public Double getLatfc() {
        return latfc;
    }

    public void setLatfc(Double latfc) {
        this.latfc = latfc;
    }

    public Double getLate() {
        return late;
    }

    public void setLate(Double late) {
        this.late = late;
    }

    public Double getLatlh() {
        return latlh;
    }

    public void setLatlh(Double latlh) {
        this.latlh = latlh;
    }

    public Double getLatoe() {
        return latoe;
    }

    public void setLatoe(Double latoe) {
        this.latoe = latoe;
    }
}
