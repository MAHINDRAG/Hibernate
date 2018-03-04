package com.app.one.many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One_ManyInsertQueryDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("com/app/one/many/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Vendor v = new Vendor();
		v.setVendorId(1001);
		v.setVendorName("Arun");
		Customer c1 = new Customer();
		c1.setCustomerId(504);
		c1.setCustomerName("krishna");
		Customer c2 = new Customer();
		c2.setCustomerId(505);
		c2.setCustomerName("Murali");
		Customer c3 = new Customer();
		c3.setCustomerId(506);
		c3.setCustomerName("Narasimha");
		Set<Customer> s = new HashSet<Customer>();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		v.setCustomer(s);
		try{
			tx.begin();
			ses.save(v);
			tx.commit();
			System.out.println("Record Inserted Successfully");
		}catch(Exception e){
			e.getMessage();
			e.printStackTrace();
		}finally {
			ses.close();
			sf.close();
		}
		
	}
}
