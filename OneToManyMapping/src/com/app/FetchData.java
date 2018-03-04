package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		
		Session ses=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Query query=ses.createQuery("from Question");
		List<Question> list=query.list();
		
		Iterator<Question> it=list.iterator();
		while(it.hasNext()){
			Question q=it.next();
			System.out.println("Question Name :"+q.getName());
			
			List<Answer> list1=q.getAnswers();
			Iterator<Answer> it1=list1.iterator();
			while(it1.hasNext()){
				System.out.println(it1.next());
			}
		}
		ses.close();
		System.out.println("Success");
		
		
	}
}
