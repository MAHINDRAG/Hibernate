package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		tx.begin();
		Employee emp=new Employee();
		emp.setEmpid(83);
		emp.setEmpName("Raja");
		emp.setEmpsal(15020);
		
		Object o=ses.load(Employee.class,new Integer(82));
		Employee emp1=(Employee) o;
		System.out.println("Employee Name :"+emp1.getEmpName());
		ses.delete(emp1);
		tx.commit();
		System.out.println("object loaded successfully");
		ses.close();
		sf.close();
	}
}
