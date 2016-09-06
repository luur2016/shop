package com.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class LoginController {
	
	@RequestMapping("")
	public String login(){
		return "admin/login";
	}
}
