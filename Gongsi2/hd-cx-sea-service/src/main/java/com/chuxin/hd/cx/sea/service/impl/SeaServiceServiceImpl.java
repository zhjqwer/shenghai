package com.chuxin.hd.cx.sea.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chuxin.entity.SeaServiceDto;
import com.chuxin.mapper.SeaServiceMapper;
import com.chuxin.pojo.SeaService;
import com.chuxin.sea.service.SeaServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.List;

@Service
public class SeaServiceServiceImpl implements SeaServiceService {

    @Autowired
    private SeaServiceMapper seaServiceMapper;

    @Override
    public List<SeaServiceDto> list(){
        List<SeaServiceDto> seaServiceList = seaServiceMapper.list();
        if(seaServiceList.size() == 0){
            return null;
        }
        return seaServiceList;
    }

    @Override
    public List<SeaServiceDto> selectByIslandService(String island) {
        List<SeaServiceDto> byIslandServiceDto = seaServiceMapper.queryByIslandService(island);
        if(byIslandServiceDto.size() == 0){
            return null;
        }
        return byIslandServiceDto;
    }

    @Override
    public List<SeaServiceDto> selectByTermService(String region, String island, int people, Date time) {
        List<SeaServiceDto> byTermService = seaServiceMapper.queryByTermService(region, island, people, time);
        if(byTermService.size() == 0){
            return null;
        }
        System.out.println(byTermService+"1.0000");
        return byTermService;
    }

    @Override
    public List<SeaServiceDto> selectByTermService(String region, String island, int people) {
        List<SeaServiceDto> seaServices = seaServiceMapper.qByTermService(region, island, people);
        if(seaServices.size() == 0){
            return null;
        }else {
            System.out.println(seaServices+"0.........");
            return seaServices;
        }
    }

    @Override
    public List<SeaServiceDto> finOne(Integer shipId) {
        return (List<SeaServiceDto>)seaServiceMapper.findOne(shipId);
    }

    @Override
    public void insert(SeaService seaService) {
        seaServiceMapper.insertSelective(seaService);
    }

}
