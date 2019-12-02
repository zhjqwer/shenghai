package com.chuxin.pojo;

import java.io.Serializable;
import java.util.Date;

public class BookingTime implements Serializable {
    private Integer id;

    private Date startTime;

    private Date endTime;

    private Integer bookingTimeId;

    public BookingTime() {
    }

    public BookingTime(Integer id, Date startTime, Date endTime, Integer bookingTimeId) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.bookingTimeId = bookingTimeId;
    }

    @Override
    public String toString() {
        return "BookingTime{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", bookingTimeId=" + bookingTimeId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}