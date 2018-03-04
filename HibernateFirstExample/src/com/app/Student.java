package com.app;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * @author MR_DELL
	 */
	private static final long serialVersionUID = 1L;
	private int stdId;
	private String stdName;
	private double stdFee;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public double getStdFee() {
		return stdFee;
	}
	public void setStdFee(double stdFee) {
		this.stdFee = stdFee;
	}
	
}
