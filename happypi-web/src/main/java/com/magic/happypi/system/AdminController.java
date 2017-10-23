package com.magic.happypi.system;

import com.magic.happypi.system.entity.User;
import com.magic.happypi.system.service.impl.UserService;
import com.magic.happypi.system.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author: GrandKai
 * @create: 2017-09-19 23:46
 */
@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String login() {
        return "login";
    }

    /**
     * 登录
     *
     * @param admin
     * @param model
     * @param httpSession
     * @return
     */
    @PostMapping("login")
    public String loginPost(User admin, Model model, HttpSession httpSession) {
//        User adminRes = userService.findByNameAndPassword(admin.getUserName(), admin.getPassword());
        UserVo adminRes = userService.findUserVoByNameAndPassword(admin.getUserName(), admin.getPassword());

        if (adminRes != null) {
            httpSession.setAttribute("admin", adminRes);
            model.addAttribute("admin", admin);
            model.addAttribute("menus", adminRes.getMenuList());
            return "redirect:index";
        } else {
            model.addAttribute("error", "用户名或密码错误，请重新登录！");
            return "login";
        }
    }

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("register")
    public String register() {
        return "register";
    }
}
