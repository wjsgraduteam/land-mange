package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "e_stock_type_change")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class ExitStockTypeChange {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @Column(name = "pro_id")
    private String proId;
    @Column(name = "shareholder_name")
    private String shareholderName;
    @Column(name = "id_card")
    private String idCard;
    @Column(name = "sex")
    private String sex;
    @Column(name = "family_num")
    private Integer familyNum;
    @Column(name = "present_stock_type")
    private Integer presentStockType;
    @Column(name = "present_toal_stock")
    private Integer presentToalStock;
    @Column(name = "new_stock_type")
    private Integer newStockType;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "register_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
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

    public String getShareholderName() {
        return shareholderName;
    }

    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setFamilyNum(Integer familyNum) {
        this.familyNum = familyNum;
    }

    public Integer getPresentStockType() {
        return presentStockType;
    }

    public void setPresentStockType(Integer presentStockType) {
        this.presentStockType = presentStockType;
    }

    public Integer getPresentToalStock() {
        return presentToalStock;
    }

    public void setPresentToalStock(Integer presentToalStock) {
        this.presentToalStock = presentToalStock;
    }

    public Integer getNewStockType() {
        return newStockType;
    }

    public void setNewStockType(Integer newStockType) {
        this.newStockType = newStockType;
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
