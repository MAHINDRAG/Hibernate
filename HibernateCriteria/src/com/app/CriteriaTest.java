package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class CriteriaTest {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		
		Criteria crit=ses.createCriteria(Product.class);
		Criterion cn=  Restrictions.gt("price", new Double(500));
		crit.add(cn);
		crit.addOrder(Order.asc("productId"));
		List list=crit.list();
		System.out.println("List total size :"+list.size());
		Iterator it=list.iterator();
		while(it.hasNext()){
			Product p=(Product) it.next();
			System.out.println(p.getProductId()+" ,"+p.getProductName()+","+p.getPrice());
		}
		ses.close();
		sf.close();
	}

}
