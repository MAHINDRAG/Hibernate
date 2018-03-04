package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class DaoLogic {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Criteria crit=ses.createCriteria(Product.class);
		try{
			crit.setProjection(Projections.property("prodName"));
			List list=crit.list();
			Iterator it=list.iterator();
			while(it.hasNext()){
				java.lang.String s= (String) it.next();
				System.out.println("Name :"+s);
			}	
			
			//crit.setProjection(Projections.sum("price"));
			crit.setProjection(Projections.avg("price"));
			List list1=crit.list();
			System.out.println(list1);
			Iterator it1=list1.iterator();
			while(it1.hasNext()){
				Double d=(Double) it1.next();
				System.out.println("Price :"+d);
			}
			
			
			/*
			ProjectionList p1=Projections.projectionList();
			p1.add(Projections.property("prodName"));
			p1.add(Projections.property("price"));
			crit.setProjection(p1);
			List l1=crit.list();
			Iterator it2=l1.iterator();
			while(it2.hasNext()){
				Object obj[]=(Object[]) it2.next();
				System.out.println(obj[0]+"  \n  "+obj[1]);
				
			}*/
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
