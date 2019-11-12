package com.chuxin.mapper;

import com.chuxin.pojo.Oauths;
import com.chuxin.pojo.OauthsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthsMapper {
    int countByExample(OauthsExample example);

    int deleteByExample(OauthsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Oauths record);

    int insertSelective(Oauths record);

    List<Oauths> selectByExample(OauthsExample example);

    Oauths selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Oauths record, @Param("example") OauthsExample example);

    int updateByExample(@Param("record") Oauths record, @Param("example") OauthsExample example);

    int updateByPrimaryKeySelective(Oauths record);

    int updateByPrimaryKey(Oauths record);
}