package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test2 {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg=cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
	tx.begin();
	 
    Object obj=ses.load(Product.class, new Integer(104));
	Product p=(Product) obj;
	p.setProductName("Gova");
	p.setPrice(452.0);
	ses.update(p);
	tx.commit();
	System.out.println("Record inserted into  successfully");

	ses.close();
	
}
}
