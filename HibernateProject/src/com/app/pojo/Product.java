package com.app.pojo;

public class Product {
	private int prodId;
	private String prodName;
	private double prodcost;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdcost() {
		return prodcost;
	}
	public void setProdcost(double prodcost) {
		this.prodcost = prodcost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName
				+ ", prodcost=" + prodcost + "]";
	}
	

}
