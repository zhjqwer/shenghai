package com.chuxin.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
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

    private BigDecimal price;

    private BigDecimal presentPrice;

    private Integer detailsId;

    private String region;

    private String targetIsland;

    private String spareOne;

    private String spareTwo;

    private Date registerTime;

    private Date updateTime;

    private Integer updateName;

    public SeaService() {
    }

    public SeaService(Integer id, Integer shipId, Date startTime, Date endTime, Integer bookingTimeId, String embarkSite, String disembarkSite, Integer mostPeople, String remarks, BigDecimal price, BigDecimal presentPrice, Integer detailsId, String region, String targetIsland, String spareOne, String spareTwo, Date registerTime, Date updateTime, Integer updateName) {
        this.id = id;
        this.shipId = shipId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.bookingTimeId = bookingTimeId;
        this.embarkSite = embarkSite;
        this.disembarkSite = disembarkSite;
        this.mostPeople = mostPeople;
        this.remarks = remarks;
        this.price = price;
        this.presentPrice = presentPrice;
        this.detailsId = detailsId;
        this.region = region;
        this.targetIsland = targetIsland;
        this.spareOne = spareOne;
        this.spareTwo = spareTwo;
        this.registerTime = registerTime;
        this.updateTime = updateTime;
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
                ", presentPrice=" + presentPrice +
                ", detailsId=" + detailsId +
                ", region='" + region + '\'' +
                ", targetIsland='" + targetIsland + '\'' +
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
        this.embarkSite = embarkSite;
    }

    public String getDisembarkSite() {
        return disembarkSite;
    }

    public void setDisembarkSite(String disembarkSite) {
        this.disembarkSite = disembarkSite;
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
        this.remarks = remarks;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPresentPrice() {
        return presentPrice;
    }

    public void setPresentPrice(BigDecimal presentPrice) {
        this.presentPrice = presentPrice;
    }

    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTargetIsland() {
        return targetIsland;
    }

    public void setTargetIsland(String targetIsland) {
        this.targetIsland = targetIsland;
    }

    public String getSpareOne() {
        return spareOne;
    }

    public void setSpareOne(String spareOne) {
        this.spareOne = spareOne;
    }

    public String getSpareTwo() {
        return spareTwo;
    }

    public void setSpareTwo(String spareTwo) {
        this.spareTwo = spareTwo;
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