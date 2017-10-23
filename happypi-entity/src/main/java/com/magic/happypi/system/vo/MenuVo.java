package com.magic.happypi.system.vo;

import com.magic.happypi.system.entity.Menu;

import java.util.Set;

/**
 * @author: GrandKai
 * @create: 2017-09-21 22:11
 */
public class MenuVo extends Menu {

    private Set<Menu> subMenu;

    public Set<Menu> getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(Set<Menu> subMenu) {
        this.subMenu = subMenu;
    }
}
