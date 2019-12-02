package com.chuxin.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BusinessExtend implements Serializable {
    private Integer id;

    private String businessName;

    private BigDecimal businessPrice;

    private String spareOne;

    private String spareTwo;

    private Date registerTime;

    private Date updateTime;

    private Integer updateName;

    private String businessTerms;

    public BusinessExtend() {
    }

    public BusinessExtend(Integer id, String businessName, BigDecimal businessPrice, String spareOne, String spareTwo, Date registerTime, Date updateTime, Integer updateName, String businessTerms) {
        this.id = id;
        this.businessName = businessName;
        this.businessPrice = businessPrice;
        this.spareOne = spareOne;
        this.spareTwo = spareTwo;
        this.registerTime = registerTime;
        this.updateTime = updateTime;
        this.updateName = updateName;
        this.businessTerms = businessTerms;
    }

    @Override
    public String toString() {
        return "BusinessExtend{" +
                "id=" + id +
                ", businessName='" + businessName + '\'' +
                ", businessPrice=" + businessPrice +
                ", spareOne='" + spareOne + '\'' +
                ", spareTwo='" + spareTwo + '\'' +
                ", registerTime=" + registerTime +
                ", updateTime=" + updateTime +
                ", updateName=" + updateName +
                ", businessTerms='" + businessTerms + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    public BigDecimal getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(BigDecimal businessPrice) {
        this.businessPrice = businessPrice;
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

    public String getBusinessTerms() {
        return businessTerms;
    }

    public void setBusinessTerms(String businessTerms) {
        this.businessTerms = businessTerms == null ? null : businessTerms.trim();
    }
}