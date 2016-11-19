package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/config")
public class PayController {

	/**
	 * 支付设置
	 * @return
	 */
	@RequestMapping("/payconfig")
	public String payConfig(){
		return "admin/config/pay_config";
	}
	
}
