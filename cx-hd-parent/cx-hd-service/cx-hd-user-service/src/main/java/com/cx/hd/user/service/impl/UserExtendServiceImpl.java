package com.cx.hd.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cx.hd.entity.UserExtend;
import com.cx.hd.mapper.UserExtendMapper;
import com.cx.hd.pojo.BaseDao;
import com.cx.hd.pojo.BaseServiceImpl;
import com.cx.hd.service.UserExtendService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserExtendServiceImpl extends BaseServiceImpl<UserExtend> implements UserExtendService {

    @Autowired
    private UserExtendMapper userExtendMapper;

    @Override
    public BaseDao<UserExtend> getBaseDao() {
        return userExtendMapper;
    }

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
