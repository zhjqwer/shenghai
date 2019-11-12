package com.chuxin.user.controller;

import com.chuxin.entity.PageResult;
import com.chuxin.entity.Result;
import com.chuxin.entity.ResultBean;
import com.chuxin.pojo.Users;
import com.chuxin.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.ResponseBody;
import util.CookieConstant;
import util.RedisConstant;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


/**
 * controller
 *
 * @author Administrator
 */

//用户注册
@Component
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 显示注册页面的方法
     *
     * @return
     */
    @RequestMapping("/reg")
    public String register() {
        return "register";
    }

    /**
     * 显示登录页面的方法
     *
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @Reference
    private UsersService usersService;

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

        Users currentUser = usersService.loginUser(user);
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

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<Users> findAll() {
        return usersService.findAll();
    }

    /**
     * 返回全部列表
     *
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return usersService.findPage(page, rows);
    }

    /**
     * 增加
     *
     * @param
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public Result add(Users users) {
        try {
            Users one = null;
            one = usersService.findOne(users.getPhone());
            if (one != null && !one.equals("")) {
                return new Result(false, "用户已存在");
            } else {
                String md5Password = DigestUtils.md5DigestAsHex(users.getPassword().getBytes());
                users.setPassword(md5Password);
                usersService.add(users);
                return new Result(true, "用户注册成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     *
     * @param users
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Users users) {
        try {
            usersService.update(users);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    /**
     * 查询+分页
     *
     * @param
     * @param
     * @param
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody Users users, int page, int rows) {
        return usersService.findPage(users, page, rows);
    }
	/*
	@RequestMapping("/sendCode")
	public Result sendCode(String phone){
		if (!PhoneFormatCheckUtils.isPhoneLegal(phone)){
			return new Result(false,"手机号码不正确");
		}
		try {
			usersService.createSmsCode(phone);
			return new Result(true,"验证码发送成功！");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"验证码发送失败！");
        }
        }*/
        }


