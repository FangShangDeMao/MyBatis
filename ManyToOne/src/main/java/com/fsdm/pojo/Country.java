package com.fsdm.pojo;

import java.util.Set;

/**
 * @author 房上的猫
 * @create 2018-08-24 9:55
 * @博客地址: https://www.cnblogs.com/lsy131479/
 **/

public class Country {
    private int cId;
    private String cName;

    public Country(int cId, String cName) {
        this.cId = cId;
        this.cName = cName;
    }

    public Country() {
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }


    @Override
    public String toString() {
        return "Country{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                '}';
    }
}
