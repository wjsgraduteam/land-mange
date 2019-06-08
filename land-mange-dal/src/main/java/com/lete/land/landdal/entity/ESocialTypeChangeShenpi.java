package com.lete.land.landdal.entity;

import javax.persistence.*;

@Entity
@Table(name = "e_social_type_change_shenpi")
public class ESocialTypeChangeShenpi {

 @Id
 @Column(name = "name")
  private String name;
 @Column(name = "id_card")
  private String idCard;
 @Column(name = "sex")
  private String sex;
 @Column(name = "born_date")
  private java.sql.Timestamp bornDate;
 @Column(name = "relation")
  private String relation;
 @Column(name = "old_social_type")
  private String oldSocialType;
 @Column(name = "present_social_type")
  private String presentSocialType;
 @Column(name = "town")
  private String town;
 @Column(name = "village")
  private String village;
 @Column(name = "register_date")
  private java.sql.Timestamp registerDate;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public java.sql.Timestamp getBornDate() {
    return bornDate;
  }

  public void setBornDate(java.sql.Timestamp bornDate) {
    this.bornDate = bornDate;
  }


  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }


  public String getOldSocialType() {
    return oldSocialType;
  }

  public void setOldSocialType(String oldSocialType) {
    this.oldSocialType = oldSocialType;
  }


  public String getPresentSocialType() {
    return presentSocialType;
  }

  public void setPresentSocialType(String presentSocialType) {
    this.presentSocialType = presentSocialType;
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


  public java.sql.Timestamp getRegisterDate() {
    return registerDate;
  }

  public void setRegisterDate(java.sql.Timestamp registerDate) {
    this.registerDate = registerDate;
  }

}
