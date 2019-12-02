package com.chuxin.ship.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chuxin.mapper.ShipCertificateMapper;
import com.chuxin.pojo.ShipCertificate;
import com.chuxin.service.ShipCertificateService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ShipCertificateServiceImpl implements ShipCertificateService {
    @Autowired
    private ShipCertificateMapper shipCertificateMapper;
    @Override
    public ShipCertificate findByid(Integer id) {
        return shipCertificateMapper.selectByPrimaryKey(id);
    }
}