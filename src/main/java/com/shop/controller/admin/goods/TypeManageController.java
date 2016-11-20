package com.shop.controller.admin.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类型管理
 * @author surface
 *
 */
@Controller
@RequestMapping("admin/goodsmanage")
public class TypeManageController {

	@RequestMapping("/typemanage")
	public String index(){
		return "admin/goodsmanage/type_manage";
	}
}
