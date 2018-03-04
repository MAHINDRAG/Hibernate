package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Session ses=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Query qry=ses.getNamedQuery("sample");
		qry.setParameter("eid", 102);
		List<?> list=qry.list();
		Iterator<?> i=list.iterator();
		while(i.hasNext()){
			Employee emp=(Employee) i.next();
			System.out.println(emp.getEmpId());
			System.out.println("Employee :"+emp.getEmpId()+","+emp.getEmpName()+","+emp.getEmpSal());
		}
		ses.close();
		
	}

}
