package com.shop.model;

import java.util.Date;

import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Table(name="tt_user")
@Data
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor
public class TTUser {
	private int id;
	private String name;
	private int age;
	private char sex;
	private Date birthday;
	private Integer address_id;
}
