package com.app.query;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertQuery {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		try{
			Query qry = ses.createQuery("insert into com.app.query.Manager (mgrID,mgrName,mgrCity) select c.customerId, c.customerName,c.customerCity from com.app.query.Customer c where c.customerId =? ");
			qry.setParameter(0, 1);
			int res = qry.executeUpdate();
			System.out.println("Command successfully executed....");
			System.out.println("Number of records effected...,"+res);
		}catch(Exception e){
			e.getMessage();
			e.printStackTrace();
			System.out.println("Error Occured while inserting the Data");
		}finally{
			ses.close();
			sf.close();
		}
	}
}
