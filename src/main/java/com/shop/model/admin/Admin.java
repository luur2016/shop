package com.shop.model.admin;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="club_admin")
public class Admin {
	private int admin_id;
	private String admin_name;
	private String admin_password;
	private long admin_login_time;
	private int admin_login_num;
	private int admin_is_super;
	private int admin_gid;
}
