package com.chuxin.service;

import com.chuxin.pojo.SeaService;

import java.util.List;


public interface SeaServiceInt {


    //查询船老大所拥有的船
    public SeaService findOne(Integer shipId);

    public SeaService findId(Integer id);
    /**
     * 增加
     */
    public void add(SeaService seaService);

    public List<SeaService> findAll();



}
