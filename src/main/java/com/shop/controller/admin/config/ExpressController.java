package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/config")
public class ExpressController {

	/**
	 * 快递公司
	 * @return
	 */
	@RequestMapping("/expressconfig")
	public String expressConfig(){
		return "admin/config/express_config";
	}
}
