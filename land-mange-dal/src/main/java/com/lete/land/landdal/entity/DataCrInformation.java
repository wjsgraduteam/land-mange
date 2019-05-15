package com.lete.land.landdal.entity;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "d_cr_information")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class DataCrInformation {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "id")
     private String id;
    @Column(name = "town_id")
    private String townId;
    @Column(name = "hr_num")
    private String hrNum;
    @Column(name = "hr_name")
    private String hrName;
    @Column(name = "id_card")
    private String idCard;
    @Column(name = "town")
    private String town;
    @Column(name = "village")
    private String village;
    @Column(name = "is_special")
    private String isSpecial;
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

    public String getHrNum() {
        return hrNum;
    }

    public void setHrNum(String hrNum) {
        this.hrNum = hrNum;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial;
    }
}
