package com.chuxin.service;

import com.chuxin.pojo.ShipInformation;

import java.util.List;

public interface ShipInformationService {
    /*
      查询所有的船只
     */
    List<ShipInformation> findAll();
    /*
     查询单个船只
    */
    public   ShipInformation findByid(Integer id);

    //根据用户id查询船只信息
    ShipInformation findByUid(Integer uId);

    /*
     * 修改单个船只
     * */
    public void update(ShipInformation shipInformation);
}
