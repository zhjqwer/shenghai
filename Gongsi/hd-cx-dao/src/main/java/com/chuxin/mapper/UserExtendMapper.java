package com.chuxin.mapper;

import com.chuxin.pojo.UserExtend;
import com.chuxin.pojo.UserExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserExtendMapper {
    int countByExample(UserExtendExample example);

    int deleteByExample(UserExtendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserExtend record);

    int insertSelective(UserExtend record);

    List<UserExtend> selectByExample(UserExtendExample example);

    UserExtend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserExtend record, @Param("example") UserExtendExample example);

    int updateByExample(@Param("record") UserExtend record, @Param("example") UserExtendExample example);

    int updateByPrimaryKeySelective(UserExtend record);

    int updateByPrimaryKey(UserExtend record);

    UserExtend findOne(Integer shipId);

    //根据用户id查询该用户信息是否已存在的方法
    UserExtend selectByUid(int uid);

    //修改用户信息的方法
    int updateUserExtend(UserExtend userExtend);

}