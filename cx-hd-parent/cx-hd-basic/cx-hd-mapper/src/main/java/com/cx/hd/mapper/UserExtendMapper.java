package com.cx.hd.mapper;


import com.cx.hd.entity.UserExtend;
import com.cx.hd.pojo.BaseDao;

public interface UserExtendMapper extends BaseDao<UserExtend> {

    //根据用户id查询该用户信息是否已存在的方法
    UserExtend selectByUid(int uid);

    //添加用户信息的方法
//    int insertUserExtend(UserExtend userExtend);

    //修改用户信息的方法
    int updateUserExtend(UserExtend userExtend);


}