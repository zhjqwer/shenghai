package com.cx.hd.mapper;


import com.cx.hd.entity.Users;
import com.cx.hd.pojo.BaseDao;

public interface UsersMapper extends BaseDao<Users> {

    //查询用户方法
    Users selectByUsername(String phone);
}