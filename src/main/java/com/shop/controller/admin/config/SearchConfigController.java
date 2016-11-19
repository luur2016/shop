package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 搜索设置
 * @author surface
 *
 */
@Controller
@RequestMapping("admin/config")
public class SearchConfigController {

	/**
	 * 搜索设置
	 * @return
	 */
	@RequestMapping("/searchconfig")
	public String searchConfig(){
		return "admin/config/search_config";
	}
}
