package com.cx.hd.navigation.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cx.hd.entity.Navigation;
import com.cx.hd.mapper.NavigationMapper;
import com.cx.hd.pojo.BaseDao;
import com.cx.hd.pojo.BaseServiceImpl;
import com.navigation.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class NavigationServiceImpl extends BaseServiceImpl<Navigation> implements NavigationService {

    @Autowired
    private NavigationMapper navigationMapper;

    @Override
    public BaseDao<Navigation> getBaseDao() {
        return navigationMapper;
    }

    @Override
    public List selectByTheme() {
        List<Navigation> navigation = navigationMapper.selectByTheme();
        if(navigation == null){
            return null;
        }
        List themes = new ArrayList();
        for (int i = 0;i<navigation.size();i++) {
            themes.add(navigation.get(i).getTheme());
        }
        return themes;
    }
}
