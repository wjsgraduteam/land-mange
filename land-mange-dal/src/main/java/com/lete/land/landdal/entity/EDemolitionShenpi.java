package com.lete.land.landdal.entity;

import javax.persistence.*;

@Entity
@Table(name = "e_demolition_shenpi")
public class EDemolitionShenpi {

 @Id
 @Column(name = "hr_name")
  private String hrName;
 @Column(name = "id_card")
  private long idCard;
 @Column(name = "sex")
  private String sex;
 @Column(name = "demolition_compensation_pop_num")
  private long demolitionCompensationPopNum;
 @Column(name = "pre_demolition_home_stead_area")
  private double preDemolitionHomeSteadArea;
 @Column(name = "pre_demolition_building_area")
  private double preDemolitionBuildingArea;
 @Column(name = "town")
  private String town;
 @Column(name = "village")
  private String village;
 @Column(name = "place_reason")
  private String placeReason;
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


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public long getDemolitionCompensationPopNum() {
    return demolitionCompensationPopNum;
  }

  public void setDemolitionCompensationPopNum(long demolitionCompensationPopNum) {
    this.demolitionCompensationPopNum = demolitionCompensationPopNum;
  }


  public double getPreDemolitionHomeSteadArea() {
    return preDemolitionHomeSteadArea;
  }

  public void setPreDemolitionHomeSteadArea(double preDemolitionHomeSteadArea) {
    this.preDemolitionHomeSteadArea = preDemolitionHomeSteadArea;
  }


  public double getPreDemolitionBuildingArea() {
    return preDemolitionBuildingArea;
  }

  public void setPreDemolitionBuildingArea(double preDemolitionBuildingArea) {
    this.preDemolitionBuildingArea = preDemolitionBuildingArea;
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


  public java.sql.Timestamp getShenpiDate() {
    return shenpiDate;
  }

  public void setShenpiDate(java.sql.Timestamp shenpiDate) {
    this.shenpiDate = shenpiDate;
  }

}
