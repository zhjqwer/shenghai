package com.chuxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShipInformation implements Serializable {
    private Integer id;

    private Integer uId;

    private String shipName;

    private String shipImg;

    private String shipCoding;

    private String shipType;

    private Integer shipLength;

    private Integer shipWidth;

    private Integer loadLimiting;

    private Integer shipSpeed;

    private String navigationArea;

    private Integer state;

    private String remarks;

    private String spareOne;

    private String spareTwo;

    private Integer certificateId;

    private Date registerTime;

    private Date updateTime;

    private Integer updateName;

    public ShipInformation() {
    }

    public ShipInformation(Integer id, Integer uId, String shipName, String shipImg, String shipCoding, String shipType, Integer shipLength, Integer shipWidth, Integer loadLimiting, Integer shipSpeed, String navigationArea, Integer state, String remarks, String spareOne, String spareTwo, Integer certificateId, Date registerTime, Date updateTime, Integer updateName) {
        this.id = id;
        this.uId = uId;
        this.shipName = shipName;
        this.shipImg = shipImg;
        this.shipCoding = shipCoding;
        this.shipType = shipType;
        this.shipLength = shipLength;
        this.shipWidth = shipWidth;
        this.loadLimiting = loadLimiting;
        this.shipSpeed = shipSpeed;
        this.navigationArea = navigationArea;
        this.state = state;
        this.remarks = remarks;
        this.spareOne = spareOne;
        this.spareTwo = spareTwo;
        this.certificateId = certificateId;
        this.registerTime = registerTime;
        this.updateTime = updateTime;
        this.updateName = updateName;
    }

    @Override
    public String toString() {
        return "ShipInformation{" +
                "id=" + id +
                ", uId=" + uId +
                ", shipName='" + shipName + '\'' +
                ", shipImg='" + shipImg + '\'' +
                ", shipCoding='" + shipCoding + '\'' +
                ", shipType='" + shipType + '\'' +
                ", shipLength=" + shipLength +
                ", shipWidth=" + shipWidth +
                ", loadLimiting=" + loadLimiting +
                ", shipSpeed=" + shipSpeed +
                ", navigationArea='" + navigationArea + '\'' +
                ", state=" + state +
                ", remarks='" + remarks + '\'' +
                ", spareOne='" + spareOne + '\'' +
                ", spareTwo='" + spareTwo + '\'' +
                ", certificateId=" + certificateId +
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

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public String getShipImg() {
        return shipImg;
    }

    public void setShipImg(String shipImg) {
        this.shipImg = shipImg == null ? null : shipImg.trim();
    }

    public String getShipCoding() {
        return shipCoding;
    }

    public void setShipCoding(String shipCoding) {
        this.shipCoding = shipCoding == null ? null : shipCoding.trim();
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType == null ? null : shipType.trim();
    }

    public Integer getShipLength() {
        return shipLength;
    }

    public void setShipLength(Integer shipLength) {
        this.shipLength = shipLength;
    }

    public Integer getShipWidth() {
        return shipWidth;
    }

    public void setShipWidth(Integer shipWidth) {
        this.shipWidth = shipWidth;
    }

    public Integer getLoadLimiting() {
        return loadLimiting;
    }

    public void setLoadLimiting(Integer loadLimiting) {
        this.loadLimiting = loadLimiting;
    }

    public Integer getShipSpeed() {
        return shipSpeed;
    }

    public void setShipSpeed(Integer shipSpeed) {
        this.shipSpeed = shipSpeed;
    }

    public String getNavigationArea() {
        return navigationArea;
    }

    public void setNavigationArea(String navigationArea) {
        this.navigationArea = navigationArea == null ? null : navigationArea.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
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