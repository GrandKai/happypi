package com.magic.happypi.system;

import com.magic.happypi.base.BaseController;
import com.magic.happypi.base.Result;
import com.magic.happypi.system.service.impl.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("menu")
public class MenuController extends BaseController{

    @Autowired
    private MenuService menuService;

    @GetMapping("index")
    public ModelAndView index(ModelAndView mv) {
        mv.addObject("menus", menuService.selectAllMenu());
        mv.setViewName("layouts/nav");
        return mv;
    }


    @GetMapping("list")
    public Result list() {
        return new Result(menuService.selectAllMenu());
    }


}
