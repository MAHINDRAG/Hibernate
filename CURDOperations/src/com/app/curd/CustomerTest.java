package com.app.curd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Customer customer = new Customer();
		try{			
		   tx.begin();	
		   
			/**
			 * Inserting Record into Database
			 */
			
		/*	customer.setCustomerName("Girish");
			customer.setCustmerMobileNo("9121697574");
			customer.setCustomerCity("Rayachoty");
			ses.save(customer);
			tx.commit();
			System.out.println("Record inserted Successfully");*/
			
			/**
			 * updade Record in Database.
			 */
			
			Object obj = ses.load(Customer.class, new Integer(3));
			Customer cust = (Customer) obj;
			cust.setCustomerName("Mahindra");
			tx.commit();			
			System.out.println("Record updated Successfully");
		   
		   /**
		    * Fetching the record from database
		    */
			/*System.out.println("ID:"+cust.getCustomerId()+", Name:" + cust.getCustomerName()+", MobNo:"+cust.getCustmerMobileNo()+", City:"+cust.getCustomerCity());
			System.out.println("Object Loaded Successfully");*/
		}catch(Exception e){
			e.getMessage();
			e.printStackTrace();
			System.out.println("Exception occur while doing manipulating the records");
		}finally{
			ses.close();
			sf.close();
		}
	}
}
