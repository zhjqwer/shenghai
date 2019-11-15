package com.cx.hd.sso.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cx.hd.common.ResultBean;
import com.cx.hd.constant.CookieConstant;
import com.cx.hd.constant.RedisConstant;
import com.cx.hd.entity.Users;
import com.cx.hd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("user/")
public class UsersController {

    @Reference
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;


    @RequestMapping("show/list")
    @ResponseBody
    public List<Users> UsersList(){

        List<Users> list = userService.list();

        return list;
    }


    /**
     * 显示登录页面的方法
     * @return
     */
    @RequestMapping("show/login")
    public String login() {
        return "login";
    }

    /**
     * 登录方法
     * @param user
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping("check/Login")
    public ResultBean checkLogin(Users user, HttpServletResponse response){

        System.out.println("调用登录方法");

        Users currentUser = userService.loginUser(user);
        if(currentUser == null){
            return new ResultBean(1,null,"登录失败,手机号或密码错误!");
        }

        String uuid = UUID.randomUUID().toString();

        String useKey = new StringBuilder(RedisConstant.USER_TOKEN_PRE).append(uuid).toString();

        currentUser.setPassword(null);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.opsForValue().set(useKey, currentUser);

        redisTemplate.expire(useKey, 30, TimeUnit.MINUTES);

        Cookie cookie = new Cookie(CookieConstant.USER_TOKEN, uuid);

        cookie.setPath("/");

        cookie.setHttpOnly(true);
        response.addCookie(cookie);

        return new ResultBean(0,null,"登录成功");

    }

    /**
     * 判断用户是否登录的方法
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("check/isLogin")
    public ResultBean checkIsLogin(HttpServletRequest request, HttpServletResponse response){


        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");


        Cookie[] cookies = request.getCookies();

        if(cookies == null){
            System.out.println("cookies==null");
            return new ResultBean(1,null,"当前用户未登录");
        }
        for(Cookie cookie : cookies){
            if(cookie.getName().equals(CookieConstant.USER_TOKEN)){
                String uuid = cookie.getValue();
                redisTemplate.setKeySerializer(new StringRedisSerializer());
                String rkey = new StringBuilder(RedisConstant.USER_TOKEN_PRE).append(uuid).toString();

                Users users = (Users) redisTemplate.opsForValue().get(rkey);
                if(users != null){
                    System.out.println("检查成功");

                    redisTemplate.expire(rkey,30,TimeUnit.MINUTES);
                    return new ResultBean(0,users,"当前用户已登录");
                }
            }
        }
        System.out.println("111");
        return new ResultBean(1,null,"当前用户未登录");
    }

    /**
     * 退出登录的方法
     * @param uuid
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping("logOut")
    public ResultBean logOut(@CookieValue(value = CookieConstant.USER_TOKEN,required = false)String uuid,
                             HttpServletResponse response){
        if(uuid == null){
            return new ResultBean(1,null,"当前用户未登录");
        }

        String rkey = new StringBuilder(RedisConstant.USER_TOKEN_PRE).append(uuid).toString();
        redisTemplate.setKeySerializer( new StringRedisSerializer());
        redisTemplate.delete(rkey);


        Cookie cookie = new Cookie(CookieConstant.USER_TOKEN,uuid);
        cookie.setMaxAge(0);
        cookie.setPath("/");
        response.addCookie(cookie);

        return new ResultBean(0,null,"退出登录成功");
    }

}
