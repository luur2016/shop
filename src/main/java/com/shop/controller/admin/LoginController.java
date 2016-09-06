package com.shop.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.controller.BaseController;
import com.shop.tools.YZMUtils;

/**
 * 管理员登录
 * @author surface
 *
 */
@Controller
@RequestMapping("admin")
public class LoginController extends BaseController{
	
	@RequestMapping("")
	public String index(){
		return "admin/login";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "";
	}
	
	@RequestMapping("/yanzhengma")
	public void getYanzhengma(HttpServletRequest request,HttpServletResponse response){
		try {
			YZMUtils.getYZM(request, response);
		} catch (Exception e) {
		} 
	}
}
