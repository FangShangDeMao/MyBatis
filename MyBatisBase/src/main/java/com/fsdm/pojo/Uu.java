package com.fsdm.pojo;

/**
 * @author 房上的猫
 * @create 2018-08-16 16:57
 * @博客地址: https://www.cnblogs.com/lsy131479/
 **/

public class Uu {
    private int uid;
    private String name;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Uu{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                '}';
    }
}
