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
	//Transaction tx=ses.beginTransaction();
	Object ob=ses.load(Product.class, new Integer(100));
	Product p=(Product) ob;
	System.out.println("Loaded object Product Name is :"+p.getProductName());
	System.out.println("Object Loaded Successfully");	
	ses.close();
	try{
		Thread.sleep(6000);
		
		/*tx.begin();
		Product p=new Product();
		p.setProductId(100);
		p.setProductName("Noodles");
		p.setProductId(500);
		ses.save(p);
		tx.commit();*/
       // System.out.println("Object Loaded Successfully");		
	}catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("6 seconds completed");
	Session ses2=sf.openSession();
	Object ob1=ses2.load(Product.class, new Integer(100));
	Product p1=(Product) ob1;
	System.out.println("Loaded object Product Name is :"+p1.getPrice());
	System.out.println("Object Loaded Successfully");	
	ses2.close();
	sf.close();
}
}
