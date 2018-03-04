package com.app;

import java.util.HashSet;
import java.util.Set;

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
	
	Catageories cg=new Catageories();
	cg.setId(100);
	cg.setCatageoryName("Bajji");
	
	Catageories cg1=new Catageories();
	cg1.setId(101);
	cg1.setCatageoryName("Vada");
	
	
	Item i1=new Item();
	i1.setItemId(200);
	i1.setItemName("Idly");
	
	Item i2=new Item();
	i2.setItemId(200);
	i2.setItemName("Idly");
	
	
	Set<Item> s=new HashSet<Item>();
	s.add(i1);
	s.add(i2);
	
	cg.setItems(s);
	cg1.setItems(s);
	
	ses.save(cg);
	ses.save(cg1);
	
	tx.commit();
	
	System.out.println("Many to Many using Annotations can be done");
	ses.close();
}
}
