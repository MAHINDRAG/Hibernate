package com.app.composite;

import java.io.Serializable;

public class Product implements Serializable{

	/**
	 * @author Mahindra
	 */
	private static final long serialVersionUID = 1L;
	private Integer productId;
	private String proName;
	private double price;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", proName=" + proName + ", price=" + price + "]";
	}
	
	
}
