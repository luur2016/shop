package com.shop.controller.admin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/shop")
public class ShopHelpController {
	
	@RequestMapping("/help")
	public String shopHelp(){
		return "/admin/shopmanage/shop_help";
	}
}
