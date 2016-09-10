package com.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/goodsmanage")
public class GoodsManageController {

	@RequestMapping("")
	public String index(){
		return "admin/goodsmanage/goods_manage";
	}
}
