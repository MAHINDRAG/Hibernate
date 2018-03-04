package hibernatemaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.Product;

public class Test {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("src/main/resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		tx.begin();
		
		Product prod=new Product();
		prod.setProdcost(45);
		prod.setProductName("Biryani");
		prod.setProdcost(160.0);
		ses.save(prod);
		tx.commit();
		System.out.println("done");
		ses.close();
	}

}
