package com.magic.happypi.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.magic.happypi.base.IBaseService;
import com.magic.happypi.syetem.dao.UserDao;
import com.magic.happypi.syetem.mapper.MenuMapper;
import com.magic.happypi.syetem.mapper.RoleMapper;
import com.magic.happypi.syetem.mapper.UserDetailMapper;
import com.magic.happypi.syetem.mapper.UserMapper;
import com.magic.happypi.system.entity.Menu;
import com.magic.happypi.system.entity.Role;
import com.magic.happypi.system.entity.User;
import com.magic.happypi.system.entity.UserDetail;
import com.magic.happypi.system.vo.UserVo;
import com.magic.happypi.utils.Util;
import com.magic.happypi.utils.grid.JqGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: GrandKai
 * @create: 2017-09-17 12:43
 */
@Service
public class UserService implements IBaseService<User> {

    @Autowired
    private UserDetailMapper userDetailMapper;

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private MenuMapper menuMapper;

//    =========================================================================================================

    /**
     * 登录验证
     *
     * @param userName
     * @param passwd
     * @return
     */
    public Map<String, Object> loginIn(String userName, String passwd){
        User user = new User();
        user.setUserName(userName);
        user.setPassword(passwd);

        return processingUserLogin(user);
    }

    /**
     * 处理用户登录信息
     *
     * @param user 条件查询userName, passwd
     * @return
     */
    private Map<String, Object> processingUserLogin(User user){
        Map<String, Object> reMap = new HashMap<String, Object>();
        reMap.put("state",0);
        user = userMapper.selectOne(user);
        if(user == null){//账号或密码错误
            reMap.put("info","账号或密码错误");
            return reMap;
        } else {
            if("0".equals(user.getEnabled())){//账号无效
                reMap.put("info","账号无效");
                return reMap;
            } else {
                if("".equals(user.getAccountNoneLocked())){//账号被锁定
                    reMap.put("info","账号被锁定");
                    return reMap;
                } else {
                    String userId = user.getUserId();
                    UserDetail userDetail = new UserDetail();
                    userDetail.setUserId(userId);
                    userDetail = userDetailMapper.selectOne(userDetail);//查询用户详细信息
                    List<Role> roleList = roleMapper.findRoleByUserId(userId);//查询用户角色信息
                    List<String> whereList = new ArrayList<String>();
                    for(Role role:roleList){
                        whereList.add(role.getRoleId());
                    }
                    List<Menu> menuReList = new ArrayList<Menu>();
                    formatOrderMenu(menuMapper.findMenuByRoleIds(whereList), menuReList);// 查询菜单信息
                    reMap.put("state",1);
                    reMap.put("user",user);
                    reMap.put("userDetail",userDetail);
                    reMap.put("roleList",roleList);
                    reMap.put("menuList",menuReList);
                    return reMap;
                }
            }
        }
    }

    /**
     * 格式化顺序
     *
     * @param menuList 未格式化顺序的
     */
    private void formatOrderMenu(List<Menu> menuList, List<Menu> menuReList){
        for(Menu menu:menuList){
            if("0".equals(menu.getIsLeaf())){
                menuReList.add(menu);
                String menuId = menu.getMenuId();
                for(Menu menuSub:menuList){
                    if(menuId.equals(menuSub.getParentId())){
                        menuReList.add(menuSub);
                    }
                }
            }
        }
    }

    @Override
    public Boolean insert(User user) {
        return null;
    }

    @Override
    public Boolean update(User user) {
        return null;
    }

    @Override
    public Boolean delete(User user) {
        return null;
    }

    @Override
    public User get(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

//    @Override
//    public PageInfo searchPageWithMap(int pageNum, int PageSize, Map params) {
//        return null;
//    }

    @Override
    public PageInfo searchPageWithMap(int pageNum, int PageSize, Map params) {

        PageHelper.startPage(pageNum, PageSize);

        List<User> list =  userMapper.selectAll();

        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    public Map<String,Object> searchPageWithMap(ModelMap modelMap){
        Map<String,Object> reMap = null;
        try {
            JqGrid jqGrid = new JqGrid();
            String whereParam = jqGrid.setParameter(modelMap);
            String orderParam = "";
            //数据排序规则(根据实际情况选择)
            if(!Util.strIsEmpty(jqGrid.getSort()) && !Util.strIsEmpty(jqGrid.getOrder())) {
                orderParam = " order by "+jqGrid.getSort()+" "+jqGrid.getOrder();
            }
            Map<String,String> params = new HashMap<String,String>();
            params.put("whereParam",whereParam);
            params.put("orderParam",orderParam);

            PageHelper.startPage(jqGrid.getPage(), jqGrid.getRows());
            List<User> list =  userMapper.searchPage(params);
            PageInfo pageInfo = new PageInfo(list);

            reMap = jqGrid.getParameter(pageInfo,null);
        } catch (Exception e) {
            reMap = new HashMap<String,Object>();
            e.fillInStackTrace();
        }
        return reMap;
    }

//    public User findByNameAndPassword(User admin) {
//        return userMapper.findByNameAndPassword(admin);
//    }


    public User findByNameAndPassword(String userName, String password) {
        return userMapper.findByNameAndPassword(userName, password);
    }
    public UserVo findUserVoByNameAndPassword(String userName, String password) {
        UserVo vo = userMapper.findUserVoByNameAndPassword(userName, password);
        Set<Role> roles = vo.getRoleList();
        if (roles != null) {
            Set<Menu> menus = menuMapper.findMenuByRoles(roles);
            if (menus != null) {
                vo.setMenuList(menus);
            }
        }
        return vo;
    }



//    public PageInfo<User> se
}
