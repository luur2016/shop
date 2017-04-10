package com.shop.controller.admin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/shop")
public class ShopDomainSettingController {

	@RequestMapping("/domain")
	public String shopDomainSetting(){
		return "/admin/shopmanage/shop_domain_setting";
	}
}
