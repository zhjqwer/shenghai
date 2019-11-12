package com.chuxin.ship.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chuxin.mapper.BookingTimeMapper;
import com.chuxin.mapper.SeaServiceMapper;
import com.chuxin.mapper.UserExtendMapper;
import com.chuxin.pojo.BookingTime;

import com.chuxin.pojo.SeaService;
import com.chuxin.pojo.UserExtend;
import com.chuxin.service.BookingTimeService;
import com.chuxin.service.SeaServiceInt;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//船只服务订购时间
@Service(timeout = 10000)
public class BookingTimeServiceImpl implements BookingTimeService {

    @Autowired
    private BookingTimeMapper bookingTimeMapper;

    @Autowired
    private UserExtendMapper userExtendMapper;

    @Autowired
    private SeaServiceInt seaService;

//
    @Override
    public List<BookingTime> findAll() {
        return bookingTimeMapper.selectByExample(null);
    }

    //用户确定时间段，则添加到数据库中
    @Override
    public void add(BookingTime bookingTime) {
        //判断船只ID  完成实时更新到预定时间表

         bookingTimeMapper.insert(bookingTime);
    }

    //此方法为船老大查询船只时间预定信息用
    @Override
    public BookingTime findOne(Integer bookingTimeId) {
        return bookingTimeMapper.selectByPrimaryKey(bookingTimeId);
    }

    public UserExtend findShipID(Integer shipId){
        return userExtendMapper.selectByPrimaryKey(shipId);

    }
    @Override
    public List<SeaService> findTime(Date date, Date endDate){
        List<SeaService> all = seaService.findAll();
        List<SeaService>list=new ArrayList<>();
        Date startTime=new Date();
        Date endTime=new Date();
        Integer startTime1=null;
        Integer endTime1=null;
        date=new Date();
        endDate=new Date();
        Integer date1=Integer.valueOf(String.valueOf(endDate.getTime()).substring(0,10));
        Integer endDate1=Integer.valueOf(String.valueOf(endDate.getTime()).substring(0,10));
        for (SeaService service1 : all) {
            startTime = service1.getStartTime();
            endTime = service1.getEndTime();
            startTime1=Integer.valueOf(String.valueOf(startTime.getTime()).substring(0,10));
            endTime1=Integer.valueOf(String.valueOf(endTime.getTime()).substring(0,10));
            if (date1<=startTime1||endDate1>=endTime1){
                list.add(service1);
            }

        }
        return list;




    }

}
