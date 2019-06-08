package com.lete.land.landdal.entity;

import javax.persistence.*;

@Entity
@Table(name = "e_stock_type_change_shenpi")
public class EStockTypeChangeShenpi {

 @Id
 @Column(name = "shareholder_name")
  private String shareholderName;
 @Column(name = "id_card")
  private long idCard;
 @Column(name = "sex")
  private String sex;
 @Column(name = "family_num")
  private long familyNum;
 @Column(name = "old_stock_type")
  private String oldStockType;
 @Column(name = "toal_stock")
  private long toalStock;
 @Column(name = "present_stock_type")
  private String presentStockType;
 @Column(name = "town")
  private String town;
 @Column(name = "village")
  private String village;
 @Column(name = "change_date")
  private java.sql.Timestamp changeDate;


  public String getShareholderName() {
    return shareholderName;
  }

  public void setShareholderName(String shareholderName) {
    this.shareholderName = shareholderName;
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


  public String getOldStockType() {
    return oldStockType;
  }

  public void setOldStockType(String oldStockType) {
    this.oldStockType = oldStockType;
  }


  public long getToalStock() {
    return toalStock;
  }

  public void setToalStock(long toalStock) {
    this.toalStock = toalStock;
  }


  public String getPresentStockType() {
    return presentStockType;
  }

  public void setPresentStockType(String presentStockType) {
    this.presentStockType = presentStockType;
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


  public java.sql.Timestamp getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(java.sql.Timestamp changeDate) {
    this.changeDate = changeDate;
  }

}
