package com.fsdm.pojo;

/**
 * @author 房上的猫
 * @create 2018-08-24 9:58
 * @博客地址: https://www.cnblogs.com/lsy131479/
 **/

public class Provincial {
    private int pId;
    private String pName;
    private Country country;


    public Provincial() {
    }

    public Provincial(int pId, String pName, Country country) {
        this.pId = pId;
        this.pName = pName;
        this.country = country;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Provincial{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", country=" + country +
                '}';
    }
}
