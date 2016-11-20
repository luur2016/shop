package com.shop.controller.admin.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 频道管理
 * @author surface
 *
 */
@Controller
@RequestMapping("admin/goodsmanage")
public class ChannelManageController {

	@RequestMapping("/channelmanage")
	public String index(){
		return "admin/goodsmanage/channel_manage";
	}
}
