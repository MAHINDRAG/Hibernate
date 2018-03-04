package com.app.query;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NativeSqlQuery {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		SQLQuery qry = ses.createSQLQuery("select * from customerInfo");
		List list = qry.list();
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object obj[] = (Object[]) it.next();
			System.out.println("ID:"+obj[0]+",Name:"+obj[1]+"MobNo:"+obj[2]+",City:"+obj[3]);
		}
		
		/**
		 * With Type cast
		 */
		System.out.println("***************");
		SQLQuery sqlqry = ses.createSQLQuery("select * from customerInfo").addEntity(Customer.class);
		List l = sqlqry.list();
		Iterator it1 = l.iterator();
		while(it1.hasNext()){
		 Customer c = (Customer) it1.next();
		 System.out.println("ID:"+c.getCustomerId()+",Name:"+c.getCustomerName()+"MobNo:"+c.getCustmerMobileNo()+",City:"+c.getCustomerCity());
		}
	}
}
