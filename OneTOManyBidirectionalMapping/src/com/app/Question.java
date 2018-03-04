package com.app;

import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Set children;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", children="
				+ children + "]";
	}
	

}
