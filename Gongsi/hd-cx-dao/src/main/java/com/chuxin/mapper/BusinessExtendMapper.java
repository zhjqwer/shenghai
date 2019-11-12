package com.chuxin.mapper;

import com.chuxin.pojo.BusinessExtend;
import com.chuxin.pojo.BusinessExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessExtendMapper {
    int countByExample(BusinessExtendExample example);

    int deleteByExample(BusinessExtendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessExtend record);

    int insertSelective(BusinessExtend record);

    List<BusinessExtend> selectByExampleWithBLOBs(BusinessExtendExample example);

    List<BusinessExtend> selectByExample(BusinessExtendExample example);

    BusinessExtend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessExtend record, @Param("example") BusinessExtendExample example);

    int updateByExampleWithBLOBs(@Param("record") BusinessExtend record, @Param("example") BusinessExtendExample example);

    int updateByExample(@Param("record") BusinessExtend record, @Param("example") BusinessExtendExample example);

    int updateByPrimaryKeySelective(BusinessExtend record);

    int updateByPrimaryKeyWithBLOBs(BusinessExtend record);

    int updateByPrimaryKey(BusinessExtend record);
}