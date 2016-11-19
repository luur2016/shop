package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/config")
public class EmailSmsController {

	/**
	 * 邮箱、短信设置
	 * @return
	 */
	@RequestMapping("/mailandsms")
	public String mailAndSmsConfig(){
		return "admin/config/mail_sms_config";
	}
}
