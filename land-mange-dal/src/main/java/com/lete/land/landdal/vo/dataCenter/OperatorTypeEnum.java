package com.lete.land.landdal.vo.dataCenter;

public enum  OperatorTypeEnum {
    Geti("个体经营",0),CunJiTi("村集体经营",1),ZuLin("租凭经营",2);
    private String desc;

    private Integer idnex;
    OperatorTypeEnum(String desc,Integer idnex){
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
