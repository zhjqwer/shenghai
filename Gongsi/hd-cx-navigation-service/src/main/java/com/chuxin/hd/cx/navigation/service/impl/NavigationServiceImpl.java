package com.chuxin.hd.cx.navigation.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.chuxin.mapper.NavigationMapper;
import com.chuxin.pojo.Navigation;
import com.chuxin.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;

@Service
public class NavigationServiceImpl implements NavigationService {

    @Autowired
    private NavigationMapper navigationMapper;


    @Override
    public List selectByTheme() {

        List<Navigation> navigations = navigationMapper.selectByTheme();
        if(navigations == null){
            return null;
        }
        List themes = new ArrayList();
        for (int i = 0;i<navigations.size();i++) {
            themes.add(navigations.get(i).getTheme());
        }
        return themes;
    }
}
