package com.gxq.book.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserInfo implements Serializable {
    private int userId;
    private String userName;
    private String password;

    public UserInfo() {
    }

    public UserInfo(int id, String username, String pwd) {
        super();
        this.userId = id;
        this.userName = username;
        this.password = pwd;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) {
        this.userId = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pwd) {
        this.password = pwd;
    }
}
