package com.cx.hd.sea.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cx.hd.entity.SeaService;
import com.cx.hd.mapper.SeaServiceMapper;
import com.cx.hd.pojo.BaseDao;
import com.cx.hd.pojo.BaseServiceImpl;
import com.sea.service.SeaServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SeaServiceServiceImpl extends BaseServiceImpl<SeaService> implements SeaServiceService {

    @Autowired
    private SeaServiceMapper seaServiceMapper;

    @Override
    public BaseDao<SeaService> getBaseDao() {
        return seaServiceMapper;
    }

    public List<SeaService> list(){
        List<SeaService> seaServiceList = seaServiceMapper.list();
        if(seaServiceList == null){
            return null;
        }
        return seaServiceList;
    }
}
