package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "e_money_compensate")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class ExitMoneyCompensate {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "id")
    private String id;
    @Column(name = "pro_id")
    private String proId;
    @Column(name = "compensation")
    private Double compensation;
    @Column(name = "id_card")
    private String idCard;
    @Column(name = "house_holder_name")
    private String householderName;
    @Column(name = "apply_exit_land_no")
    private String applyExitLandNo;
    @Column(name = "apply_exit_lan_area")
    private Double applyExitLanArea;
    @Column(name = "rice_area")
    private Double riceArea;
    @Column(name = "vegeatable_area")
    private Double vegeatableArea;
    @Column(name = "miao_area")
    private Double miaoArea;
    @Column(name = "fish_pond_area")
    private Double fishPondArea;
    @Column(name = "other_area")
    private Double otherArea;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "register_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate registerDate;


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


    public Double getCompensation() {
        return compensation;
    }

    public void setCompensation(Double compensation) {
        this.compensation = compensation;
    }


    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }


    public String getHouseholderName() {
        return householderName;
    }

    public void setHouseholderName(String householderName) {
        this.householderName = householderName;
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


    public Double getRiceArea() {
        return riceArea;
    }

    public void setRiceArea(Double riceArea) {
        this.riceArea = riceArea;
    }


    public Double getVegeatableArea() {
        return vegeatableArea;
    }

    public void setVegeatableArea(Double vegeatableArea) {
        this.vegeatableArea = vegeatableArea;
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

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
}
