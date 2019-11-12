package com.chuxin.mapper;

import com.chuxin.pojo.SeaService;
import com.chuxin.pojo.SeaServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeaServiceMapper {
    int countByExample(SeaServiceExample example);

    int deleteByExample(SeaServiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SeaService record);

    int insertSelective(SeaService record);

    List<SeaService> selectByExample(SeaServiceExample example);

    SeaService selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SeaService record, @Param("example") SeaServiceExample example);

    int updateByExample(@Param("record") SeaService record, @Param("example") SeaServiceExample example);

    int updateByPrimaryKeySelective(SeaService record);

    int updateByPrimaryKey(SeaService record);

    SeaService findOne(Integer shipId);

    //查询所有服务
    List<SeaService> list();

}