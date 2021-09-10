package com.editSource.entities;

import java.util.Date;

public class People {

    private Integer id;
    private String name;
    private String email;
    private Integer gender;
    private Date birth;

    public People(Integer id, String name, String email, Integer gender, Date birth) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.birth = birth;
    }

    public  People(){

    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
