package com.itheima.domain;

import java.io.Serializable;

public class User implements Serializable{
    private String name;
    private String sex;
    private Integer id;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
