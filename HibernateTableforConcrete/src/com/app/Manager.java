package com.app;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MGR_CONCRETE_TABLE")
@AttributeOverrides({
	@AttributeOverride(name="empId",column=@Column(name="eid")),
	@AttributeOverride(name="empName",column=@Column(name="ename")),
	@AttributeOverride(name="empSal",column=@Column(name="esal"))
})
public class Manager extends Employee{
	@Column(name="pid")
 private int projId;
	@Column(name="pname")
 private String projName;
public int getProjId() {
	return projId;
}
public void setProjId(int projId) {
	this.projId = projId;
}
public String getProjName() {
	return projName;
}
public void setProjName(String projName) {
	this.projName = projName;
}
@Override
public String toString() {
	return "Manager [projId=" + projId + ", projName=" + projName + "]";
}
 
}
