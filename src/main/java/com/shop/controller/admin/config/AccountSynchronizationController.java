package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户同步 @author surface
 *
 */
@Controller
@RequestMapping("admin/config")
public class AccountSynchronizationController {

	/**
	 * 账号同步
	 * @return
	 */
	@RequestMapping("/accountsynchronization")
	public String accountSynchronization(){
		return "admin/config/account_synchronization";
	}
}
