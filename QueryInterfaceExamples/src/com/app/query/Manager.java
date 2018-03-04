package com.app.query;

public class Manager {

	private Integer mgrID;
	private String mgrName;
	private String mgrCity;
	
	public Integer getMgrID() {
		return mgrID;
	}
	public void setMgrID(Integer mgrID) {
		this.mgrID = mgrID;
	}
	public String getMgrName() {
		return mgrName;
	}
	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}
	public String getMgrCity() {
		return mgrCity;
	}
	public void setMgrCity(String mgrCity) {
		this.mgrCity = mgrCity;
	}
	@Override
	public String toString() {
		return "Manager [mgrID=" + mgrID + ", mgrName=" + mgrName + ", mgrCity=" + mgrCity + "]";
	}
	
	
}
