package com.app.query;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class CriteriaExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Criteria crit = ses.createCriteria(Customer.class);
		Criterion cn = Restrictions.gt("customerId", new Integer(2));
		crit.add(cn);
		crit.addOrder(Order.desc("customerId"));
		List<Customer> list = crit.list();
		Iterator<Customer> it = list.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			Customer c = (Customer) obj;
			System.out.println("ID:"+c.getCustomerId()+",name:"+c.getCustomerName()+",mobileNo"+c.getCustmerMobileNo()+",city:"+c.getCustomerCity());
		}
		System.out.println("Record Fetched Successfully");
	}
}
