package com.chuxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShipCertificate implements Serializable {
    private Integer id;

    private Integer shipInspectionId;

    private String frontalInspectionImg;

    private String backInspectionImg;

    private Date inspectionFailureTime;

    private Integer optionalOneId;

    private String frontalOptionalOneImg;

    private String backOptionalOneImg;

    private Date optionalOneFailureTime;

    private Integer optionalTwoId;

    private String frontalOptionalTwoImg;

    private String backOptionalTwoImg;

    private Date optionalTwoFailureTime;

    private Integer optionalThreeId;

    private String frontalOptionalThreeImg;

    private String backOptionalThreeImg;

    private Date optionalThreeFailureTime;

    private Integer optionalFourId;

    private String frontalOptionalFourImg;

    private String backOptionalFourImg;

    private Date optionalFourFailureTime;

    private Date registerTime;

    private Date updateTime;

    private Integer updateName;

    public ShipCertificate() {
    }

    public ShipCertificate(Integer id, Integer shipInspectionId, String frontalInspectionImg, String backInspectionImg, Date inspectionFailureTime, Integer optionalOneId, String frontalOptionalOneImg, String backOptionalOneImg, Date optionalOneFailureTime, Integer optionalTwoId, String frontalOptionalTwoImg, String backOptionalTwoImg, Date optionalTwoFailureTime, Integer optionalThreeId, String frontalOptionalThreeImg, String backOptionalThreeImg, Date optionalThreeFailureTime, Integer optionalFourId, String frontalOptionalFourImg, String backOptionalFourImg, Date optionalFourFailureTime, Date registerTime, Date updateTime, Integer updateName) {
        this.id = id;
        this.shipInspectionId = shipInspectionId;
        this.frontalInspectionImg = frontalInspectionImg;
        this.backInspectionImg = backInspectionImg;
        this.inspectionFailureTime = inspectionFailureTime;
        this.optionalOneId = optionalOneId;
        this.frontalOptionalOneImg = frontalOptionalOneImg;
        this.backOptionalOneImg = backOptionalOneImg;
        this.optionalOneFailureTime = optionalOneFailureTime;
        this.optionalTwoId = optionalTwoId;
        this.frontalOptionalTwoImg = frontalOptionalTwoImg;
        this.backOptionalTwoImg = backOptionalTwoImg;
        this.optionalTwoFailureTime = optionalTwoFailureTime;
        this.optionalThreeId = optionalThreeId;
        this.frontalOptionalThreeImg = frontalOptionalThreeImg;
        this.backOptionalThreeImg = backOptionalThreeImg;
        this.optionalThreeFailureTime = optionalThreeFailureTime;
        this.optionalFourId = optionalFourId;
        this.frontalOptionalFourImg = frontalOptionalFourImg;
        this.backOptionalFourImg = backOptionalFourImg;
        this.optionalFourFailureTime = optionalFourFailureTime;
        this.registerTime = registerTime;
        this.updateTime = updateTime;
        this.updateName = updateName;
    }

    @Override
    public String toString() {
        return "ShipCertificate{" +
                "id=" + id +
                ", shipInspectionId=" + shipInspectionId +
                ", frontalInspectionImg='" + frontalInspectionImg + '\'' +
                ", backInspectionImg='" + backInspectionImg + '\'' +
                ", inspectionFailureTime=" + inspectionFailureTime +
                ", optionalOneId=" + optionalOneId +
                ", frontalOptionalOneImg='" + frontalOptionalOneImg + '\'' +
                ", backOptionalOneImg='" + backOptionalOneImg + '\'' +
                ", optionalOneFailureTime=" + optionalOneFailureTime +
                ", optionalTwoId=" + optionalTwoId +
                ", frontalOptionalTwoImg='" + frontalOptionalTwoImg + '\'' +
                ", backOptionalTwoImg='" + backOptionalTwoImg + '\'' +
                ", optionalTwoFailureTime=" + optionalTwoFailureTime +
                ", optionalThreeId=" + optionalThreeId +
                ", frontalOptionalThreeImg='" + frontalOptionalThreeImg + '\'' +
                ", backOptionalThreeImg='" + backOptionalThreeImg + '\'' +
                ", optionalThreeFailureTime=" + optionalThreeFailureTime +
                ", optionalFourId=" + optionalFourId +
                ", frontalOptionalFourImg='" + frontalOptionalFourImg + '\'' +
                ", backOptionalFourImg='" + backOptionalFourImg + '\'' +
                ", optionalFourFailureTime=" + optionalFourFailureTime +
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

    public Integer getShipInspectionId() {
        return shipInspectionId;
    }

    public void setShipInspectionId(Integer shipInspectionId) {
        this.shipInspectionId = shipInspectionId;
    }

    public String getFrontalInspectionImg() {
        return frontalInspectionImg;
    }

    public void setFrontalInspectionImg(String frontalInspectionImg) {
        this.frontalInspectionImg = frontalInspectionImg == null ? null : frontalInspectionImg.trim();
    }

    public String getBackInspectionImg() {
        return backInspectionImg;
    }

    public void setBackInspectionImg(String backInspectionImg) {
        this.backInspectionImg = backInspectionImg == null ? null : backInspectionImg.trim();
    }

    public Date getInspectionFailureTime() {
        return inspectionFailureTime;
    }

    public void setInspectionFailureTime(Date inspectionFailureTime) {
        this.inspectionFailureTime = inspectionFailureTime;
    }

    public Integer getOptionalOneId() {
        return optionalOneId;
    }

    public void setOptionalOneId(Integer optionalOneId) {
        this.optionalOneId = optionalOneId;
    }

    public String getFrontalOptionalOneImg() {
        return frontalOptionalOneImg;
    }

    public void setFrontalOptionalOneImg(String frontalOptionalOneImg) {
        this.frontalOptionalOneImg = frontalOptionalOneImg == null ? null : frontalOptionalOneImg.trim();
    }

    public String getBackOptionalOneImg() {
        return backOptionalOneImg;
    }

    public void setBackOptionalOneImg(String backOptionalOneImg) {
        this.backOptionalOneImg = backOptionalOneImg == null ? null : backOptionalOneImg.trim();
    }

    public Date getOptionalOneFailureTime() {
        return optionalOneFailureTime;
    }

    public void setOptionalOneFailureTime(Date optionalOneFailureTime) {
        this.optionalOneFailureTime = optionalOneFailureTime;
    }

    public Integer getOptionalTwoId() {
        return optionalTwoId;
    }

    public void setOptionalTwoId(Integer optionalTwoId) {
        this.optionalTwoId = optionalTwoId;
    }

    public String getFrontalOptionalTwoImg() {
        return frontalOptionalTwoImg;
    }

    public void setFrontalOptionalTwoImg(String frontalOptionalTwoImg) {
        this.frontalOptionalTwoImg = frontalOptionalTwoImg == null ? null : frontalOptionalTwoImg.trim();
    }

    public String getBackOptionalTwoImg() {
        return backOptionalTwoImg;
    }

    public void setBackOptionalTwoImg(String backOptionalTwoImg) {
        this.backOptionalTwoImg = backOptionalTwoImg == null ? null : backOptionalTwoImg.trim();
    }

    public Date getOptionalTwoFailureTime() {
        return optionalTwoFailureTime;
    }

    public void setOptionalTwoFailureTime(Date optionalTwoFailureTime) {
        this.optionalTwoFailureTime = optionalTwoFailureTime;
    }

    public Integer getOptionalThreeId() {
        return optionalThreeId;
    }

    public void setOptionalThreeId(Integer optionalThreeId) {
        this.optionalThreeId = optionalThreeId;
    }

    public String getFrontalOptionalThreeImg() {
        return frontalOptionalThreeImg;
    }

    public void setFrontalOptionalThreeImg(String frontalOptionalThreeImg) {
        this.frontalOptionalThreeImg = frontalOptionalThreeImg == null ? null : frontalOptionalThreeImg.trim();
    }

    public String getBackOptionalThreeImg() {
        return backOptionalThreeImg;
    }

    public void setBackOptionalThreeImg(String backOptionalThreeImg) {
        this.backOptionalThreeImg = backOptionalThreeImg == null ? null : backOptionalThreeImg.trim();
    }

    public Date getOptionalThreeFailureTime() {
        return optionalThreeFailureTime;
    }

    public void setOptionalThreeFailureTime(Date optionalThreeFailureTime) {
        this.optionalThreeFailureTime = optionalThreeFailureTime;
    }

    public Integer getOptionalFourId() {
        return optionalFourId;
    }

    public void setOptionalFourId(Integer optionalFourId) {
        this.optionalFourId = optionalFourId;
    }

    public String getFrontalOptionalFourImg() {
        return frontalOptionalFourImg;
    }

    public void setFrontalOptionalFourImg(String frontalOptionalFourImg) {
        this.frontalOptionalFourImg = frontalOptionalFourImg == null ? null : frontalOptionalFourImg.trim();
    }

    public String getBackOptionalFourImg() {
        return backOptionalFourImg;
    }

    public void setBackOptionalFourImg(String backOptionalFourImg) {
        this.backOptionalFourImg = backOptionalFourImg == null ? null : backOptionalFourImg.trim();
    }

    public Date getOptionalFourFailureTime() {
        return optionalFourFailureTime;
    }

    public void setOptionalFourFailureTime(Date optionalFourFailureTime) {
        this.optionalFourFailureTime = optionalFourFailureTime;
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