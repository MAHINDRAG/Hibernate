package com.app.pojo;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HibernateTest {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(HibernateTest.class);
		Configuration cfg=new Configuration();
		cfg=cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		try{
			tx.begin();
			Product p=new Product();
			p.setProdId(5005);
			p.setProdName("Simcard");
			p.setProdcost(1500);
			ses.save(p);
			tx.commit();
			logger.info("Record inserted successfully :");
		}catch(Exception e){
			e.printStackTrace();
			ses.close();
		}
	}
}
