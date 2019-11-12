package com.chuxin.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GroupMaster implements Serializable {
    private Integer id;

    private Integer groupId;

    private Integer numberPeople;

    private String groupType;

    private Integer groupState;

    private Integer clusteringState;

    private Integer groupTarget;

    private BigDecimal targetPrice;

    private BigDecimal groupPrice;

    private Integer captain;

    private Integer joinNumberPeople;

    private Integer lackNumberPeople;

    private Date registerTime;

    private Date endTime;

    private String spareOne;

    private String spareTwo;

    public GroupMaster() {
    }

    public GroupMaster(Integer id, Integer groupId, Integer numberPeople, String groupType, Integer groupState, Integer clusteringState, Integer groupTarget, BigDecimal targetPrice, BigDecimal groupPrice, Integer captain, Integer joinNumberPeople, Integer lackNumberPeople, Date registerTime, Date endTime, String spareOne, String spareTwo) {
        this.id = id;
        this.groupId = groupId;
        this.numberPeople = numberPeople;
        this.groupType = groupType;
        this.groupState = groupState;
        this.clusteringState = clusteringState;
        this.groupTarget = groupTarget;
        this.targetPrice = targetPrice;
        this.groupPrice = groupPrice;
        this.captain = captain;
        this.joinNumberPeople = joinNumberPeople;
        this.lackNumberPeople = lackNumberPeople;
        this.registerTime = registerTime;
        this.endTime = endTime;
        this.spareOne = spareOne;
        this.spareTwo = spareTwo;
    }

    @Override
    public String toString() {
        return "GroupMaster{" +
                "id=" + id +
                ", groupId=" + groupId +
                ", numberPeople=" + numberPeople +
                ", groupType='" + groupType + '\'' +
                ", groupState=" + groupState +
                ", clusteringState=" + clusteringState +
                ", groupTarget=" + groupTarget +
                ", targetPrice=" + targetPrice +
                ", groupPrice=" + groupPrice +
                ", captain=" + captain +
                ", joinNumberPeople=" + joinNumberPeople +
                ", lackNumberPeople=" + lackNumberPeople +
                ", registerTime=" + registerTime +
                ", endTime=" + endTime +
                ", spareOne='" + spareOne + '\'' +
                ", spareTwo='" + spareTwo + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(Integer numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType == null ? null : groupType.trim();
    }

    public Integer getGroupState() {
        return groupState;
    }

    public void setGroupState(Integer groupState) {
        this.groupState = groupState;
    }

    public Integer getClusteringState() {
        return clusteringState;
    }

    public void setClusteringState(Integer clusteringState) {
        this.clusteringState = clusteringState;
    }

    public Integer getGroupTarget() {
        return groupTarget;
    }

    public void setGroupTarget(Integer groupTarget) {
        this.groupTarget = groupTarget;
    }

    public BigDecimal getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(BigDecimal targetPrice) {
        this.targetPrice = targetPrice;
    }

    public BigDecimal getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(BigDecimal groupPrice) {
        this.groupPrice = groupPrice;
    }

    public Integer getCaptain() {
        return captain;
    }

    public void setCaptain(Integer captain) {
        this.captain = captain;
    }

    public Integer getJoinNumberPeople() {
        return joinNumberPeople;
    }

    public void setJoinNumberPeople(Integer joinNumberPeople) {
        this.joinNumberPeople = joinNumberPeople;
    }

    public Integer getLackNumberPeople() {
        return lackNumberPeople;
    }

    public void setLackNumberPeople(Integer lackNumberPeople) {
        this.lackNumberPeople = lackNumberPeople;
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
}