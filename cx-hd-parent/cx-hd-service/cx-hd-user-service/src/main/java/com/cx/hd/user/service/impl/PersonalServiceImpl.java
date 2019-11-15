package com.cx.hd.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cx.hd.dto.PersonalDto;
import com.cx.hd.mapper.PersonalMapper;
import com.cx.hd.pojo.BaseDao;
import com.cx.hd.pojo.BaseServiceImpl;
import com.cx.hd.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class PersonalServiceImpl extends BaseServiceImpl<PersonalDto> implements PersonalService {

    @Autowired
    private PersonalMapper personalMapper;

    @Override
    public BaseDao<PersonalDto> getBaseDao() {
        return personalMapper;
    }

    @Override
    public List<PersonalDto> selectPersonalDto() {
        List<PersonalDto> personalDtoList= personalMapper.selectPersonalDto();
        if(personalDtoList == null){
            return null;
        }
        return personalDtoList;
    }
}
