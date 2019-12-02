package com.chuxin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chuxin.entity.PersonalDto;
import com.chuxin.mapper.PersonalMapper;
import com.chuxin.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Create BY Z on 2019/11/11
 */
@Service
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    private PersonalMapper personalMapper;

    @Override
    public List<PersonalDto> selectPersonalDto() {
        List<PersonalDto> personalDtoList= personalMapper.selectPersonalDto();
        if(personalDtoList.size() == 0){
            return null;
        }
        return personalDtoList;
    }

}
