//package com.magic.happypi.controller;
//
//import com.github.pagehelper.PageInfo;
//import com.magic.happypi.base.BaseController;
//import com.magic.happypi.system.entity.User;
//import com.magic.happypi.service.impl.UserService;
//import com.magic.happypi.utils.JSONResult;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.Map;
//
///**
// * @author: GrandKai
// * @create: 2017-09-16 19:19
// */
//@Controller
//@RequestMapping("/user")
//public class UserController extends BaseController {
//
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping("/listPage")
//    public String listPage() {
//        return "/sys/user/list";
//    }
//
//    @ResponseBody
//    @RequestMapping("/list")
//    public Map<String, Object> list(ModelMap modelMap) {
//        JSONResult jsonResult = new JSONResult();
//        try{
////            jsonResult.setParameter(userService.searchPageWithMap(modelMap));
//        } catch (Exception e){
//            log.error(e.getMessage());
//        }
//        return userService.searchPageWithMap(modelMap);
//    }
//
//    @RequestMapping("/user")
//    public PageInfo getUserList() {
//        return userService.searchPageWithMap(  2, 2, null);
//    }
//
//    @RequestMapping("/getUser")
//    public User getUser() {
//        User user = userService.get("1");
//        return user;
//    }
//}
