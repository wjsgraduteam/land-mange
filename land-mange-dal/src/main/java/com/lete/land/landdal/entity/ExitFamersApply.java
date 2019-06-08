package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "e_exit_famers_apply")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class ExitFamersApply {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @Column(name = "pro_id")
    private String proId;
    @Column(name = "householder_name")
    private String householderName;
    @Column(name = "id_card")
    private String idCard;
    @Column(name = "family_num")
    private Integer familyNum;
    @Column(name = "apply_exit_land_no")
    private String applyExitLandNo;
    @Column(name = "apply_exit_lan_area")
    private Double applyExitLanArea;
    @Column(name = "house_site_area")
    private Double houseSiteArea;
    @Column(name = "house_area")
    private Double houseArea;
    @Column(name = "rice_area")
    private Double riceArea;
    @Column(name = "miao_area")
    private Double miaoArea;
    @Column(name = "fish_pond_area")
    private Double fishPondArea;
    @Column(name = "other_area")
    private Double otherArea;
    @Column(name = "vegeatable_area")
    private Double vegeatableArea;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "apply_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate applyDate;
    @Column(name = "handle_user")
    private String handleUser;

    public Double getVegeatableArea() {
        return vegeatableArea;
    }

    public void setVegeatableArea(Double vegeatableArea) {
        this.vegeatableArea = vegeatableArea;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getHouseholderName() {
        return householderName;
    }

    public void setHouseholderName(String householderName) {
        this.householderName = householderName;
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

    public String getApplyExitLandNo() {
        return applyExitLandNo;
    }

    public void setApplyExitLandNo(String applyExitLandNo) {
        this.applyExitLandNo = applyExitLandNo;
    }

    public Double getApplyExitLanArea() {
        return applyExitLanArea;
    }

    public void setApplyExitLanArea(Double applyExitLanArea) {
        this.applyExitLanArea = applyExitLanArea;
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

    public Double getRiceArea() {
        return riceArea;
    }

    public void setRiceArea(Double riceArea) {
        this.riceArea = riceArea;
    }

    public Double getMiaoArea() {
        return miaoArea;
    }

    public void setMiaoArea(Double miaoArea) {
        this.miaoArea = miaoArea;
    }

    public Double getFishPondArea() {
        return fishPondArea;
    }

    public void setFishPondArea(Double fishPondArea) {
        this.fishPondArea = fishPondArea;
    }

    public Double getOtherArea() {
        return otherArea;
    }

    public void setOtherArea(Double otherArea) {
        this.otherArea = otherArea;
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

    public LocalDate getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDate applyDate) {
        this.applyDate = applyDate;
    }

    public String getHandleUser() {
        return handleUser;
    }

    public void setHandleUser(String handleUser) {
        this.handleUser = handleUser;
    }
}
