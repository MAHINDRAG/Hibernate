package com.app.cache;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Product")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="productInfo")
public class Product {
    @Id
    @Column(name="prodID")
	private Integer productId;
    @Column(name="prodName")
	private String proName;
    @Column(name="price")
	private Double price;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
    
    
}
