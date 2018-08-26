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
    private Set<Provincial> provincials;

    public Country(int cId, String cName, Set<Provincial> provincials) {
        this.cId = cId;
        this.cName = cName;
        this.provincials = provincials;
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

    public Set<Provincial> getProvincials() {
        return provincials;
    }

    public void setProvincials(Set<Provincial> provincials) {
        this.provincials = provincials;
    }

    @Override
    public String toString() {
        return "Country{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", provincials=" + provincials +
                '}';
    }
}
