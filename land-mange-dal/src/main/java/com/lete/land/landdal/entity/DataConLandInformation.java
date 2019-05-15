package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "d_con_land_information")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class DataConLandInformation {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @Column(name = "town_id")
    private String townId;
    @Column(name = "cadastral_num")
    private String cadastralNum;
    @Column(name = "hr_name")
    private String hrName;
    @Column(name = "id_card")
    private String idCard;
    @Column(name = "family_num")
    private Integer familyNum;
    @Column(name = "con_land_num")
    private Integer conLandNum;
    @Column(name = "is_background")
    private String isBackground;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "year")
    private String year;

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCadastralNum() {
        return cadastralNum;
    }

    public void setCadastralNum(String cadastralNum) {
        this.cadastralNum = cadastralNum;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getFamilyNum() {
        return familyNum;
    }

    public void setFamilyNum(Integer familyNum) {
        this.familyNum = familyNum;
    }

    public Integer getConLandNum() {
        return conLandNum;
    }

    public void setConLandNum(Integer conLandNum) {
        this.conLandNum = conLandNum;
    }

    public String getIsBackground() {
        return isBackground;
    }

    public void setIsBackground(String isBackground) {
        this.isBackground = isBackground;
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
}
