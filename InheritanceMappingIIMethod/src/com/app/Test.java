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
  
  Employee emp=new Employee();
  emp.setEmpId(1000);
  emp.setEmpName("Niharika");
  emp.setEmpsal(6250.2);
  
  Developer dev=new Developer();
  emp.setEmpId(1001);
  emp.setEmpName("Lohitha");
  emp.setEmpsal(6500.0);
  dev.setTechId(200);
  dev.setTechName("Java");
  dev.setExp(9);
  
  Manager mgr=new Manager();
  mgr.setEmpId(1002);
  mgr.setEmpName("Aruna");
  mgr.setEmpsal(12500.3);
  mgr.setProjId(300);
  mgr.setProjName("ABCDE");
  
  ses.save(emp);
  ses.save(dev);
  ses.save(mgr);
  
  tx.commit();
  ses.close();
}
}
