package com.magic.happypi.system.service.impl;

import com.github.pagehelper.PageInfo;
import com.magic.happypi.base.IBaseService;
import com.magic.happypi.syetem.mapper.MenuMapper;
import com.magic.happypi.system.entity.Menu;
import com.magic.happypi.system.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class MenuService implements IBaseService<Menu> {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public Boolean insert(Menu menu) {
        return null;
    }

    @Override
    public Boolean update(Menu menu) {
        return null;
    }

    @Override
    public Boolean delete(Menu menu) {
        return null;
    }

    @Override
    public Menu get(String id) {
        return null;
    }

    @Override
    public PageInfo searchPageWithMap(int pageNum, int PageSize, Map<String, Object> params) {
        return null;
    }

    public List<Menu> selectAllMenu() {
        Example example = new Example(Menu.class);
        Example.Criteria criteria = example.createCriteria();

        example.setOrderByClause("order_num asc");
        return menuMapper.selectByExample(example);
    }

    public Set<Menu> selectAllMenusByRoles(Set<Role> roles) {
        return menuMapper.findMenuByRoles(roles);
    }
}
