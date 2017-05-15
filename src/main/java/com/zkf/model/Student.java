package com.zkf.model;

import java.io.Serializable;

/**
 * Created by zkf on 2017/3/27 
 */
public class Student implements Serializable {
    private String id;
    private String name;
    private Integer age;
    private Boolean sex;


    public Student() {
    }

    public Student(String id, String name, Integer age, Boolean sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }
    public void setSex(Boolean sex) {
        this.sex = sex;
    }


}  