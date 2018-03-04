package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Table")
public class Customers {
	@Id
	@Column(name="cid")
private int customerId;
	@Column(name="cname",length=50)
private String customerName;
	
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

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName="
				+ customerName + "]";
	}
	

}
