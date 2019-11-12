package com.chuxin.ship.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.chuxin.mapper.SeaServiceMapper;
import com.chuxin.pojo.SeaService;
import com.chuxin.service.SeaServiceInt;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service(timeout = 10000)
public class SeaServiceImpl implements SeaServiceInt {

    @Autowired
    private SeaServiceMapper serviceMapper;

    @Override
    public SeaService findOne(Integer shipId) {
        return serviceMapper.findOne(shipId);
    }

    @Override
    public SeaService findId(Integer id) {
        return serviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(SeaService seaService) {

    }

    @Override
    public List<SeaService> findAll() {
        return serviceMapper.selectByExample(null);
    }


}
