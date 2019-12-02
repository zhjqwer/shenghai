package com.chuxin.ship.crotroller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.chuxin.entity.OssUtils;
import com.chuxin.entity.ResultBean;
import com.chuxin.pojo.ShipInformation;
import com.chuxin.service.ShipInformationService;
import com.chuxin.service.UserExtendService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.net.URL;
import java.util.List;


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
    private ShipInformationService shipInformationService;

    /*
     * 所有的船只查询
     * */
    @ResponseBody
    @RequestMapping("/findAll")
    private ResultBean findAll(){
        List<ShipInformation> shipInformation = shipInformationService.findAll();
        if (shipInformation == null){
            return  new ResultBean(1,null,"查询失败");
        }
        return new ResultBean(0,shipInformation,"查询成功");
    }
    /*
     *  根据船只id查询船只信息
     * 查询单个船只
     * */

    @ResponseBody
    @RequestMapping("/findById")
    private ResultBean findById( Integer id){
        ShipInformation byId = shipInformationService.findByid(id);
        if (byId==null){
            return new ResultBean(1,false,"船只查询失败");
        }else {
            return new ResultBean(0,byId,"船只查询成功");
        }
    }

    /**
     * 根据用户id查询船只信息
     * @param uId
     * @return
     */
    public ResultBean queryByUid(Integer uId){
        ShipInformation byUid = shipInformationService.findByUid(uId);
        if (byUid == null){
            return new ResultBean(1,null,"没有找到匹配船只");
        }
        return new ResultBean(0,byUid,"船只查询成功");
    }

    /*
    船只图片
     */
    @ResponseBody
    @RequestMapping("/update/file")
    private ResultBean update() {
        File file=new File("F:\\images\\1.png");
        ShipInformation byid = shipInformationService.findByid(1);
        long l = System.currentTimeMillis();
        long l1=(long) RandomUtils.nextInt(100, 9999);
        URL onedemo = OssUtils.upFileObject("onedemo", "myImage/user" + l + l1, file);
        String url = onedemo.toString();
        byid.setShipImg(url);
        try {
            shipInformationService.update(byid);
            return new ResultBean(0,true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(1,false, "修改失败");
        }

    }


}


