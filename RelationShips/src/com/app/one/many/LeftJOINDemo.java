package com.app.one.many;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LeftJOINDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("com/app/one/many/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Query qry= ses.createQuery("select v.vendorName, c.customerName from Vendor v Left Join v.customer c");		 
		//SQLQuery qry = ses.createSQLQuery("select v.vendName, c.custName from vendor1_M v LEFT JOIN customer1_M c ON v.vendId = c.forevenId");
		 // SQLQuery qry = ses.createSQLQuery("select c.custID, c.custName, v.vendName from customer1_M c RIGHT JOIN vendor1_M v ON  c.forevenId = v.vendId");
		
		List l = qry.list();
		Iterator it=l.iterator();		 
		while(it.hasNext())
		{
			Object rows[] = (Object[])it.next();
			System.out.println(rows[0]+ " -- " +rows[1]);
		}
	}
}
