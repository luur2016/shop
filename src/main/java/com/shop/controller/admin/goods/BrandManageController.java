package com.shop.controller.admin.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 品牌管理
 * @author surface
 *
 */
@Controller
@RequestMapping("admin/goodsmanage")
public class BrandManageController {

	@RequestMapping("/brandmanage")
	public String index(){
		return "admin/goodsmanage/brand_manage";
	}
}
