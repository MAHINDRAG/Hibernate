package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeletingSingleParent {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		tx.begin();
		try{
			/*Question q=(Question) ses.get(Question.class, new Integer(1));
			ses.delete(q);*/
			Query query=ses.createQuery("from Question");
			List<Question> list=query.list();
			
			Iterator<Question> it=list.iterator();
			while(it.hasNext()){
				Question q=it.next();
				ses.delete(q);
				tx.commit();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

