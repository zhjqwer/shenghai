package com.cx.hd.mapper;


import com.cx.hd.dto.PersonalDto;
import com.cx.hd.pojo.BaseDao;

import java.util.List;

public interface PersonalMapper extends BaseDao<PersonalDto> {

    //查询个人中心功能的方法
    List<PersonalDto> selectPersonalDto();

}