package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "d_shareholder_information")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class DataHolderInformation {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @Column(name = "town_id")
    private String townId;
    @Column(name = "shareholder_name")
    private String shareholderName;
    @Column(name = "shareholder_num")
    private String shareholderNum;
    @Column(name = "id_card")
    private String idCard;
    @Column(name = "tel")
    private String tel;
    @Column(name = "family_num")
    private Integer familyNum;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "toal_stock")
    private String toalStock;
    @Column(name = "stock_type")
    private Integer stockType;
    @Column(name = "join_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date join_date;
    @Column(name = "year")
    private String year;

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

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

    public String getShareholderName() {
        return shareholderName;
    }

    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName;
    }

    public String getShareholderNum() {
        return shareholderNum;
    }

    public void setShareholderNum(String shareholderNum) {
        this.shareholderNum = shareholderNum;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getFamilyNum() {
        return familyNum;
    }

    public void setFamilyNum(Integer familyNum) {
        this.familyNum = familyNum;
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

    public String getToalStock() {
        return toalStock;
    }

    public void setToalStock(String toalStock) {
        this.toalStock = toalStock;
    }

    public Integer getStockType() {
        return stockType;
    }

    public void setStockType(Integer stockType) {
        this.stockType = stockType;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }
}
