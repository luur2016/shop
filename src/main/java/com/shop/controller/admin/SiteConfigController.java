package com.shop.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.shop.config.Config;
import com.shop.dto.SettingDTO;
import com.shop.service.admin.SiteConfigService;
import com.shop.tools.FileUpload;

@Controller
@RequestMapping("admin/config")
public class SiteConfigController {

  @Autowired
  SiteConfigService siteConfigService;
  @Autowired
  Config config;

  /**
   * 站点设置
   * 
   * @return
   */
  @RequestMapping(value = "/siteconfig", method = RequestMethod.GET)
  public String index(Model model) {
    SettingDTO settings = siteConfigService.getAllSiteConfigs();
    model.addAttribute("settings", settings);
    return "admin/config/site_config";
  }

  @RequestMapping(value = "/siteconfig", method = RequestMethod.POST)
  public String saveSiteConfig(SettingDTO settingDto, MultipartFile site_logo_file,
      MultipartFile seller_center_logo_file, MultipartFile site_mobile_logo_file,
      MultipartFile site_logowx_file, MultipartFile member_logo_file, 
      HttpServletRequest request,Model model) {
    
    String uploadPath = config.getUpload();
    
    // site_logo
    if (!site_logo_file.isEmpty()) {
      FileUpload.upload(site_logo_file, uploadPath);
      settingDto.setSite_logo(site_logo_file.getOriginalFilename());
    }
    
    // seller_center_logo_file
    if (!seller_center_logo_file.isEmpty()) {
      FileUpload.upload(seller_center_logo_file, uploadPath);
      settingDto.setSeller_center_logo(seller_center_logo_file.getOriginalFilename());
    }

    // site_mobile_logo_file
    if (!site_mobile_logo_file.isEmpty()) {
      FileUpload.upload(site_mobile_logo_file, uploadPath);
      settingDto.setSite_mobile_logo(site_mobile_logo_file.getOriginalFilename());
    }

    // site_logowx_file
    if (!site_logowx_file.isEmpty()) {
      FileUpload.upload(site_logowx_file, uploadPath);
      settingDto.setSite_logowx(site_logowx_file.getOriginalFilename());
    }

    // member_logo_file
    if (!member_logo_file.isEmpty()) {
      FileUpload.upload(member_logo_file, uploadPath);
      settingDto.setMember_logo(member_logo_file.getOriginalFilename());
    }
    
    // save data
    if(!siteConfigService.addSiteConfigs(settingDto)){
      model.addAttribute("info","数据保存出现异常，请稍后重试！");
      model.addAttribute("url", "/admin/config/siteconfig");
      return "errorinfo";
    }
    
    return "redirect:/admin/config/siteconfig";
  }

//  /**
//   * 账号同步
//   * 
//   * @return
//   */
//  @RequestMapping("/accountsynchronization")
//  public String accountSynchronization() {
//    return "admin/config/account_synchronization";
//  }
//
//  /**
//   * 上传设置
//   * 
//   * @return
//   */
//  @RequestMapping("/uploadconfig")
//  public String uploadConfig() {
//    return "admin/config/upload_config";
//  }
//
//  /**
//   * SEO设置
//   * 
//   * @return
//   */
//  @RequestMapping("/seoconfig")
//  public String seoConfig() {
//    return "admin/config/seo_config";
//  }
//
//  /**
//   * 邮箱、短信设置
//   * 
//   * @return
//   */
//  @RequestMapping("/mailandsms")
//  public String mailAndSmsConfig() {
//    return "admin/config/mail_sms_config";
//  }
//
//  /**
//   * 支付设置
//   * 
//   * @return
//   */
//  @RequestMapping("/payconfig")
//  public String payConfig() {
//    return "admin/config/pay_config";
//  }

//  /**
//   * 权限设置
//   * 
//   * @return
//   */
//  @RequestMapping("/authoritymanage")
//  public String authorityManage() {
//    return "admin/config/authority_manage";
//  }

//  /**
//   * 快递公司
//   * 
//   * @return
//   */
//  @RequestMapping("/expressconfig")
//  public String expressConfig() {
//    return "admin/config/express_config";
//  }
//
//  /**
//   * 运单模板
//   * 
//   * @return
//   */
//  @RequestMapping("/expressbillmodelconfig")
//  public String expressBillModelConfig() {
//    return "admin/config/expressbill_model_config";
//  }
//
//  /**
//   * 地区管理
//   * 
//   * @return
//   */
//  @RequestMapping("/areaconfig")
//  public String areaConfig() {
//    return "admin/config/area_config";
//  }
//
//  /**
//   * 配送地区
//   * 
//   * @return
//   */
//  @RequestMapping("/deliveryareaconfig")
//  public String deliveryAreaConfig() {
//    return "admin/config/deliveryarea_config";
//  }

//  /**
//   * 清除缓存
//   * 
//   * @return
//   */
//  @RequestMapping("/cleancache")
//  public String cleanCache() {
//    return "admin/config/cleancache";
//  }

//  /**
//   * 数据备份
//   * 
//   * @return
//   */
//  @RequestMapping("/databasebackup")
//  public String dbBackup() {
//    return "admin/config/database_backup";
//  }

//  /**
//   * 性能优化
//   * 
//   * @return
//   */
//  @RequestMapping("/performanceoptimization")
//  public String performanceOptimization() {
//    return "admin/config/performance_optimization";
//  }
//
//  /**
//   * 搜索设置
//   * 
//   * @return
//   */
//  @RequestMapping("/searchconfig")
//  public String searchConfig() {
//    return "admin/config/search_config";
//  }
//
//  /**
//   * 操作日志
//   * 
//   * @return
//   */
//  @RequestMapping("/operationlog")
//  public String operationLog() {
//    return "admin/config/operation_log";
//  }
}
