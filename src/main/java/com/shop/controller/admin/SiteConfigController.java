package com.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/siteconfig")
public class SiteConfigController {

	@RequestMapping("")
	public String index(){
		return "admin/console/siteconfig/site_config";
	}
}
