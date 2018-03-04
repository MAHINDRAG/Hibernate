package com.app.many.one;

public class Customer {

	private int customerId;
	private String customerName;
	private Vendor vendorObjects;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Vendor getVendorObjects() {
		return vendorObjects;
	}
	public void setVendorObjects(Vendor vendorObjects) {
		this.vendorObjects = vendorObjects;
	}
	
	
}
