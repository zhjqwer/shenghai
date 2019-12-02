package com.chuxin.service;

import com.chuxin.entity.PersonalDto;

import java.util.List;

/**
 * Create BY Z on 2019/11/11
 */
public interface PersonalService {

    //查询个人中心功能的方法
    List<PersonalDto> selectPersonalDto();

}
