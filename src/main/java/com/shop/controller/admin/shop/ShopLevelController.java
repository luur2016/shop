package com.shop.controller.admin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/shop")
public class ShopLevelController {

	@RequestMapping("/level")
	public String shopLevel(){
		return "admin/shopmanage/shop_level";
	}
}
