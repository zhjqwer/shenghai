package com.chuxin.sea.service;

import com.chuxin.entity.SeaServiceDto;
import com.chuxin.pojo.SeaService;

import java.sql.Date;
import java.util.List;

public interface SeaServiceService{

    //查询所有的船只服务
    List<SeaServiceDto> list();

    //根据目的岛查询创建时间最早的6条服务
    List<SeaServiceDto> selectByIslandService(String island);

    //根据条件查询出海服务
    List<SeaServiceDto> selectByTermService(String region, String island, int people, Date time);

    //根据条件查询出海服务(无时间参数)
    List<SeaServiceDto> selectByTermService(String region, String island, int people);

    /*
     * 查询单个船只的多次服务
     * */
    List<SeaServiceDto> finOne(Integer shipId);

    /*
     * 添加船只的服务
     * */
    public void insert(SeaService seaService);

}
