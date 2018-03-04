package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg=cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		tx.begin();
		try{
			Employee emp=new Employee();
			emp.setEmpName("Radhika");
			emp.setEmpSal(7000);
			
			Developer dev=new Developer();
			dev.setEmpName("Harini");
			dev.setEmpSal(8000);
			dev.setTechId(300);
			dev.setTechName("java");
			dev.setExp(6);
			
			Manager mgr=new Manager();
			mgr.setEmpName("Narahari");
			mgr.setEmpSal(6000);
			mgr.setProjId(200);
			mgr.setProjName("Me-sava");
			
			ses.save(emp);
			ses.save(dev);
			ses.save(mgr);
			
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			if(ses!=null)
				ses.close();
			if(sf!=null)
				sf.close();
		}
		
		System.out.println("Object saved successfully");
	}

}
