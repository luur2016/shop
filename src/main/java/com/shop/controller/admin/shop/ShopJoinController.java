package com.shop.controller.admin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/shop")
public class ShopJoinController {

	@RequestMapping("/join")
	public String shopJoin(){
		return "admin/shopmanage/shop_join";
	}
}
