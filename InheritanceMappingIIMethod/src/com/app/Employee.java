package com.app;

public class Employee {
private int empId;
private String empName;
private double empsal;
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
public double getEmpsal() {
	return empsal;
}
public void setEmpsal(double empsal) {
	this.empsal = empsal;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empsal="
			+ empsal + "]";
}

}
