package com.jing.tong.domain;

import java.io.Serializable;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua
 * @create 2017-03-20-15:33
 */
public class User implements Serializable{
    private long id;
    private String username;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
