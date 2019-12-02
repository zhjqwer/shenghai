package com.chuxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class Personal implements Serializable {
    private Integer id;

    private String myFunction;

    private Integer power;

    private String spareOne;

    private String spareTwo;

    private Date registerTime;

    private Date updateTime;

    private Integer updateName;

    public Personal() {
    }

    public Personal(Integer id, String myFunction, Integer power, String spareOne, String spareTwo, Date registerTime, Date updateTime, Integer updateName) {
        this.id = id;
        this.myFunction = myFunction;
        this.power = power;
        this.spareOne = spareOne;
        this.spareTwo = spareTwo;
        this.registerTime = registerTime;
        this.updateTime = updateTime;
        this.updateName = updateName;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "id=" + id +
                ", myFunction='" + myFunction + '\'' +
                ", power=" + power +
                ", spareOne='" + spareOne + '\'' +
                ", spareTwo='" + spareTwo + '\'' +
                ", registerTime=" + registerTime +
                ", updateTime=" + updateTime +
                ", updateName=" + updateName +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMyFunction() {
        return myFunction;
    }

    public void setMyFunction(String myFunction) {
        this.myFunction = myFunction == null ? null : myFunction.trim();
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getSpareOne() {
        return spareOne;
    }

    public void setSpareOne(String spareOne) {
        this.spareOne = spareOne == null ? null : spareOne.trim();
    }

    public String getSpareTwo() {
        return spareTwo;
    }

    public void setSpareTwo(String spareTwo) {
        this.spareTwo = spareTwo == null ? null : spareTwo.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateName() {
        return updateName;
    }

    public void setUpdateName(Integer updateName) {
        this.updateName = updateName;
    }
}