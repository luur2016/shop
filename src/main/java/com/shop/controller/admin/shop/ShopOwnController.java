package com.shop.controller.admin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/shop")
public class ShopOwnController {

	@RequestMapping("/own")
	public String shopOwn(){
		return "/admin/shopmanage/shop_own";
	}
}
