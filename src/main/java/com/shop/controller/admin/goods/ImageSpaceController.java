package com.shop.controller.admin.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 图片空间
 * @author surface
 *
 */
@Controller
@RequestMapping("admin/goodsmanage")
public class ImageSpaceController {

	@RequestMapping("/imagespace")
	public String index(){
		return "admin/goodsmanage/imagespace";
	}
}
