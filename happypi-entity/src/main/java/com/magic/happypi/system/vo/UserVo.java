package com.magic.happypi.system.vo;

import com.magic.happypi.system.entity.Menu;
import com.magic.happypi.system.entity.Role;
import com.magic.happypi.system.entity.User;
import com.magic.happypi.system.entity.UserDetail;

import java.util.Set;

/**
 * @author: GrandKai
 * @create: 2017-09-20 22:33
 */
public class UserVo extends User {

    /**
     * 用户详细信息
     */
    private UserDetail userDetail;

    /**
     * 用户角色
     */
    private Set<Role> roleList;

    /**
     * 用户菜单
     */
    private Set<Menu> menuList;

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public Set<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(Set<Role> roleList) {
        this.roleList = roleList;
    }

    public Set<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(Set<Menu> menuList) {
        this.menuList = menuList;
    }
}
