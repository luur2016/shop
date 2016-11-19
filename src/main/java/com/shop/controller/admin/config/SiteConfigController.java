package com.shop.controller.admin.config;

import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.shop.dto.SettingDTO;
import com.shop.service.admin.SiteConfigService;
import com.shop.tools.FileUpload;

@Controller
@RequestMapping("admin/config")
public class SiteConfigController {
	
	@Autowired
	SiteConfigService siteConfigService;

	/**
	 * 站点设置
	 * @return
	 */
	@RequestMapping(value = "/siteconfig" , method = RequestMethod.GET)
	public String index(Model model){
		SettingDTO settings = siteConfigService.getAllSiteConfigs();
		model.addAttribute("settings", settings);
		return "admin/config/site_config";
	}
	
	@RequestMapping(value = "/siteconfig" , method = RequestMethod.POST)
	public String saveSiteConfig(
			SettingDTO settingDto,MultipartFile site_logo_file,MultipartFile seller_center_logo_file,
			MultipartFile site_mobile_logo_file,MultipartFile site_logowx_file,MultipartFile member_logo_file,
			HttpServletRequest request){
		String path=request.getSession().getServletContext().getRealPath("/data/upload/");
		if(!site_logo_file.isEmpty()){
			FileUpload.upload(site_logo_file, 
					Paths.get(path, site_logo_file.getOriginalFilename()).toString());
		}
 		return null;
	}
}
