package com.app.one.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One_OneInsertQuery {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("com/app/one/one/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Student s=new Student();
		s.setStudentId(100);
		s.setStudentName("java4s");

		Address ad = new Address();
		ad.setAddressId(509);
		ad.setCity("Carry");
		ad.setState("NC");
		ad.setS(s); 
		
		ses.save(ad);
		tx.commit();
		ses.close();
		System.out.println("One To One is Done");
		sf.close();
	}
}
