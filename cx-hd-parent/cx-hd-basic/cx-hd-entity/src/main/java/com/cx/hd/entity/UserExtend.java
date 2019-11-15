package com.cx.hd.entity;

import java.io.Serializable;
import java.util.Date;

public class UserExtend implements Serializable {
    private Integer id;

    private Integer uId;

    private String realName;

    private String idCard;

    private String idCardImgFrontal;

    private String idCardImgBack;

    private String sex;

    private Date birthday;

    private Integer grade;

    private String certificateImgFrontal;

    private String certificateImgBack;

    private Integer shipId;

    private Integer commentId;

    private String drivingLicenseId;

    private String drivingLicenseImgFrontal;

    private String drivingLicenseImgBack;

    private Date drivingLicenseStartTime;

    private Date drivingLicenseEndTime;

    private String remarks;

    private String spareOne;

    private String spareTwo;

    private Date registerTime;

    private Date updateTime;

    private Integer updateName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getIdCardImgFrontal() {
        return idCardImgFrontal;
    }

    public void setIdCardImgFrontal(String idCardImgFrontal) {
        this.idCardImgFrontal = idCardImgFrontal == null ? null : idCardImgFrontal.trim();
    }

    public String getIdCardImgBack() {
        return idCardImgBack;
    }

    public void setIdCardImgBack(String idCardImgBack) {
        this.idCardImgBack = idCardImgBack == null ? null : idCardImgBack.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getCertificateImgFrontal() {
        return certificateImgFrontal;
    }

    public void setCertificateImgFrontal(String certificateImgFrontal) {
        this.certificateImgFrontal = certificateImgFrontal == null ? null : certificateImgFrontal.trim();
    }

    public String getCertificateImgBack() {
        return certificateImgBack;
    }

    public void setCertificateImgBack(String certificateImgBack) {
        this.certificateImgBack = certificateImgBack == null ? null : certificateImgBack.trim();
    }

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getDrivingLicenseId() {
        return drivingLicenseId;
    }

    public void setDrivingLicenseId(String drivingLicenseId) {
        this.drivingLicenseId = drivingLicenseId == null ? null : drivingLicenseId.trim();
    }

    public String getDrivingLicenseImgFrontal() {
        return drivingLicenseImgFrontal;
    }

    public void setDrivingLicenseImgFrontal(String drivingLicenseImgFrontal) {
        this.drivingLicenseImgFrontal = drivingLicenseImgFrontal == null ? null : drivingLicenseImgFrontal.trim();
    }

    public String getDrivingLicenseImgBack() {
        return drivingLicenseImgBack;
    }

    public void setDrivingLicenseImgBack(String drivingLicenseImgBack) {
        this.drivingLicenseImgBack = drivingLicenseImgBack == null ? null : drivingLicenseImgBack.trim();
    }

    public Date getDrivingLicenseStartTime() {
        return drivingLicenseStartTime;
    }

    public void setDrivingLicenseStartTime(Date drivingLicenseStartTime) {
        this.drivingLicenseStartTime = drivingLicenseStartTime;
    }

    public Date getDrivingLicenseEndTime() {
        return drivingLicenseEndTime;
    }

    public void setDrivingLicenseEndTime(Date drivingLicenseEndTime) {
        this.drivingLicenseEndTime = drivingLicenseEndTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    @Override
    public String toString() {
        return "UserExtend{" +
                "id=" + id +
                ", uId=" + uId +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", idCardImgFrontal='" + idCardImgFrontal + '\'' +
                ", idCardImgBack='" + idCardImgBack + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", grade=" + grade +
                ", certificateImgFrontal='" + certificateImgFrontal + '\'' +
                ", certificateImgBack='" + certificateImgBack + '\'' +
                ", shipId=" + shipId +
                ", commentId=" + commentId +
                ", drivingLicenseId='" + drivingLicenseId + '\'' +
                ", drivingLicenseImgFrontal='" + drivingLicenseImgFrontal + '\'' +
                ", drivingLicenseImgBack='" + drivingLicenseImgBack + '\'' +
                ", drivingLicenseStartTime=" + drivingLicenseStartTime +
                ", drivingLicenseEndTime=" + drivingLicenseEndTime +
                ", remarks='" + remarks + '\'' +
                ", spareOne='" + spareOne + '\'' +
                ", spareTwo='" + spareTwo + '\'' +
                ", registerTime=" + registerTime +
                ", updateTime=" + updateTime +
                ", updateName=" + updateName +
                '}';
    }
}