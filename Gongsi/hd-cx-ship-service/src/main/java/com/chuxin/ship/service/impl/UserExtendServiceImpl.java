package com.chuxin.ship.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chuxin.entity.PageResult;
import com.chuxin.mapper.UserExtendMapper;
import com.chuxin.pojo.UserExtend;
import com.chuxin.service.UserExtendService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service(timeout = 10000)
public class UserExtendServiceImpl implements UserExtendService {
    @Autowired

    private UserExtendMapper userExtendMapper;

    @Override
    public List<UserExtend> findAll() {
        return null;
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public UserExtend findOne(Integer shipId) {
        return userExtendMapper.findOne(shipId);
    }

    @Override
    public void add(UserExtend userExtend) {

    }
}
