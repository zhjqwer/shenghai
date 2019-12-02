package com.chuxin.ship.crotroller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chuxin.entity.ResultBean;
import com.chuxin.pojo.BookingTime;
import com.chuxin.service.BookingTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

//船只时间预定表
@Component
@RequestMapping("/ship")
public class BookingTimeController {

    @Reference
    private BookingTimeService bookingTimeService;

    @Autowired
    private RedisTemplate redisTemplate;

    //用户订船时间段增加到数据库
    @RequestMapping("/add")
    @ResponseBody
    public void add(BookingTime bookingTime){
        if (bookingTime.getStartTime()==null&&bookingTime.equals("")){
            new ResultBean(1,false,"请输入开始时间");
            return;
        }if (bookingTime.getEndTime()==null){
            new ResultBean(1,false,"请输入截止时间");
            return;
        }
        bookingTime.setBookingTimeId(1);//执行此方法为用户已预定时间段  特定字段预定则默认为“1”
        bookingTimeService.add(bookingTime);
    }
}
