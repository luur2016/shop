package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/config")
public class AreaController {

	/**
	 * 地区管理
	 * @return
	 */
	@RequestMapping("/areaconfig")
	public String areaConfig(){
		return "admin/config/area_config";
	}
}
