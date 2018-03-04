package com.app;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.cache.ReadWriteCache.Item;
@Entity
@Table(name="Catageories_table")
public class Catageories {
	@Id
	@Column(name="catid")
	private int id;
	@Column(name="catname",length=20)
	private String catageoryName;
	@ManyToMany(targetEntity=Item.class,cascade=CascadeType.ALL)
	@JoinTable(name="categories_items",joinColumns=@JoinColumn(name="cat_id_fk",referencedColumnName="catid"),
	inverseJoinColumns=@JoinColumn(name="item_id_fk",referencedColumnName="itemId"))
	private Set items;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatageoryName() {
		return catageoryName;
	}
	public void setCatageoryName(String catageoryName) {
		this.catageoryName = catageoryName;
	}
	public Set getItems() {
		return items;
	}
	public void setItems(Set items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Catageories [id=" + id + ", catageoryName=" + catageoryName
				+ ", items=" + items + "]";
	}
	
	

}
