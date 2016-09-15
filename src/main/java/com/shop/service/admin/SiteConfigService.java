package com.shop.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.SettingDTO;
import com.shop.mapper.admin.SettingMapper;
import com.shop.model.admin.Setting;

@Service
public class SiteConfigService {
	
	@Autowired
	SettingMapper settingMapper;
	
	/**
	 * 获取所有设置
	 * @return
	 */
	public SettingDTO getAllSiteConfigs(){
		List<Setting> settings = settingMapper.selectAll();
		SettingDTO settingDTO = new SettingDTO();
		for(Setting setting : settings){
			String name = setting.getName();
			if("site_name".equals(name))
				settingDTO.setSite_name(setting.getValue());
			if("site_logo".equals(name))
				settingDTO.setSite_logo(setting.getValue());
			if("site_mobile_logo".equals(name))
				settingDTO.setSite_mobile_logo(setting.getValue());
			if("site_logowx".equals(name))
				settingDTO.setSite_logowx(setting.getValue());
			if("member_logo".equals(name))
				settingDTO.setMember_logo(setting.getValue());
			if("seller_center_logo".equals(name))
				settingDTO.setSeller_center_logo(setting.getValue());
			if("time_zone".equals(name))
				settingDTO.setTime_zone(setting.getValue());
			if("site_phone".equals(name))
				settingDTO.setSite_phone(setting.getValue());
			if("site_bank_account".equals(name))
				settingDTO.setSite_bank_account(setting.getValue());
			if("site_email".equals(name))
				settingDTO.setSite_email(setting.getValue());
			if("statistics_code".equals(name))
				settingDTO.setStatistics_code(setting.getValue());
			if("icp_number".equals(name))
				settingDTO.setIcp_number(setting.getValue());
			if("site_tel400".equals(name))
				settingDTO.setSite_tel400(setting.getValue());
			if("site_status".equals(name))
				settingDTO.setSite_status(setting.getValue());
			if("closed_reason".equals(name))
				settingDTO.setClosed_reason(setting.getValue());
		}
		return settingDTO;
	}
}
