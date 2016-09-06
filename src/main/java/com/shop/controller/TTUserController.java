package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.dto.UserInfo;
import com.shop.model.TTUser;
import com.shop.service.TTUserService;

@Controller
public class TTUserController extends BaseController{
	
	@Autowired
	TTUserService ttUserService;
	
	@RequestMapping("/users")
	public List<TTUser> getAllUsers(){
		return ttUserService.getAllUsers();
	}
	
	@RequestMapping("/userinfos")
	public PageInfo<UserInfo> getAllUserInfo(){
		PageHelper.startPage(1,1);
		return new PageInfo<UserInfo>(ttUserService.getAllUserInfo());
	}
	
	@RequestMapping("/")
	public String index(){return "index";}
}
