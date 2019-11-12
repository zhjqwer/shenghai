package com.chuxin.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderMaster implements Serializable {
    private Integer id;

    private Integer orderNumber;

    private Integer serviceId;

    private Integer orderStatus;

    private Integer productCount;

    private BigDecimal productTotalPrice;

    private BigDecimal orderAmountTotal;

    private String invoice;

    private Integer invoiceId;

    private Date payTime;

    private String payChannel;

    private String outTradeNo;

    private Date orderTime;

    private Integer groupId;

    private String userRemarks;

    private Date orderSettlementTime;

    public OrderMaster() {
    }

    public OrderMaster(Integer id, Integer orderNumber, Integer serviceId, Integer orderStatus, Integer productCount, BigDecimal productTotalPrice, BigDecimal orderAmountTotal, String invoice, Integer invoiceId, Date payTime, String payChannel, String outTradeNo, Date orderTime, Integer groupId, String userRemarks, Date orderSettlementTime) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.serviceId = serviceId;
        this.orderStatus = orderStatus;
        this.productCount = productCount;
        this.productTotalPrice = productTotalPrice;
        this.orderAmountTotal = orderAmountTotal;
        this.invoice = invoice;
        this.invoiceId = invoiceId;
        this.payTime = payTime;
        this.payChannel = payChannel;
        this.outTradeNo = outTradeNo;
        this.orderTime = orderTime;
        this.groupId = groupId;
        this.userRemarks = userRemarks;
        this.orderSettlementTime = orderSettlementTime;
    }

    @Override
    public String toString() {
        return "OrderMaster{" +
                "id=" + id +
                ", orderNumber=" + orderNumber +
                ", serviceId=" + serviceId +
                ", orderStatus=" + orderStatus +
                ", productCount=" + productCount +
                ", productTotalPrice=" + productTotalPrice +
                ", orderAmountTotal=" + orderAmountTotal +
                ", invoice='" + invoice + '\'' +
                ", invoiceId=" + invoiceId +
                ", payTime=" + payTime +
                ", payChannel='" + payChannel + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", orderTime=" + orderTime +
                ", groupId=" + groupId +
                ", userRemarks='" + userRemarks + '\'' +
                ", orderSettlementTime=" + orderSettlementTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public BigDecimal getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(BigDecimal productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }

    public BigDecimal getOrderAmountTotal() {
        return orderAmountTotal;
    }

    public void setOrderAmountTotal(BigDecimal orderAmountTotal) {
        this.orderAmountTotal = orderAmountTotal;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getUserRemarks() {
        return userRemarks;
    }

    public void setUserRemarks(String userRemarks) {
        this.userRemarks = userRemarks == null ? null : userRemarks.trim();
    }

    public Date getOrderSettlementTime() {
        return orderSettlementTime;
    }

    public void setOrderSettlementTime(Date orderSettlementTime) {
        this.orderSettlementTime = orderSettlementTime;
    }
}