package com.app.query;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CustomerQueryTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		/**
		 * Selecting all Records start
		 */
		Query query = ses.createQuery("from com.app.query.Customer c");
		List list = query.list();
		Iterator<Customer> iterator = list.iterator();
        while(iterator.hasNext()){
        	Object obj = iterator.next();
        	Customer c = (Customer) obj;
        	System.out.println("CustomerID:"+c.getCustomerId()+",Name:"+c.getCustomerName()+",MobileNo:"+c.getCustmerMobileNo()+",City:"+c.getCustomerCity());
        }
        
        /**
         * Selecting partial objects (more than one records)
         */
        System.out.println("Selecting partial objects start");
        Query qry = ses.createQuery("select c.customerName, c.custmerMobileNo from com.app.query.Customer c where c.customerId=?");
        qry.setParameter(0, 3);
        List list1 = qry.list();
        Iterator it = list1.iterator();
        while(it.hasNext()){
        	Object obj[] = (Object[]) it.next();
        	System.out.println("CustomerName:"+obj[0]+",MobileNo:"+obj[1]);
        }
        
        /**
         * Selecting partial objects (only one record)
         */
        
        System.out.println("Selecting partial objects only one");
        Query qry1 = ses.createQuery("from com.app.query.Customer c where c.customerName =:Mahindra ");
        qry1.setParameter("Mahindra", "Mahindra");
        List list2 = qry1.list();
        Iterator it2 = list2.iterator();
        while(it2.hasNext()){
        	Object obj = it2.next();
        	Customer c = (Customer) obj;
        	System.out.println("ID:"+c.getCustomerId()+",City:"+c.getCustomerCity());
        }
        ses.close();
        sf.close();
	}
}
