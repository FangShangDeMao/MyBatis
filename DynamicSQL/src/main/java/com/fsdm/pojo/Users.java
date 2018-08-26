package com.fsdm.pojo;

public class Users {
    private int id;//id
    private String userName;//用户名
    private String password;//密码

    public Users(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public Users(int id) {
        this.id = id;
    }

    public Users(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Users() {
    }

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

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
