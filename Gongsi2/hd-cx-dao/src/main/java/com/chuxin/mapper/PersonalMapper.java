package com.chuxin.mapper;

import com.chuxin.entity.PersonalDto;
import com.chuxin.pojo.Personal;
import com.chuxin.pojo.PersonalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalMapper {
    int countByExample(PersonalExample example);

    int deleteByExample(PersonalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Personal record);

    int insertSelective(Personal record);

    List<Personal> selectByExample(PersonalExample example);

    Personal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Personal record, @Param("example") PersonalExample example);

    int updateByExample(@Param("record") Personal record, @Param("example") PersonalExample example);

    int updateByPrimaryKeySelective(Personal record);

    int updateByPrimaryKey(Personal record);

    //查询个人中心功能的方法
    List<PersonalDto> selectPersonalDto();

}