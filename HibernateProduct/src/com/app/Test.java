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
	emp.setEmpId(100);
	emp.setEmpName("Mahindra");
	emp.setEmpsal(4506.0);
	
	Developer dev=new Developer();
	dev.setEmpId(101);
	dev.setEmpName("janardhan");
	dev.setEmpsal(4520);
	dev.setTechid(785);
	dev.setTechName("java");
	dev.setExp(8);
	
	Manager mgr=new Manager();
	mgr.setEmpId(103);
	mgr.setEmpName("venkatesh");
	mgr.setEmpsal(8965);
	mgr.setProjId(652);
	mgr.setProjName("voziq");
	
	ses.save(emp);
	ses.save(dev);
	ses.save(mgr);
	
	tx.commit();
	System.out.println("Records inserted successfully");
	ses.close();
	
	
}
}
