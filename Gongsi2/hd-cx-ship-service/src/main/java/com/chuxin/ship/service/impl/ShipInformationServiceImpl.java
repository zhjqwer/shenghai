package com.chuxin.ship.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chuxin.mapper.ShipInformationMapper;
import com.chuxin.pojo.ShipInformation;
import com.chuxin.service.ShipInformationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(timeout = 10000)
public class ShipInformationServiceImpl implements ShipInformationService {
    @Autowired
    private ShipInformationMapper shipInformationMapper;
    @Override
    public List<ShipInformation> findAll() {
        return shipInformationMapper.selectByExample(null);
    }

    @Override
    public ShipInformation findByid(Integer id) {
        return shipInformationMapper.selectByPrimaryKey(id);
    }

    @Override
    public ShipInformation findByUid(Integer uId) {
        ShipInformation shipInformation = shipInformationMapper.selectByUid(uId);
        if(shipInformation == null){
            return null;
        }
        return shipInformation;
    }

    @Override
    public void update(ShipInformation shipInformation) {
        shipInformationMapper.updateByPrimaryKey(shipInformation);
    }
}
