package com.chuxin.mapper;

import com.chuxin.pojo.ShipInformation;
import com.chuxin.pojo.ShipInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipInformationMapper {
    int countByExample(ShipInformationExample example);

    int deleteByExample(ShipInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShipInformation record);

    int insertSelective(ShipInformation record);

    List<ShipInformation> selectByExample(ShipInformationExample example);

    ShipInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShipInformation record, @Param("example") ShipInformationExample example);

    int updateByExample(@Param("record") ShipInformation record, @Param("example") ShipInformationExample example);

    int updateByPrimaryKeySelective(ShipInformation record);

    int updateByPrimaryKey(ShipInformation record);
}