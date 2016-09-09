package com.shop.service.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.admin.AdminMapper;
import com.shop.model.admin.Admin;
import com.shop.service.BaseService;

@Service
public class LoginService extends BaseService{
	
	@Autowired
	AdminMapper adminMapper;
	
	public Admin longin(String userName,String password){
		return adminMapper.login(userName, password);
	}
}
