package com.app.query;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteQueryTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		/**
		 * update query example
		 */
		Query qry = ses.createQuery("delete from com.app.query.Customer c where c.customerId=?");
		qry.setParameter(0, 2);
		int res = qry.executeUpdate();
		System.out.println("Command successfully executed....");
        System.out.println("Numer of records effected due to delete query"+res);
        
        /**
         * Delete Query example
         */
        
        Query qry2 = ses.createQuery("update from com.app.query.Customer c set c.customerName=? where c.customerId=2");
        qry2.setParameter(0, "Girish");
        int result =  qry2.executeUpdate();
        System.out.println("Command successfully executed....");
        System.out.println("Numer of records effected due to update query"+result);

        ses.close();
        sf.close();
				
	}
}
