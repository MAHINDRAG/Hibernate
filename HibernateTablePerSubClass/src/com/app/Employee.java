package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="EMP_SUBCLASS_TABLE")
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="eid")
  private int empId;
	@Column(name="ename")
  private String empName;
	@Column(name="esal")
  private double empSal;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal="
			+ empSal + "]";
}
  
}
