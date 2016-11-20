package com.shop.controller.admin.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 分类管理
 * @author surface
 *
 */
@Controller
@RequestMapping("admin/goodsmanage")
public class ClassificationManageController {

	@RequestMapping("/classificationmanage")
	public String index(){
		return "admin/goodsmanage/classification_manage";
	}
}
