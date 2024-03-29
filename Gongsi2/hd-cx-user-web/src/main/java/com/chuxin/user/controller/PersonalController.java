package com.chuxin.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chuxin.entity.PersonalDto;
import com.chuxin.entity.ResultBean;
import com.chuxin.service.PersonalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Create BY Z on 2019/11/11
 */
@Controller
public class PersonalController {

    @Reference
    private PersonalService personalService;


    @ResponseBody
    @RequestMapping("show/personal/myfunction")
    public ResultBean queryMyFuncyion(){
        List<PersonalDto> personalDtoList = personalService.selectPersonalDto();
        if(personalDtoList == null){
            return new ResultBean(1,null,"个人中心功能查询失败");
        }
        return new ResultBean(0,personalDtoList,"个人中心功能查询成功");
    }

}
