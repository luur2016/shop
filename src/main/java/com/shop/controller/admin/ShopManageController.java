package com.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/shopmanage")
public class ShopManageController {

	@RequestMapping("")
	public String index(){
		return "admin/shopmanage/shop_manage";
	}
}
