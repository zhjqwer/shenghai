package com.cx.hd.entity;

import java.io.Serializable;
import java.util.Date;

public class SeaService implements Serializable {
    private Integer id;

    private Integer shipId;

    private Date startTime;

    private Date endTime;

    private Integer bookingTimeId;

    private String embarkSite;

    private String disembarkSite;

    private Integer mostPeople;

    private String remarks;

    private Integer price;

    private Integer detailsId;

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

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getBookingTimeId() {
        return bookingTimeId;
    }

    public void setBookingTimeId(Integer bookingTimeId) {
        this.bookingTimeId = bookingTimeId;
    }

    public String getEmbarkSite() {
        return embarkSite;
    }

    public void setEmbarkSite(String embarkSite) {
        this.embarkSite = embarkSite == null ? null : embarkSite.trim();
    }

    public String getDisembarkSite() {
        return disembarkSite;
    }

    public void setDisembarkSite(String disembarkSite) {
        this.disembarkSite = disembarkSite == null ? null : disembarkSite.trim();
    }

    public Integer getMostPeople() {
        return mostPeople;
    }

    public void setMostPeople(Integer mostPeople) {
        this.mostPeople = mostPeople;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
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
        return "SeaService{" +
                "id=" + id +
                ", shipId=" + shipId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", bookingTimeId=" + bookingTimeId +
                ", embarkSite='" + embarkSite + '\'' +
                ", disembarkSite='" + disembarkSite + '\'' +
                ", mostPeople=" + mostPeople +
                ", remarks='" + remarks + '\'' +
                ", price=" + price +
                ", detailsId=" + detailsId +
                ", spareOne='" + spareOne + '\'' +
                ", spareTwo='" + spareTwo + '\'' +
                ", registerTime=" + registerTime +
                ", updateTime=" + updateTime +
                ", updateName=" + updateName +
                '}';
    }
}