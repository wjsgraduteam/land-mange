package com.lete.land.landdal.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "d_information")
public class DataInformation {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "id_card")
    private String id_card;
    @Column(name = "sex")
    private String sex;
    @Column(name = "born_date")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date bornDate;
    @Column(name = "cadastral_num")
    private String cadastralNum;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "social_security_type")
    private Integer socialSecurityType;
    @Column(name = "year")
    private String year;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getCadastralNum() {
        return cadastralNum;
    }

    public void setCadastralNum(String cadastralNum) {
        this.cadastralNum = cadastralNum;
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

    public Integer getSocialSecurityType() {
        return socialSecurityType;
    }

    public void setSocialSecurityType(Integer socialSecurityType) {
        this.socialSecurityType = socialSecurityType;
    }
}
