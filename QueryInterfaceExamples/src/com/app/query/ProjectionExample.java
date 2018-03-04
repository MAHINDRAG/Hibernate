package com.app.query;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Criteria crit = ses.createCriteria(Customer.class);
		/**
		 * Single
		 */
		Projection p1 = Projections.property("customerName");
		crit.setProjection(p1);
		List list = crit.list();
		Iterator it = list.iterator();
		while(it.hasNext()){
			String obj = (String) it.next();
			System.out.println(obj);
		}
		/**
		 * Multiple columns
		 */
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.property("customerName"));
		plist.add(Projections.property("customerId"));
		crit.setProjection(plist);
		 List l=crit.list();		 
		 Iterator it1=l.iterator();		 
		 while(it1.hasNext())
		 {
		 Object ob[] = (Object[])it1.next();
		 System.out.println(ob[0]+"--------"+ob[1]);
		 }		 
		 ses.close();
		 sf.close();
		
	}
}
