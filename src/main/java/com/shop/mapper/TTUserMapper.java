package com.shop.mapper;

import java.util.List;

import com.common.mapper.MyMapper;
import com.shop.dto.UserInfo;
import com.shop.model.TTUser;

public interface TTUserMapper extends MyMapper<TTUser>{
	public List<UserInfo> getAllUserInfo();
}
