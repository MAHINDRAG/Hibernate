package com.app;

import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class FetchData {
	public static void main(String[] args) {
		Session ses=new Configuration().configure().buildSessionFactory().openSession();
		try{
			Answer ans=(Answer) ses.get(Answer.class, new Integer(501));
			System.out.println(ans.getId()+" "+ans.getAnswerName()+" "+ans.getPostedby());
			Question q=ans.getParentobjects();
			System.out.println(q.getId()+" "+q.getName());
			ses.close();
			System.out.println("Many to one Fecthing 1 Record is done");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
