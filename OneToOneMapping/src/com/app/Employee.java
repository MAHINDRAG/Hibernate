package com.app;

public class Employee {
private int empId;
private String empName;
private double empSal;
private Project projId;

public Project getProjId() {
	return projId;
}


public void setProjId(Project projId) {
	this.projId = projId;
}


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
