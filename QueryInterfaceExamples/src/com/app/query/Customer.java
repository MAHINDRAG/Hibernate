package com.app.query;

public class Customer {

	private Integer customerId;
	private String customerName;
	private String custmerMobileNo;
	private String customerCity;
	private Integer version;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustmerMobileNo() {
		return custmerMobileNo;
	}
	public void setCustmerMobileNo(String custmerMobileNo) {
		this.custmerMobileNo = custmerMobileNo;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", custmerMobileNo="
				+ custmerMobileNo + ", customerCity=" + customerCity + "]";
	}
	
	
}
