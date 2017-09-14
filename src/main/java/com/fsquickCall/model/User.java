package com.fsquickCall.model;

import java.io.File;

import org.springframework.stereotype.Component;


/**
 * 上传文件数据实体
 *
 */

@Component
public class User {

	private int id;
	private String loginid;
	private String name;
	private String phone;
	private String planid;
	private String plan;
	private String note;
	
	private File userUploadFile;
	
	
	
	public File getUserUploadFile() {
		return userUploadFile;
	}

	public void setUserUploadFile(File userUploadFile) {
		this.userUploadFile = userUploadFile;
	}

	public User() {
	}
	
	public User(String loginid, String name, String phone, String planid, String plan, String note) {
		super();
		this.loginid = loginid;
		this.name = name;
		this.phone = phone;
		this.planid = planid;
		this.plan = plan;
		this.note = note;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getPlanid() {
		return planid;
	}

	public void setPlanid(String planid) {
		this.planid = planid;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
