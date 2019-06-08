package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "e_social_type_change")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class ExitSocialTypeChange {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @Column(name = "pro_id")
    private String proId;
    @Column(name = "hourse_holder_id")
    private String hourseHolderId;
    @Column(name = "name")
    private String name;
    @Column(name = "id_card")
    private String idCard;
    @Column(name = "sex")
    private String sex;
    @Column(name = "born_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate bornDate;
    @Column(name = "relation")
    private String relation;
    @Column(name = "social_security_type")
    private Integer socialSecurityType;
    @Column(name = "change_type")
    private Integer changeType;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "register_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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

    public String getHourseHolderId() {
        return hourseHolderId;
    }

    public void setHourseHolderId(String hourseHolderId) {
        this.hourseHolderId = hourseHolderId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }


    public Integer getSocialSecurityType() {
        return socialSecurityType;
    }

    public void setSocialSecurityType(Integer socialSecurityType) {
        this.socialSecurityType = socialSecurityType;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
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


    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
}
