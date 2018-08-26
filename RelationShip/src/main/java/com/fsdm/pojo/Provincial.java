package com.fsdm.pojo;

/**
 * @author 房上的猫
 * @create 2018-08-24 9:58
 * @博客地址: https://www.cnblogs.com/lsy131479/
 **/

public class Provincial {
    private int pId;
    private String pName;

    public Provincial() {
    }

    public Provincial(int pId, String pName) {
        this.pId = pId;
        this.pName = pName;
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

    @Override
    public String toString() {
        return "Provincial{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                '}';
    }
}
