package com.shop.controller.admin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/shop")
public class ShopTraceController {

	@RequestMapping("/trace")
	public String shopTrace(){
		return "/admin/shopmanage/shop_trace";
	}
}
