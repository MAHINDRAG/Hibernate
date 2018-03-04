package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {
	public static void main(String[] args) {
		Session ses=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	    Transaction tx=ses.beginTransaction();
	    tx.begin();
	    try{
	    	
	        
	    	Address addr=new Address();
	    	addr.setAddrId(113);
	    	addr.setHno("1-236");
	    	addr.setStreet("Gandhi");
	    	
	    	Student s=new Student();
	    	s.setId(105);
	    	s.setStudentName("Mahindra");
	    	s.setFee(500.0);
	    	s.setAddress(addr);
	    	
	    	
	    	
	    	ses.save(s);
	    	tx.commit();
	    	ses.close();
	    	System.out.println("One -to-one is done");
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	}

}
