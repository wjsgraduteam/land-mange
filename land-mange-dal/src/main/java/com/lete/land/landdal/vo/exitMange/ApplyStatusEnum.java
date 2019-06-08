package com.lete.land.landdal.vo.exitMange;

/**
 * Created by WJ on 2019/5/15 0015
 */
public enum ApplyStatusEnum {
    NOT(0,"未审核"),STA(1,"审核通过"),URG(2,"审核未通过"),UNDO(3,"未审批"),FIN(4,"审批通过"),NOTFIN(5,"审批未通过");
    private Integer index;

    private String desc;

    ApplyStatusEnum(Integer index, String desc) {
        this.index = index;
        this.desc = desc;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }}
