package com.lete.land.landdal.vo.finalVo;

public enum SharesEnum {

    CITY(0,"城市型"),TOWN(1,"农村型");
    Integer index;
    String comments;

    SharesEnum(Integer index, String comments) {
        this.index = index;
        this.comments = comments;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
