package com.lete.land.landdal.vo.exitMange;

/**
 * Created by WJ on 2019/5/14 0014
 */
public class ExitSocialChangeVo {
    private String id;

    private String name;

    private String idCard;

    private String relation;

    private String socialSecurityType;

    private String presentStockType;

    public String getSocialSecurityType() {
        return socialSecurityType;
    }

    public void setSocialSecurityType(String socialSecurityType) {
        this.socialSecurityType = socialSecurityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresentStockType() {
        return presentStockType;
    }

    public void setPresentStockType(String presentStockType) {
        this.presentStockType = presentStockType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
