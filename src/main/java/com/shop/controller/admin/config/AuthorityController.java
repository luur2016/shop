package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/config")
public class AuthorityController {

	/**
	 * 权限设置
	 * @return
	 */
	@RequestMapping("/authoritymanage")
	public String authorityManage(){
		return "admin/config/authority_manage";
	}
}
