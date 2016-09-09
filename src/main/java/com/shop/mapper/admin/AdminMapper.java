package com.shop.mapper.admin;

import org.apache.ibatis.annotations.Param;

import com.common.mapper.MyMapper;
import com.shop.model.admin.Admin;

public interface AdminMapper extends MyMapper<Admin>{
	public Admin login(@Param("username")String userName,@Param("password")String password);
}
