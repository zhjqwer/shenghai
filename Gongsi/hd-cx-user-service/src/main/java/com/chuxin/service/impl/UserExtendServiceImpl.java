package com.chuxin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chuxin.mapper.UserExtendMapper;
import com.chuxin.pojo.UserExtend;
import com.chuxin.service.UserExtendService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create BY Z on 2019/11/11
 */

@Service
public class UserExtendServiceImpl implements UserExtendService {

    @Autowired
    private UserExtendMapper userExtendMapper;

    @Override
    public UserExtend queryByUid(int uid) {
        UserExtend userExtend = userExtendMapper.selectByUid(uid);
        if(userExtend == null){
            return null;
        }
        return userExtend;
    }

    @Override
    public int insertUserExtend(UserExtend userExtend) {
        int row = userExtendMapper.insertSelective(userExtend);
        if(row == 0){
            return 1;
        }
        return 0;
    }

    @Override
    public int reviseUserExtend(UserExtend userExtend) {
        int row = userExtendMapper.updateUserExtend(userExtend);
        if(row == 0 ){
            return 1;
        }
        return 0;
    }
}
