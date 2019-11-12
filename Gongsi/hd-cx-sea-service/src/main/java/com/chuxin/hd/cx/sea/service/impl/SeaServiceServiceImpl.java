package com.chuxin.hd.cx.sea.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chuxin.mapper.SeaServiceMapper;
import com.chuxin.pojo.SeaService;
import com.chuxin.sea.service.SeaServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SeaServiceServiceImpl implements SeaServiceService {

    @Autowired
    private SeaServiceMapper seaServiceMapper;

    @Override
    public List<SeaService> list(){
        List<SeaService> seaServiceList = seaServiceMapper.list();
        if(seaServiceList == null){
            return null;
        }
        return seaServiceList;
    }
}
