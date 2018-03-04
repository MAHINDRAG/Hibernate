package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DAOLogic {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg=cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		try{
			tx.begin();
			Employee emp=new Employee();
			emp.setEmpId(106);
			emp.setEmpName("Mahindra");
			emp.setEmpSal(6000);
			
			Developer dev=new Developer();
			dev.setEmpId(107);
			dev.setEmpName("Arjun");
			dev.setEmpSal(4000);
			dev.setTechId(202);
			dev.setTechName("java");
			dev.setExp(6);
			
			Manager mgr=new Manager();
			mgr.setEmpId(108);
			mgr.setEmpName("Mahesh");
			mgr.setEmpSal(5000);
			mgr.setProjId(302);
			mgr.setProjName("Elastic");
			
			ses.save(emp);
			ses.save(dev);
			ses.save(mgr);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			ses.close();
			sf.close();
		}
		System.out.println("Object saved sucessfully");
	}

}
