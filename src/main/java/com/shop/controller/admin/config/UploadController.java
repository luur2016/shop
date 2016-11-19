package com.shop.controller.admin.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 上传设置
 * @author surface
 *
 */
@Controller
@RequestMapping("admin/config")
public class UploadController {
	
	/**
	 * 上传设置
	 * @return
	 */
	@RequestMapping("/uploadconfig")
	public String uploadConfig(){
		return "admin/config/upload_config";
	}
}
