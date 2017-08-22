package com.fsquickCall.model;

/**
 * 用户实体
 *
 */
public class Staff {

	private Integer id; // 编号
	private String staffName; // 用户名
	private String password; // 密码
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
