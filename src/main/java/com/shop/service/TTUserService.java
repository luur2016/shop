package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.UserInfo;
import com.shop.mapper.TTUserMapper;
import com.shop.model.TTUser;

@Service
public class TTUserService {
	
	@Autowired
	TTUserMapper ttUserMapper;
	
	public List<TTUser> getAllUsers(){
		return ttUserMapper.selectAll();
	}
	
	public List<UserInfo> getAllUserInfo(){
		return ttUserMapper.getAllUserInfo();
	}
}
