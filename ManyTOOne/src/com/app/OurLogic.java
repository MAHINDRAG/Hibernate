package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {
	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg=cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
	
	try{
		Question q=new Question();
		q.setId(100);
		q.setName("What is java");
		
		Answer ans=new Answer();
		ans.setId(500);
		ans.setAnswerName("it is platform independent");
		ans.setPostedby("Mahindra");
		ans.setParentobjects(q);
		
		Answer ans1=new Answer();
		ans.setId(501);
		ans1.setAnswerName("it is platform independent");
		ans1.setPostedby("Mahindra");
		ans1.setParentobjects(q);
		tx.begin();
		ses.save(ans);
		ses.save(ans1);
		tx.commit();
		ses.close();
		sf.close();
		System.out.println("Many to one is done");
		}catch(Exception e){
		e.printStackTrace();
	}

}
}