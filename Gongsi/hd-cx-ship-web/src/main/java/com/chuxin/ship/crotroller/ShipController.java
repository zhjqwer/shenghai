package com.chuxin.ship.crotroller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.chuxin.pojo.SeaService;
import com.chuxin.pojo.UserExtend;
import com.chuxin.service.SeaServiceInt;
import com.chuxin.service.UserExtendService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * controller
 *
 * @author Administrator
 */

//船老大船只查询
@Component
@RequestMapping("/ship")
public class ShipController {
    @Reference
    private UserExtendService userExtendService;

    @Reference
    private SeaServiceInt seaService;
    @ResponseBody
    @RequestMapping("/findOne")
    private SeaService findOne(@RequestParam Integer shipId){
        if (shipId==null){
            return null;
        }
        UserExtend userExtend = userExtendService.findOne(shipId);
        SeaService service=    seaService.findOne(shipId);
        System.out.println(shipId);
        try {
            if (userExtend.getShipId()==service.getShipId()){
                System.out.println(service.getShipId()+"船老大拥有的船Id");
                System.out.println(service.getEmbarkSite()+"上船地点");
                System.out.println(service.getDisembarkSite()+"下船地点");
                return service;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}


