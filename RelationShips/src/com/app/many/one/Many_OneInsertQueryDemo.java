package com.app.many.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.many.one.Customer;
import com.app.many.one.Vendor;

public class Many_OneInsertQueryDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("com/app/many/one/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
		Vendor v = new Vendor();
		v.setVendorId(1001);
		v.setVendorName("Arun");
		
		Customer c1 = new Customer();
		c1.setCustomerId(504);
		c1.setCustomerName("krishna");
		c1.setVendorObjects(v);
		Customer c2 = new Customer();
		c2.setCustomerId(505);
		c2.setCustomerName("Murali");
		c2.setVendorObjects(v);
		Customer c3 = new Customer();
		c3.setCustomerId(506);
		c3.setCustomerName("Narasimha");
		c3.setVendorObjects(v);
		
		try{
			tx.begin();
			ses.save(c1);
			ses.save(c2);
			ses.save(c3);
			tx.commit();
			System.out.println("Record Inserted Successfully");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ses.close();
			sf.close();
		}
	}
}
