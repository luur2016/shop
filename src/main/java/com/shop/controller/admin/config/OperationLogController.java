package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 操作日志
 * @author surface
 *
 */
@Controller
@RequestMapping("admin/config")
public class OperationLogController {

	/**
	 * 操作日志
	 * @return
	 */
	@RequestMapping("/operationlog")
	public String operationLog(){
		return "admin/config/operation_log";
	}
}
