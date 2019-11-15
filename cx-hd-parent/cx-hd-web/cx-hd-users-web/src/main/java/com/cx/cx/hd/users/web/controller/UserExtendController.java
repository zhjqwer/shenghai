package com.cx.cx.hd.users.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cx.hd.common.ResultBean;
import com.cx.hd.entity.UserExtend;
import com.cx.hd.service.UserExtendService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user/extend")
public class UserExtendController {

    @Reference
    private UserExtendService userExtendService;

    @ResponseBody
    @RequestMapping("/information/{uid}")
    public ResultBean queryUserExtend(@PathVariable("uid") int uid){
        System.out.println("调用根据用户id查询用户信息的方法");
        UserExtend userExtend = userExtendService.queryByUid(uid);
        if(userExtend == null){
            return new ResultBean(1,null,"个人信息为空");
        }
        return new ResultBean(0,userExtend,"个人信息查询成功");
    }


    @ResponseBody
    @RequestMapping("/add/userextend")
    public ResultBean addUserExtend(UserExtend userExtend){
        System.out.println("调用添加用户信息的方法");
        int row = userExtendService.insertUserExtend(userExtend);
        if(row == 1){
            return new ResultBean(1,null,"添加用户信息失败");
        }
        return new ResultBean(0,null,"添加用户信息成功");
    }


    @ResponseBody
    @RequestMapping("/modify/userextend")
    public ResultBean modifyUserExtend(UserExtend userExtend){
        System.out.println("调用修改用户信息的方法");
        int row = userExtendService.reviseUserExtend(userExtend);
        if(row == 1){
            return new ResultBean(1,null,"修改用户信息失败");
        }
        return new ResultBean(0,null,"修改用户信息成功");
    }

}
