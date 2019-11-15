package com.cx.hd.service;

import com.cx.hd.dto.PersonalDto;
import com.cx.hd.pojo.BaseService;

import java.util.List;

public interface PersonalService extends BaseService<PersonalDto> {

    //查询个人中心功能的方法
    List<PersonalDto> selectPersonalDto();

}
