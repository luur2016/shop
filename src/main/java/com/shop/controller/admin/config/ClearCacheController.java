package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/config")
public class ClearCacheController {

	/**
	 * 清除缓存
	 * @return
	 */
	@RequestMapping("/cleancache")
	public String cleanCache(){
		return "admin/config/cleancache";
	}
}
