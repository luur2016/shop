package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 运单模板
 * @return
 */
@Controller
@RequestMapping("admin/config")
public class WaybillController {

	/**
	 * 运单模板
	 * @return
	 */
	@RequestMapping("/expressbillmodelconfig")
	public String expressBillModelConfig(){
		return "admin/config/expressbill_model_config";
	}
}
