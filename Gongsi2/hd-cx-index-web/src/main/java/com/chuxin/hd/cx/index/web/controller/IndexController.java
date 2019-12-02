package com.chuxin.hd.cx.index.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chuxin.entity.ResultBean;
import com.chuxin.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import util.RedisConstant;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class IndexController {

    @Reference
    private NavigationService navigationService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("show/index")
    public String showIndex(){
        return "index";
    }


    @ResponseBody
    @RequestMapping("show/index/navigation")
    public ResultBean queryNavigation(){
        System.out.println("调用查询导航栏方法");
        String navigationKey = RedisConstant.NAVIGATION_TOKEN;

        List themes = (List) redisTemplate.opsForList().leftPop(navigationKey);
        if(themes ==null){

            themes = navigationService.selectByTheme();
            if(themes == null){
                return new ResultBean(1,null,"数据为空");
            }

            redisTemplate.setKeySerializer(new StringRedisSerializer());
            redisTemplate.opsForList().leftPush(navigationKey,themes);

            redisTemplate.expire(navigationKey,3, TimeUnit.HOURS);

            System.out.println("从数据库中查询");
            return new ResultBean(0,themes,"查询成功");

        }
        System.out.println("从redis中查询");
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.opsForList().leftPush(navigationKey,themes);
        redisTemplate.expire(navigationKey,3, TimeUnit.HOURS);
        return new ResultBean(0,themes,"在redis中查询成功");
    }


}
