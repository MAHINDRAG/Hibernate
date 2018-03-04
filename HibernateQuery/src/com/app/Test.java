package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	Configuration cfg=new AnnotationConfiguration();
	cfg=cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	
	Query qry=ses.createQuery("insert into com.app.Product(prodId,prodName,price) select i.itemId,i.itemName,i.itemPrice from Item i where i.itemId=?");
	qry.setParameter(0, 200);
	int res=qry.executeUpdate();
	System.out.println("Command Successfully executed");
	System.out.println("Number of records effected due to update insert :"+res);
	/*List l=qry.list();
	System.out.println("Total Number of Records :"+l.size());
	Iterator it=l.iterator();
	while(it.hasNext()){
		Object ob=(Object) it.next();
		Product p=(Product) ob;
		//System.out.println("Product Id:"+ob[0]);
		System.out.println("Product Name:"+p.getProdName());
		System.out.println("Product Price:"+p.getPrice());
		System.out.println("...........");
	}*/
	ses.close();
	sf.close();
}
}
