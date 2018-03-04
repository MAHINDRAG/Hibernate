package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg=cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
	tx.begin();
	 //Transient _state
	Product p=new Product();
	p.setProductId(105);
	p.setProductName("Mango");
	p.setPrice(403.0);
	 //Transient _end
	
	//persistentstate_start
	ses.save(p);
	//ses.update(p);
	tx.commit();
	//persistentstate_end
	System.out.println("Record inserted into  successfully");

	ses.close();
	
}
}
