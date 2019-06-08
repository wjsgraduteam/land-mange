package com.lete.land.landdal.vo.exitMange;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by WJ on 2019/5/14 0014
 */
public class ExitApplyVo implements Serializable {

    private String town;

    private String village;

    private String householderName;

    private String idCard;

    private String socialSecurityType;

    private String stockType;

    private String applyExitLandNo;

    private String applyExitLanArea;

    private String houseSiteArea;

    private String houseArea;

    private String riceArea;

    private String vegeatableArea;

    private String miaoArea;

    private String fishPondArea;

    private String otherArea;

    private LocalDate applyDate;

    private String handleUser;

    private String townId;

    private List<ExitSocialChangeVo> familyMemberList;

    public ExitApplyVo() {
    }

    public ExitApplyVo(String town, String village, String householderName, String idCard, String socialSecurityType, String stockType, String applyExitLandNo, String applyExitLanArea, String houseSiteArea, String houseArea ) {
        this.town = town;
        this.village = village;
        this.householderName = householderName;
        this.idCard = idCard;
        this.socialSecurityType = socialSecurityType;
        this.stockType = stockType;
        this.applyExitLandNo = applyExitLandNo;
        this.applyExitLanArea = applyExitLanArea;
        this.houseSiteArea = houseSiteArea;
        this.houseArea = houseArea;
    }

    public List<ExitSocialChangeVo> getFamilyMemberList() {
        return familyMemberList;
    }

    public void setFamilyMemberList(List<ExitSocialChangeVo> familyMemberList) {
        this.familyMemberList = familyMemberList;
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

    public String getSocialSecurityType() {
        return socialSecurityType;
    }

    public void setSocialSecurityType(String socialSecurityType) {
        this.socialSecurityType = socialSecurityType;
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

    public String getHouseholderName() {
        return householderName;
    }

    public void setHouseholderName(String householderName) {
        this.householderName = householderName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getApplyExitLandNo() {
        return applyExitLandNo;
    }

    public void setApplyExitLandNo(String applyExitLandNo) {
        this.applyExitLandNo = applyExitLandNo;
    }

    public String getApplyExitLanArea() {
        return applyExitLanArea;
    }

    public void setApplyExitLanArea(String applyExitLanArea) {
        this.applyExitLanArea = applyExitLanArea;
    }

    public String getHouseSiteArea() {
        return houseSiteArea;
    }

    public void setHouseSiteArea(String houseSiteArea) {
        this.houseSiteArea = houseSiteArea;
    }

    public String getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(String houseArea) {
        this.houseArea = houseArea;
    }

    public String getRiceArea() {
        return riceArea;
    }

    public void setRiceArea(String riceArea) {
        this.riceArea = riceArea;
    }

    public String getVegeatableArea() {
        return vegeatableArea;
    }

    public void setVegeatableArea(String vegeatableArea) {
        this.vegeatableArea = vegeatableArea;
    }

    public String getMiaoArea() {
        return miaoArea;
    }

    public void setMiaoArea(String miaoArea) {
        this.miaoArea = miaoArea;
    }

    public String getFishPondArea() {
        return fishPondArea;
    }

    public void setFishPondArea(String fishPondArea) {
        this.fishPondArea = fishPondArea;
    }

    public String getOtherArea() {
        return otherArea;
    }

    public void setOtherArea(String otherArea) {
        this.otherArea = otherArea;
    }

    public LocalDate getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDate applyDate) {
        this.applyDate = applyDate;
    }
    public String getHandleUser() {
        return handleUser;
    }

    public void setHandleUser(String handleUser) {
        this.handleUser = handleUser;
    }


}
