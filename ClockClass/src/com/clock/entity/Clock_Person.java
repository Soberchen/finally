package com.clock.entity;
/**
 * 签到数与学员的关系表
 * @author Chen
 *
 */
public class Clock_Person {
	private int cId;//签到数
	private int pId;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}

}
