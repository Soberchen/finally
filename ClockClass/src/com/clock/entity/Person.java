package com.clock.entity;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 签到人员信息表
 * @author Chen
 *
 */
public class Person {
	private int id;
	private String name;//用户名
	
	public String getClockTime() {
		return clockTime;
	}
	public void setClockTime(String clockTime) {
		this.clockTime = clockTime;
	}
	private String loginName;//登录名
	private String password;//密码
	private int clockCount;//签到数
	private String clockTime;//签到时间
	
	public int getClockCount() {
		return clockCount;
	}
	public void setClockCount(int clockCount) {
		this.clockCount = clockCount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
