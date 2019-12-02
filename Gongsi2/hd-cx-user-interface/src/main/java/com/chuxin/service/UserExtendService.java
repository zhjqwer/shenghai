package com.chuxin.service;

import com.chuxin.entity.PageResult;
import com.chuxin.pojo.UserExtend;

import java.util.List;

/**
 * Create BY Z on 2019/11/11
 */
public interface UserExtendService {

    //根据用户id查询该用户是否已存在的方法
    UserExtend queryByUid(int uId);

    //添加用户信息的方法
    int insertUserExtend(UserExtend userExtend);

    //修改用户信息的方法
    int reviseUserExtend(UserExtend userExtend);

    /**
     * 返回全部列表
     * @return
     */
    public List<UserExtend> findAll();

    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);



    //查询单个船只指定的服务次数
    public UserExtend findOne(Integer shipId);

    /**
     * 增加
     */
    public void add(UserExtend userExtend);

}
