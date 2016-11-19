package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 性能优化
 * @author surface
 *
 */
@Controller
@RequestMapping("admin/config")
public class PerformanceOptimizationController {

	/**
	 * 性能优化
	 * @return
	 */
	@RequestMapping("/performanceoptimization")
	public String performanceOptimization(){
		return "admin/config/performance_optimization";
	}
}
