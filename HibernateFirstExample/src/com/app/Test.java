package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg=cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		tx.begin();
		try{
		Student std=new Student();
		std.setStdId(122);
		std.setStdName("Naresh");
		std.setStdFee(450);
		ses.save(std);
		tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		    ses.close();
		  
		}
			   
			}
	}


