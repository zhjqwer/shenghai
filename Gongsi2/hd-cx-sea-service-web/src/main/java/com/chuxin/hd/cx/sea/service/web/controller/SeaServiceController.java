package com.chuxin.hd.cx.sea.service.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chuxin.entity.ResultBean;
import com.chuxin.entity.SeaServiceDto;
import com.chuxin.pojo.SeaService;
import com.chuxin.pojo.ShipCertificate;
import com.chuxin.pojo.UserExtend;
import com.chuxin.sea.service.SeaServiceService;
import com.chuxin.service.ShipCertificateService;
import com.chuxin.service.UserExtendService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@Controller
public class SeaServiceController {

    @Reference
    private SeaServiceService seaServiceService;

    @Reference
    private UserExtendService userExtendService;

    @Reference
    private ShipCertificateService shipCertificateService;

    @ResponseBody
    @RequestMapping("show/sea/service")
    public ResultBean querySeaServiceAll(){
        System.out.println("调用查询出海服务的方法");
        List<SeaServiceDto> seaServices = seaServiceService.list();
        if(seaServices == null){
            return new ResultBean(1,null,"查询失败");
        }
        return  new ResultBean(0,seaServices,"查询成功");
    }

    @ResponseBody
    @RequestMapping("show/index/service")
    public ResultBean selectByIslandService(@RequestParam(value = "island",defaultValue = "鱼山岛") String island,
                                            HttpServletRequest request,HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");

        System.out.println("调用根据岛查询创建时间最早的6条出海服务");
        List<SeaServiceDto> byIslandServiceDto = seaServiceService.selectByIslandService(island);
        if(byIslandServiceDto == null){
            return new ResultBean(1,null,"没有去该岛的船");
        }
        return new ResultBean(0,byIslandServiceDto,"查询成功");
    }


    @ResponseBody
    @RequestMapping("show/byTerm/service")
    public ResultBean sByTermService(@RequestParam String region,@RequestParam String island,
                                     @RequestParam(value = "people",required = false,defaultValue = "1") Integer people,
                                     @RequestParam Date date){

        java.sql.Date time = new java.sql.Date(date.getTime());
        System.out.println(time);

        System.out.println("调用根据条件查询出海服务的方法");
        List<SeaServiceDto> byTermService = seaServiceService.selectByTermService(region, island, people, time);
        if(byTermService == null){
            return new ResultBean(1,null,"没有满足条件的船只");
        }
        return new ResultBean(0,byTermService,"查询成功");
    }

    @ResponseBody
    @RequestMapping("show/Term/service")
    public ResultBean sByTermService(@RequestParam String region,@RequestParam String island,
                                     @RequestParam(value = "people",required = false,defaultValue = "1") Integer people){

        System.out.println("调用根据条件查询出海服务的方法(无时间参数)");
        List<SeaServiceDto> TermService = seaServiceService.selectByTermService(region,island,people);
        if(TermService == null){
            return new ResultBean(1,null,"没有满足条件的船只");
        }
        return new ResultBean(0,TermService,"查询成功");
    }

    @ResponseBody
    @RequestMapping("findOne/sea/service")
    public ResultBean findOne(Integer shipId){
        try{
            List<SeaServiceDto> seaServices = seaServiceService.finOne(shipId);
            return new ResultBean(0,seaServices,"船只服务查询成功");
        }catch (Exception e){
            return  new ResultBean(1,false,"船只服务查询失败");
        }
    }
    /*
     *添加出海服务
     * */
    @ResponseBody
    @RequestMapping("insert/sea/service")
    public ResultBean insert(SeaService seaService,Integer shipId) {
        //查询此用户是否拥有这条船
        UserExtend userExtendServiceOne = userExtendService.queryByUid(shipId);
        //查询船只是否审核成功 是否有这艘船
        ShipCertificate shipCertificateServiceByid = shipCertificateService.findByid(shipId);
        try {
            if (userExtendServiceOne.getShipId() == shipCertificateServiceByid.getShipInspectionId()) {
                seaServiceService.insert(seaService);
                return new ResultBean(0, true, "添加成功");
            }
            return new ResultBean(1, false, "添加失败");
        } catch (Exception e) {
            return new ResultBean(1, false, "添加失败");
        }
    }

}
