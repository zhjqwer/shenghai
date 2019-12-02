package com.chuxin.service;

import com.chuxin.pojo.BookingTime;
import com.chuxin.pojo.SeaService;

import java.util.Date;
import java.util.List;

//船只服务订购时间
public interface BookingTimeService {

    public List<BookingTime> findAll();
    /**
     * 增加
     */
    public void add(BookingTime bookingTime);

    public BookingTime findOne(Integer bookingTimeId);

}
