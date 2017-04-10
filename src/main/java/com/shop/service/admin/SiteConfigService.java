package com.shop.service.admin;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.config.Config;
import com.shop.dto.SettingDTO;
import com.shop.mapper.admin.SettingMapper;
import com.shop.model.admin.Setting;

@Service
public class SiteConfigService {

  @Autowired
  SettingMapper settingMapper;
  @Autowired
  Config config;

  /**
   * 获取所有设置
   * 
   * @return
   */
  public SettingDTO getAllSiteConfigs() {
    
    String uploadPath = config.getUpload();
    
    List<Setting> settings = settingMapper.selectAll();
    SettingDTO settingDTO = new SettingDTO();
    for (Setting setting : settings) {
      String name = setting.getName();
      if ("site_name".equals(name))
        settingDTO.setSite_name(setting.getValue());
      if ("site_logo".equals(name))
        settingDTO.setSite_logo(uploadPath + setting.getValue());
      if ("site_mobile_logo".equals(name))
        settingDTO.setSite_mobile_logo(uploadPath + setting.getValue());
      if ("site_logowx".equals(name))
        settingDTO.setSite_logowx(uploadPath + setting.getValue());
      if ("member_logo".equals(name))
        settingDTO.setMember_logo(uploadPath + setting.getValue());
      if ("seller_center_logo".equals(name))
        settingDTO.setSeller_center_logo(uploadPath + setting.getValue());
      if ("time_zone".equals(name))
        settingDTO.setTime_zone(setting.getValue());
      if ("site_phone".equals(name))
        settingDTO.setSite_phone(setting.getValue());
      if ("site_bank_account".equals(name))
        settingDTO.setSite_bank_account(setting.getValue());
      if ("site_email".equals(name))
        settingDTO.setSite_email(setting.getValue());
      if ("statistics_code".equals(name))
        settingDTO.setStatistics_code(setting.getValue());
      if ("icp_number".equals(name))
        settingDTO.setIcp_number(setting.getValue());
      if ("site_tel400".equals(name))
        settingDTO.setSite_tel400(setting.getValue());
      if ("site_status".equals(name))
        settingDTO.setSite_status(setting.getValue());
      if ("closed_reason".equals(name))
        settingDTO.setClosed_reason(setting.getValue());
    }
    return settingDTO;
  }

  @Transactional
  public boolean addSiteConfigs(SettingDTO settingDto){
    
    boolean isOk = false;
    List<Setting> settings = new ArrayList<Setting>();
    
    Setting site_name = Setting.builder().name("site_name").value(settingDto.getSite_name()).build();
    Setting site_logo = Setting.builder().name("site_logo").value(settingDto.getSite_logo()).build();
    Setting site_mobile_logo = Setting.builder().name("site_mobile_logo").value(settingDto.getSite_mobile_logo()).build();
    Setting site_logowx = Setting.builder().name("site_logowx").value(settingDto.getSite_logowx()).build();
    Setting member_logo = Setting.builder().name("member_logo").value(settingDto.getMember_logo()).build();
    Setting time_zone = Setting.builder().name("time_zone").value(settingDto.getTime_zone()).build();
    Setting site_phone = Setting.builder().name("site_phone").value(settingDto.getSite_phone()).build();
    Setting site_bank_account = Setting.builder().name("site_bank_account").value(settingDto.getSite_bank_account()).build();
    Setting site_email = Setting.builder().name("site_email").value(settingDto.getSite_email()).build();
    Setting statistics_code = Setting.builder().name("statistics_code").value(settingDto.getStatistics_code()).build();
    Setting icp_number = Setting.builder().name("icp_number").value(settingDto.getIcp_number()).build();
    Setting site_tel400 = Setting.builder().name("site_tel400").value(settingDto.getSite_tel400()).build();
    Setting site_status = Setting.builder().name("site_status").value(settingDto.getSite_status()).build();
    Setting closed_reason = Setting.builder().name("closed_reason").value(settingDto.getClosed_reason()).build();
    
    settings.add(site_name);
    settings.add(site_logo);
    settings.add(site_mobile_logo);
    settings.add(site_logowx);
    settings.add(member_logo);
    settings.add(time_zone);
    settings.add(site_phone);
    settings.add(site_bank_account);
    settings.add(site_email);
    settings.add(statistics_code);
    settings.add(icp_number);
    settings.add(site_tel400);
    settings.add(site_status);
    settings.add(closed_reason);
    
    for(Setting setting : settings){
      if(setting.getValue() == null || setting.getValue().isEmpty()){
        continue;
      }else{
        int result = settingMapper.updateSettingInfo(setting.getValue(), setting.getName());
        if (result <= 0)
            throw new RuntimeException("数据保存异常！");
      } 
    }
    isOk = true;
    return isOk;
  }
}
