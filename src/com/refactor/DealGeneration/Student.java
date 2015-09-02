package com.refactor.DealGeneration;

/**
 * Created by wenchai on 2015/8/27.
 */
public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String name;
    private int age;
    private String sex;
    private String address;


    public boolean isMan() {
        if (sex=="M")
            return true;
        else return false;
    }
}
