package com.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/ordermanage")
public class OrderManageController {
	
	@RequestMapping("")
	public String index(){
		return "admin/ordermanage/realgoodsorder";
	}
}
