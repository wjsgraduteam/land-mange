package com.lete.land.landdal.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "b_income_distribution")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class BusinessIncomeDistribution {
 @Id
 @Column(name = "id")
 @GeneratedValue(generator = "jpa-uuid")
 private String id;
 @Column(name = "town")
  private String town;
 @Column(name = "village")
  private String village;
 @Column(name = "income")
  private Double income;
 @Column(name = "rental_income")
  private Double rentalIncome;
 @Column(name = "village_distribution")
  private Double villageDistribution;
 @Column(name = "shareholder_distribution")
  private Double shareholderDistribution;
 @Column(name = "retained_income")
  private Double retainedIncome;
 @Column(name = "previous_turn_income")
  private Double previousTurnIncome;
 @Column(name = "rural_stock_total")
  private Double ruralStockTotal;
 @Column(name = "rural_stock_price")
  private Double ruralStockPrice;
 @Column(name = "city_stock_total")
  private Double cityStockTotal;
 @Column(name = "city_stock_price")
  private Double cityStockPrice;
 @Column(name = "report_date")
 @DateTimeFormat(pattern = "yyyy-mm-dd")
  private LocalDate reportDate;
 @Column(name = "year")
 @DateTimeFormat(pattern = "yyyy-mm-dd")
  private LocalDate year;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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


  public Double getIncome() {
    return income;
  }

  public void setIncome(Double income) {
    this.income = income;
  }


  public Double getRentalIncome() {
    return rentalIncome;
  }

  public void setRentalIncome(Double rentalIncome) {
    this.rentalIncome = rentalIncome;
  }


  public Double getVillageDistribution() {
    return villageDistribution;
  }

  public void setVillageDistribution(Double villageDistribution) {
    this.villageDistribution = villageDistribution;
  }


  public Double getShareholderDistribution() {
    return shareholderDistribution;
  }

  public void setShareholderDistribution(Double shareholderDistribution) {
    this.shareholderDistribution = shareholderDistribution;
  }


  public Double getRetainedIncome() {
    return retainedIncome;
  }

  public void setRetainedIncome(Double retainedIncome) {
    this.retainedIncome = retainedIncome;
  }


  public Double getPreviousTurnIncome() {
    return previousTurnIncome;
  }

  public void setPreviousTurnIncome(Double previousTurnIncome) {
    this.previousTurnIncome = previousTurnIncome;
  }


  public Double getRuralStockTotal() {
    return ruralStockTotal;
  }

  public void setRuralStockTotal(Double ruralStockTotal) {
    this.ruralStockTotal = ruralStockTotal;
  }


  public Double getRuralStockPrice() {
    return ruralStockPrice;
  }

  public void setRuralStockPrice(Double ruralStockPrice) {
    this.ruralStockPrice = ruralStockPrice;
  }


  public Double getCityStockTotal() {
    return cityStockTotal;
  }

  public void setCityStockTotal(Double cityStockTotal) {
    this.cityStockTotal = cityStockTotal;
  }


  public Double getCityStockPrice() {
    return cityStockPrice;
  }

  public void setCityStockPrice(Double cityStockPrice) {
    this.cityStockPrice = cityStockPrice;
  }


    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }
}
