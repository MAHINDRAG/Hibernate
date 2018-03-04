package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {
	public static void main(String[] args) {
		Session ses=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=ses.beginTransaction();
		tx.begin();
		try{
			Query query=ses.createQuery("select Qname,aname,pname from QTable LEFTJOIN  AnswerTable ON QTable.Qid=AnswerTable.Qid");
			List list=query.list();
			Iterator it=list.iterator();
			while(it.hasNext()){
				Object ob[]=(Object[]) it.next();
				//Answer ans=(Answer) ob;
				System.out.println(ob[0]+""+ob[1]);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
