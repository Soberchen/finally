package com.clock.entity;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * ǩ����Ա��Ϣ��
 * @author Chen
 *
 */
public class Person {
	private int id;
	private String name;//�û���
	
	public String getClockTime() {
		return clockTime;
	}
	public void setClockTime(String clockTime) {
		this.clockTime = clockTime;
	}
	private String loginName;//��¼��
	private String password;//����
	private int clockCount;//ǩ����
	private String clockTime;//ǩ��ʱ��
	
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
