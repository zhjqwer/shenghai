package com.cx.hd.entity;

import java.io.Serializable;
import java.util.Date;

public class BookingTime implements Serializable {
    private Integer id;

    private Date startTime;

    private Date endTime;

    private Integer bookingTimeId;

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