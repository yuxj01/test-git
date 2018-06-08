package com.baizhi.eneity;

import java.io.Serializable;

/**
 * Created by 于雪娇 on 2018/6/8.
 */
public class User implements Serializable{
    private String name;
    private String phone;
    private Integer id;
    private  String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {

    }

    public User(String name, Integer id, String password) {

        this.name = name;
        this.id = id;
        this.password = password;
    }
}
