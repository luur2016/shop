package com.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/membermanage")
public class MemberManageController {
	
	@RequestMapping("")
	public String index(){
		return "admin/membermanage/member_manage";
	}
}
