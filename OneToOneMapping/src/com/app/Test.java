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
		
		
		Project pro=new Project();
		pro.setProjId(103);
		pro.setProjName("Voziq");
		
		Employee emp=new Employee();
		emp.setEmpId(112);
		emp.setEmpName("Mahi");
		emp.setEmpSal(5000.0);
		emp.setProjId(pro);
		
		ses.save(emp);
		ses.save(pro);
				
		tx.commit();
		ses.close();
		
				
	}

}
