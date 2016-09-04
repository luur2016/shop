package com.shop.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor
public class UserInfo {
	private int id;
	private String name;
	private int age;
	private String sex;
	private Date birthday;
	private String address;
}
