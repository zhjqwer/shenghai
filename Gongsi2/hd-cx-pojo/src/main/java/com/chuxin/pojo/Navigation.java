package com.chuxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class Navigation implements Serializable {
    private Integer id;

    private String theme;

    private String spareOne;

    private String spareTwo;

    private Date registerTime;

    private Date updateTime;

    private Integer updateName;

    public Navigation() {
    }

    public Navigation(Integer id, String theme, String spareOne, String spareTwo, Date registerTime, Date updateTime, Integer updateName) {
        this.id = id;
        this.theme = theme;
        this.spareOne = spareOne;
        this.spareTwo = spareTwo;
        this.registerTime = registerTime;
        this.updateTime = updateTime;
        this.updateName = updateName;
    }

    @Override
    public String toString() {
        return "Navigation{" +
                "id=" + id +
                ", theme='" + theme + '\'' +
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

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
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