package com.cx.hd.service;

import com.cx.hd.common.ResultBean;
import com.cx.hd.entity.Users;
import com.cx.hd.pojo.BaseService;

public interface UserService extends BaseService<Users>{

    //用户登录的方法
    Users loginUser(Users user);

    //检查用户是否登录的方法
    ResultBean checkIsLogin(String uuid);

}
