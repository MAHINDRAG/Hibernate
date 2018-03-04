package com.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {

	private String empName;
	private String empId;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId("101");
		e1.setEmpName("Mahi");

		Employee e2 = new Employee();
		e2.setEmpId("102");
		e2.setEmpName("Raj");

		Employee e3 = new Employee();
		e3.setEmpId("103");
		e3.setEmpName("Ashok");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()){
			Employee e = it.next();
			System.out.println(e.empId+","+e.empName);
		}
	}


}
