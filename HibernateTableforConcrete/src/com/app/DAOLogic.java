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
		tx.begin();
		try{
			/*Employee emp=new Employee();
			emp.setEmpId(100);
			emp.setEmpName("Mahindra");
			emp.setEmpSal(6000);
			*/
			Developer dev=new Developer();
			//dev.setEmpId(103);
			dev.setEmpName("Niharika");
			dev.setEmpSal(6000);
			dev.setTechId(202);
			dev.setTechName("java");
			dev.setExp(6);
			
			Manager mgr=new Manager();
			//dev.setEmpId(104);
			mgr.setEmpName("Adithya");
			mgr.setEmpSal(6000);
			mgr.setProjId(303);
			mgr.setProjName("Elastic");
			
			//ses.save(emp);
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
