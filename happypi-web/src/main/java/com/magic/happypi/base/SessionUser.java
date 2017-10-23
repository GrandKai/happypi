package com.magic.happypi.base;

import com.magic.happypi.system.entity.Menu;
import com.magic.happypi.system.entity.Role;
import com.magic.happypi.system.entity.User;
import com.magic.happypi.system.entity.UserDetail;
import com.magic.happypi.utils.ConstantUtil;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by sxc on 2017/9/18.
 */
public class SessionUser {

    private User user;

    private UserDetail userDetail;

    private List<Role> roleList;

    private List<Menu> menuList;

    public void SetSessionUser(HttpSession session, Map<String,Object> sessionMap){
        setUser((User)sessionMap.get("user"));
        setUserDetail((UserDetail)sessionMap.get("userDetail"));
        setRoleList((List<Role>)sessionMap.get("roleList"));
        setMenuList((List<Menu>)sessionMap.get("menuList"));
        session.setAttribute(ConstantUtil.SESSION_USER, this);
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}
