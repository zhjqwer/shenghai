package com.cx.hd.service;

import com.cx.hd.entity.UserExtend;

public interface UserExtendService {

    //根据用户id查询该用户是否已存在的方法
    UserExtend queryByUid(int uid);

    //添加用户信息的方法
    int insertUserExtend(UserExtend userExtend);

    //修改用户信息的方法
    int reviseUserExtend(UserExtend userExtend);

}
