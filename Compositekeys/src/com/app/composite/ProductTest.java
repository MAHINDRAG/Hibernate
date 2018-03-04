package com.app.composite;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Product p = new Product();
		try{
			tx.begin();
			p.setProductId(1000);
			p.setProName("Colgate");
			Object obj = ses.get(Product.class, p);
			Product p1 = (Product) obj;
			System.out.println("The price is:"+p1.getPrice());
		}catch(Exception e){
			e.getMessage();
			e.printStackTrace();
			System.out.println("Error occured while updating values");
		}finally{
			ses.close();
			sf.close();
		}
		
	}
}
