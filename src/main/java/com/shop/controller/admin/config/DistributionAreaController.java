package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 配送地区
 * @author surface
 *
 */
@Controller
@RequestMapping("admin/config")
public class DistributionAreaController {

	/**
	 * 配送地区
	 * @return
	 */
	@RequestMapping("/deliveryareaconfig")
	public String deliveryAreaConfig(){
		return "admin/config/deliveryarea_config";
	}
}
