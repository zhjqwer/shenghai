package com.cx.hd.mapper;


import com.cx.hd.entity.Navigation;
import com.cx.hd.pojo.BaseDao;

import java.util.List;

public interface NavigationMapper extends BaseDao<Navigation> {

    List<Navigation> selectByTheme();

}