package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg=cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
	tx.begin();
	Ticket tic=new Ticket();
	tic.setTicId(102);
	tic.setTicName("Mahi");
	tic.setTicSal(100.0);
	ses.save(tic);
	tx.commit();
	System.out.println("Records inserted successfully");
	
}
}
