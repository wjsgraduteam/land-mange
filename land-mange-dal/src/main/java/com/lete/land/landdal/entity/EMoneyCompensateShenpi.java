package com.lete.land.landdal.entity;

import javax.persistence.*;

@Entity
@Table(name = "e_money_compensate_shenpi")
public class EMoneyCompensateShenpi {

 @Id
 @Column(name = "hr_name")
  private String hrName;
 @Column(name = "id_card")
  private long idCard;
 @Column(name = "tuichu_land_id")
  private String tuichuLandId;
 @Column(name = "tuichu_cul_area")
  private double tuichuCulArea;
 @Column(name = "round_attachment _shuidao_area")
  private double roundAttachment_ShuidaoArea;
 @Column(name = "round_attachment _shucai_area")
  private double roundAttachment_ShucaiArea;
 @Column(name = "round_attachment _miaomu_area")
  private double roundAttachment_MiaomuArea;
 @Column(name = "round_attachment _yutang_area")
  private double roundAttachment_YutangArea;
 @Column(name = "round_attachment _qita_area")
  private double roundAttachment_QitaArea;
 @Column(name = "compensate_money")
  private double compensateMoney;
 @Column(name = "town")
  private String town;
 @Column(name = "village")
  private String village;
 @Column(name = "shenpi_date")
  private java.sql.Timestamp shenpiDate;


  public String getHrName() {
    return hrName;
  }

  public void setHrName(String hrName) {
    this.hrName = hrName;
  }


  public long getIdCard() {
    return idCard;
  }

  public void setIdCard(long idCard) {
    this.idCard = idCard;
  }


  public String getTuichuLandId() {
    return tuichuLandId;
  }

  public void setTuichuLandId(String tuichuLandId) {
    this.tuichuLandId = tuichuLandId;
  }


  public double getTuichuCulArea() {
    return tuichuCulArea;
  }

  public void setTuichuCulArea(double tuichuCulArea) {
    this.tuichuCulArea = tuichuCulArea;
  }


  public double getRoundAttachment_ShuidaoArea() {
    return roundAttachment_ShuidaoArea;
  }

  public void setRoundAttachment_ShuidaoArea(double roundAttachment_ShuidaoArea) {
    this.roundAttachment_ShuidaoArea = roundAttachment_ShuidaoArea;
  }


  public double getRoundAttachment_ShucaiArea() {
    return roundAttachment_ShucaiArea;
  }

  public void setRoundAttachment_ShucaiArea(double roundAttachment_ShucaiArea) {
    this.roundAttachment_ShucaiArea = roundAttachment_ShucaiArea;
  }


  public double getRoundAttachment_MiaomuArea() {
    return roundAttachment_MiaomuArea;
  }

  public void setRoundAttachment_MiaomuArea(double roundAttachment_MiaomuArea) {
    this.roundAttachment_MiaomuArea = roundAttachment_MiaomuArea;
  }


  public double getRoundAttachment_YutangArea() {
    return roundAttachment_YutangArea;
  }

  public void setRoundAttachment_YutangArea(double roundAttachment_YutangArea) {
    this.roundAttachment_YutangArea = roundAttachment_YutangArea;
  }


  public double getRoundAttachment_QitaArea() {
    return roundAttachment_QitaArea;
  }

  public void setRoundAttachment_QitaArea(double roundAttachment_QitaArea) {
    this.roundAttachment_QitaArea = roundAttachment_QitaArea;
  }


  public double getCompensateMoney() {
    return compensateMoney;
  }

  public void setCompensateMoney(double compensateMoney) {
    this.compensateMoney = compensateMoney;
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


  public java.sql.Timestamp getShenpiDate() {
    return shenpiDate;
  }

  public void setShenpiDate(java.sql.Timestamp shenpiDate) {
    this.shenpiDate = shenpiDate;
  }

}
