package com.chuxin.hd.cx.sea.service.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chuxin.entity.ResultBean;
import com.chuxin.pojo.SeaService;
import com.chuxin.sea.service.SeaServiceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SeaServiceController {

    @Reference
    private SeaServiceService seaServiceService;

    @ResponseBody
    @RequestMapping("show/sea/service")
    public ResultBean querySeaServiceAll(){
        System.out.println("调用查询出海服务的方法");
        List<SeaService> seaServices = seaServiceService.list();
        if(seaServices == null){
            return new ResultBean(1,null,"查询失败");
        }
        return  new ResultBean(0,seaServices,"查询成功");
    }

}
