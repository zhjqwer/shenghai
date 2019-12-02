package com.chuxin.mapper;

import com.chuxin.pojo.GroupMaster;
import com.chuxin.pojo.GroupMasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupMasterMapper {
    int countByExample(GroupMasterExample example);

    int deleteByExample(GroupMasterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroupMaster record);

    int insertSelective(GroupMaster record);

    List<GroupMaster> selectByExample(GroupMasterExample example);

    GroupMaster selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroupMaster record, @Param("example") GroupMasterExample example);

    int updateByExample(@Param("record") GroupMaster record, @Param("example") GroupMasterExample example);

    int updateByPrimaryKeySelective(GroupMaster record);

    int updateByPrimaryKey(GroupMaster record);
}