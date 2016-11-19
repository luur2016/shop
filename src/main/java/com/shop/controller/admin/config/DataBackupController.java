package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/config")
public class DataBackupController {

	/**
	 * 数据备份
	 * @return
	 */
	@RequestMapping("/databasebackup")
	public String dbBackup(){
		return "admin/config/database_backup";
	}
}
