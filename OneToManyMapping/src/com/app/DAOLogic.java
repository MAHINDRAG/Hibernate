package com.app;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAOLogic {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg=cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
	tx.begin();
	try{
		Answer ans1=new Answer();
		ans1.setAnswerName("java is a programming language");
		ans1.setPostedby("Mahindra");
		
		Answer ans2=new Answer();
		ans2.setAnswerName("java is platform independent");
		ans2.setPostedby("Adithya");
		
		Answer ans3=new Answer();
		ans3.setAnswerName("java is platform independent");
		ans3.setPostedby("Adithya");
		
		
		Answer ans4=new Answer();
		ans4.setAnswerName("java is platform independent");
		ans4.setPostedby("Adithya");
		
		ArrayList<Answer> list1=new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		
		ArrayList<Answer> list2=new ArrayList<Answer>();
		list2.add(ans3);
		list2.add(ans4);
		
		Question ques=new Question();
		ques.setName("What is java ?");
		ques.setAnswers(list1);
		
		Question ques2=new Question();
		ques2.setName("What is java features ?");
		ques2.setAnswers(list2);
		
		ses.save(ques);
		ses.save(ques2);
		
		tx.commit();
		ses.close();
		System.out.println("one TO Many Mapping Success");
		
	}catch(Exception e){
	e.printStackTrace();	
	}
}
}
