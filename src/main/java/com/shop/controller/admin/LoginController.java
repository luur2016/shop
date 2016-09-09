package com.shop.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.controller.BaseController;
import com.shop.model.admin.Admin;
import com.shop.service.admin.LoginService;
import com.shop.tools.EncryptedTools;
import com.shop.tools.YZMUtils;

/**
 * 管理员登录
 * @author surface
 *
 */
@Controller
@RequestMapping("admin")
public class LoginController extends BaseController{
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("")
	public String index(){
		return "admin/login";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,String userName,String password,
			String captcha, Model model){
		
		String nav = "redirect:/admin";
		
		// 检查验证码是否正确
		Object yzm = request.getSession().getAttribute("YZM");
		if(yzm != null && captcha != null){
			if(captcha.equals(yzm.toString())){
				// 检查用户是否存在
				Admin admin = loginService.longin(userName, EncryptedTools.stringToMd5(password));
				if(admin != null && admin.getAdmin_id()>0){
					return "admin/index";
				}else{
					//　跳转至错误页面
					model.addAttribute("info","用户名或密码错误，请重新输入");
					model.addAttribute("url", "/admin");
					return "errorinfo";
				}
			}else{
				//　跳转至错误页面
				model.addAttribute("info","验证码输入错误，请重新输入");
				model.addAttribute("url", "/admin");
				return "errorinfo";
			}
		}
		
		return nav;
	}
	
	@RequestMapping("/yanzhengma")
	public void getYanzhengma(HttpServletRequest request,HttpServletResponse response){
		try {
			YZMUtils.getYZM(request, response);
			//System.out.println(request.getSession().getAttribute("YZM"));
			ModelAndView mav = new ModelAndView();
			mav.addObject("YZM", request.getSession().getAttribute("YZM"));
		} catch (Exception e) {
		} 
	}
}
