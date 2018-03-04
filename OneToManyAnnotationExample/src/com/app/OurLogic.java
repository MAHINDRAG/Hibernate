package com.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class OurLogic {

public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg=cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
	tx.begin();
	
	Vendor v=new Vendor();
	v.setVendorId(501);
	v.setVendorName("Dell");
	
	Customers c1=new Customers();
	c1.setCustomerId(100);
	c1.setCustomerName("Mahi");
	
	Customers c2=new Customers();
    c2.setCustomerId(102);
    c2.setCustomerName("jana");
    
    Set<Customers> s=new HashSet<Customers>();
    s.add(c1);
    s.add(c2);
    v.setChildren(s);
    ses.save(v);
    tx.commit();

	ses.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	sf.close();
    
	
	
}
}
