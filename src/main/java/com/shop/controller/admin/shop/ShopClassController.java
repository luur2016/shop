package com.shop.controller.admin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/shop")
public class ShopClassController {

	@RequestMapping("/class")
	public String shopClass(){
		return "admin/shopmanage/shop_class";
	}
}
