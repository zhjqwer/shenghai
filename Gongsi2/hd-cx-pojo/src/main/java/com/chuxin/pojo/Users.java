package com.chuxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
    private Integer id;

    private String name;

    private String avatarUrl;

    private String phone;

    private String password;

    private Integer power;

    private Integer state;

    private Date registerTime;

    private Date updateTime;

    private Integer updateName;

    public Users() {
    }

    public Users(Integer id, String name, String avatarUrl, String phone, String password, Integer power, Integer state, Date registerTime, Date updateTime, Integer updateName) {
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.phone = phone;
        this.password = password;
        this.power = power;
        this.state = state;
        this.registerTime = registerTime;
        this.updateTime = updateTime;
        this.updateName = updateName;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", power=" + power +
                ", state=" + state +
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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