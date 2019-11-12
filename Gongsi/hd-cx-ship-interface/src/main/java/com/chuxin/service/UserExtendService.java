package com.chuxin.service;

import com.chuxin.entity.PageResult;
import com.chuxin.pojo.UserExtend;

import java.util.List;

//船老大
public interface UserExtendService {
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

    //查询船老大所拥有的船
    public UserExtend findOne(Integer shipId);


    /**
     * 增加
     */
    public void add(UserExtend userExtend);

}
