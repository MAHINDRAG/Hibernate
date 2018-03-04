package com.app;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="DEV_CONCRETE_TABLE")
@AttributeOverrides({
	@AttributeOverride(name="empId",column=@Column(name="eid")),
	@AttributeOverride(name="empName",column=@Column(name="ename")),
	@AttributeOverride(name="empSal",column=@Column(name="esal"))
	
})
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
