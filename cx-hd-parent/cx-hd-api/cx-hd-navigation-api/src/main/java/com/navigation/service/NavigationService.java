package com.navigation.service;

import com.cx.hd.entity.Navigation;
import com.cx.hd.pojo.BaseService;

import java.util.List;

public interface NavigationService extends BaseService<Navigation> {

    //查询导航栏的方法
    List selectByTheme();

}
