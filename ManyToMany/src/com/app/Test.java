package com.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test{
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg=cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
	tx.begin();
	Student s=new Student();
	s.setStudentId(103);
	s.setStudentName("MAHI");
	s.setMarks(86);
	
	Student s1=new Student();
	s1.setStudentId(104);
	s1.setStudentName("MANI");
	s1.setMarks(87);
	
	Courses c=new Courses();
	c.setCourseId(202);
	c.setCourseName("java");
	c.setDuration(90);
	
	Courses c1=new Courses();
	c1.setCourseId(20);
	c1.setCourseName("javascript");
	c1.setDuration(93);
	
	Set<String> set=new HashSet<String>();
	set.add("c");
	set.add("c1");
	
	s.setCourses(set);
	s1.setCourses(set);
	
	ses.save(s);
	ses.save(s1);
	
	tx.commit();
	System.out.println("Many to Many Bidirectional is done");
	ses.close();
	sf.close();
	
	
	
} 
}
