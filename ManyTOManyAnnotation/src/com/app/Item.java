package com.app;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="items")
public class Item {
	@Id
	@Column(name="itemId")
	private int itemId;
	@Column(name="iName",length=10)
	private String itemName;
	@ManyToMany(targetEntity=Catageories.class,mappedBy="items")
	private Set categories;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Set getCategories() {
		return categories;
	}
	public void setCategories(Set categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName
				+ ", categories=" + categories + "]";
	}
	
	
	
}
