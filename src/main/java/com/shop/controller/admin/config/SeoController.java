package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/config")
public class SeoController {

	/**
	 * SEO设置
	 * @return
	 */
	@RequestMapping("/seoconfig")
	public String seoConfig(){
		return "admin/config/seo_config";
	}
}
