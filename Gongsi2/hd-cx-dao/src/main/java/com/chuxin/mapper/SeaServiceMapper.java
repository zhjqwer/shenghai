package com.chuxin.mapper;

import com.chuxin.entity.SeaServiceDto;
import com.chuxin.pojo.SeaService;
import com.chuxin.pojo.SeaServiceExample;

import java.sql.Date;
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


    List<SeaServiceDto> findOne(Integer shipId);

    //查询所有服务
    List<SeaServiceDto> list();

    //根据目的岛查询创建时间最早的6条服务
    List<SeaServiceDto> queryByIslandService(@Param("island") String island);

    //根据条件查询出海服务
    List<SeaServiceDto> queryByTermService(@Param("region")String region, @Param("island")String island, @Param("people")int people,@Param("time") Date time);

    //根据条件查询出海服务
    List<SeaServiceDto> qByTermService(@Param("region")String region, @Param("island")String island, @Param("people")int people);

}