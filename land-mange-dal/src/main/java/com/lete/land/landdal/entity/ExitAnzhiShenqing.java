package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "e_anzhi_shenqing")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class ExitAnzhiShenqing {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @Column(name = "pro_id")
    private String proId;
    @Column(name = "hr_name")
    private String householderName;
    @Column(name = "id_card")
    private long idCard;
    @Column(name = "sex")
    private String sex;
    @Column(name = "family_num")
    private long familyNum;
    @Column(name = "home_site_area")
    private Double houseSiteArea;
    @Column(name = "house_area")
    private Double houseArea;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "place_reason")
    private String placeReason;
    @Column(name = "register_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate registerDate;


    public String getHouseholderName() {
        return householderName;
    }

    public void setHouseholderName(String householderName) {
        this.householderName = householderName;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public long getFamilyNum() {
        return familyNum;
    }

    public void setFamilyNum(long familyNum) {
        this.familyNum = familyNum;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getHouseSiteArea() {
        return houseSiteArea;
    }

    public void setHouseSiteArea(Double houseSiteArea) {
        this.houseSiteArea = houseSiteArea;
    }

    public Double getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(Double houseArea) {
        this.houseArea = houseArea;
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


    public String getPlaceReason() {
        return placeReason;
    }

    public void setPlaceReason(String placeReason) {
        this.placeReason = placeReason;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
}
