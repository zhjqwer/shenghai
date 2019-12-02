package com.chuxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class GroupDetails implements Serializable {
    private Integer id;

    private Integer userId;

    private String groupIdentity;

    private String avatarUrl;

    private String nickname;

    private String phone;

    private Integer groupId;

    private String spareOne;

    private String spareTwo;

    private Date registerTime;

    private Date endTime;

    public GroupDetails() {
    }

    public GroupDetails(Integer id, Integer userId, String groupIdentity, String avatarUrl, String nickname, String phone, Integer groupId, String spareOne, String spareTwo, Date registerTime, Date endTime) {
        this.id = id;
        this.userId = userId;
        this.groupIdentity = groupIdentity;
        this.avatarUrl = avatarUrl;
        this.nickname = nickname;
        this.phone = phone;
        this.groupId = groupId;
        this.spareOne = spareOne;
        this.spareTwo = spareTwo;
        this.registerTime = registerTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "GroupDetails{" +
                "id=" + id +
                ", userId=" + userId +
                ", groupIdentity='" + groupIdentity + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", groupId=" + groupId +
                ", spareOne='" + spareOne + '\'' +
                ", spareTwo='" + spareTwo + '\'' +
                ", registerTime=" + registerTime +
                ", endTime=" + endTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGroupIdentity() {
        return groupIdentity;
    }

    public void setGroupIdentity(String groupIdentity) {
        this.groupIdentity = groupIdentity == null ? null : groupIdentity.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}