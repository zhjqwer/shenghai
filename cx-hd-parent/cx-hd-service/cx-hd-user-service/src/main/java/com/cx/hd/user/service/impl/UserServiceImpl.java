package com.cx.hd.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cx.hd.common.ResultBean;
import com.cx.hd.constant.RedisConstant;
import com.cx.hd.entity.Users;
import com.cx.hd.mapper.UsersMapper;
import com.cx.hd.pojo.BaseDao;
import com.cx.hd.pojo.BaseServiceImpl;
import com.cx.hd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@Component
public class UserServiceImpl extends BaseServiceImpl<Users> implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public BaseDao<Users> getBaseDao() {
        return usersMapper;
    }

    public List<Users> list(){
       return usersMapper.list();
    }

    @Override
    public Users loginUser(Users user) {
        //调用用户登录方法
        Users currentUsers = usersMapper.selectByUsername(user.getPhone());

        //比较密码
        if(currentUsers != null){
//            if(passwordEncoder.matches(user.getPassword(),currentUsers.getPassword())){
            if(user.getPassword().equals(currentUsers.getPassword())){
                return currentUsers;
            }
        }
        return null;
    }


    /**
     * 给其他方法调用检查用户是否登录
     * @param uuid
     * @return
     */
    @Override
    public ResultBean checkIsLogin(String uuid) {
        System.out.println("调用 checkIsLogin 服务方法");
        if (uuid == null) {
            return new ResultBean(1, null, "当前用户未登录");
        }

        String rKey = new StringBuilder(RedisConstant.USER_TOKEN_PRE).append(uuid).toString();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        Users users = (Users) redisTemplate.opsForValue().get(rKey);
        if (users != null) {

            redisTemplate.expire(rKey,30, TimeUnit.MINUTES);
            return new ResultBean(0,users,"用户已登录");
        }

        return new ResultBean(1,null,"用户未登录");
    }
}
