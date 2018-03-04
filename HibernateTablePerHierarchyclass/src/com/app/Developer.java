package com.app;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("dev")
public class Developer extends Employee{
	@Column(name="tid")
	private int techId;
	@Column(name="tname")
	private String techName;
	@Column(name="exp")
	private int exp;
	
	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Developer [techId=" + techId + ", techName=" + techName
				+ ", exp=" + exp + "]";
	}
	

}
