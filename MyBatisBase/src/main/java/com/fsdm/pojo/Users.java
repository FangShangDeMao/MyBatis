package com.fsdm.pojo;

import java.util.List;

/**
 * @author 房上的猫
 * @create 2018-08-16 16:56
 * @博客地址: https://www.cnblogs.com/lsy131479/
 **/

public class Users {
    private int id;
    private String userName;
    private String password;
    private List<Uu> list;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Uu> getList() {
        return list;
    }

    public void setList(List<Uu> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", list=" + list +
                '}';
    }
}
