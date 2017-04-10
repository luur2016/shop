package com.shop.mapper.admin;

import org.apache.ibatis.annotations.Param;

import com.common.mapper.MyMapper;
import com.shop.model.admin.Setting;

public interface SettingMapper extends MyMapper<Setting>{
  public int updateSettingInfo(@Param("value")String value,@Param("name")String name);
}
