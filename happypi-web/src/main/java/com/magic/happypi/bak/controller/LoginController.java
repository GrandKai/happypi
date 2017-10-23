package com.magic.happypi.bak.controller;

import com.magic.happypi.base.BaseController;
import com.magic.happypi.system.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 登陆
 * 
 * @author sxc
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

//	@Autowired
//	private ManuService manuService;
	
	@Autowired
	private UserService userService;

//	@RequestMapping("")
//	public String loginPage(ModelMap map) {
//		return "login";
//	}
//
//	@RequestMapping("/mainPage")
//	public String mainPage(ModelMap map) {
//		return "sys/main";
//	}
//
//	@ResponseBody
//	@RequestMapping("/login")
//	public JSONResult index(HttpServletRequest request, ModelMap model) {
//		JSONResult json = new JSONResult();
//		try {
//			Map<String,Object> loginMap = userService.loginIn(Util.objStr(model.get("userName")),
//																		Util.objStr(model.get("passwd")));
//			if(Util.objInt(loginMap.get("state")) == ConstantUtil.STATUS_SUCCESS){
//				json.setSuccess("ok");
//				SessionUser sessionUser = new SessionUser();
//				sessionUser.SetSessionUser(request.getSession(), loginMap);
//			}
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			json.setException(e.getMessage());
//		}
//		return json;
//	}
//
//	@RequestMapping("/indexPage")
//	public String indexPage(ModelMap map) {
//		return "index";
//	}
//
//	@ResponseBody
//	@RequestMapping("/successfulLandingData")
//	public JSONResult successfulLandingData(HttpServletRequest request, ModelMap map) {
//		JSONResult json = new JSONResult();
//		try {
//			SessionUser sessionUser = (SessionUser)map.get(ConstantUtil.SESSION_USER);
//			json.setParameter(ConstantUtil.SESSION_USER, sessionUser);
//			json.setSuccess("ok");
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			json.setException(e.getMessage());
//		}
//		return json;
//	}
//
//	@RequestMapping("index")
//	public String index() {
//		return "layouts/dashboard";
//	}
//
//	@RequestMapping("/exitLogin")
//	public String exitLogin(HttpServletRequest request,ModelMap map) {
//		request.getSession().removeAttribute(ConstantUtil.SESSION_USER);
//		request.getSession().removeAttribute(ConstantUtil.SESSION_USER_ID);
//		return "login";
//	}
//
//	@RequestMapping("/findOne")
//	public List<SYS_Menu> findOne(ModelMap map) {
//		List<SYS_Menu> sYS_Menu = manuService.findAll();
//		return sYS_Menu;
//	}
}
