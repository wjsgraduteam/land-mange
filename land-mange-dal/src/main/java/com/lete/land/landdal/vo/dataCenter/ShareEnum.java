package com.lete.land.landdal.vo.dataCenter;

public enum ShareEnum {
    City("城市型",0),Vill("农村型",1);

    private String desc;

    private Integer idnex;

    ShareEnum(String desc, Integer idnex) {
        this.desc = desc;
        this.idnex = idnex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getIdnex() {
        return idnex;
    }

    public void setIdnex(Integer idnex) {
        this.idnex = idnex;
    }
}
