package com.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.controller.BaseController;

@Controller
@RequestMapping("admin/console")
public class ConsoleController extends BaseController{
	
	@RequestMapping("")
	public String index(){
		return "admin/console/welcome";
	}
}
