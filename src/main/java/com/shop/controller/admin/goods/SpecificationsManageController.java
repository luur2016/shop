package com.shop.controller.admin.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 规格管理
 * @author surface
 *
 */
@Controller
@RequestMapping("admin/goodsmanage")
public class SpecificationsManageController {
	
	@RequestMapping("/specificationsmanage")
	public String index(){
		return "admin/goodsmanage/specifications_manage";
	}
}
