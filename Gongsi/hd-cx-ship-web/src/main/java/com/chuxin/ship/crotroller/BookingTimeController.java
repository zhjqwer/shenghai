package com.chuxin.ship.crotroller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chuxin.entity.Result;
import com.chuxin.mapper.SeaServiceMapper;
import com.chuxin.pojo.BookingTime;
import com.chuxin.pojo.SeaService;
import com.chuxin.service.BookingTimeService;
import com.chuxin.service.SeaServiceInt;
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

    @Reference
    private SeaServiceInt seaService;
    @Autowired
    private RedisTemplate redisTemplate;




    //用户订船时间段增加到数据库
    @RequestMapping("/add")
    @ResponseBody
    public void add(BookingTime bookingTime){
        if (bookingTime.getStartTime()==null&&bookingTime.equals("")){
            new Result(false,"请输入开始时间");
            return;
        }if (bookingTime.getEndTime()==null){
            new Result(false,"请输入截止时间");
            return;
        }
         bookingTime.setBookingTimeId(1);//执行此方法为用户已预定时间段  特定字段预定则默认为“1”
         bookingTimeService.add(bookingTime);
    }
    //查询服务表  获取到所有船只的服务时间信息
    @RequestMapping("findAll")
    public List<SeaService> findAll(){
      SeaService service= (SeaService) redisTemplate.boundHashOps("seaService").get("serviceAll");
      if (service!=null&&!service.equals("")){
          return (List<SeaService>) service;
      }else {
        List<SeaService> serviceAll = seaService.findAll();
        Map map= new HashMap();
        map.put("seaService",serviceAll);
        redisTemplate.boundHashOps("seaService").put("serviceAll",map);
        return serviceAll;
    }
    }

    @RequestMapping("/findTime")
    @ResponseBody
    public List<SeaService> findTime(Date date,Date endDate){
        return bookingTimeService.findTime(date,endDate);
    }


}
