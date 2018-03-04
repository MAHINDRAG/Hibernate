package com.app.dao.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.app.util.HibernateUtil;
import com.app.dao.IEmployeeDao;
import com.app.model.Employee;

public class EmployeeHibernateImpl implements IEmployeeDao {
	Session ses=null;
	@Override
	public Serializable insertEmployeeRecord(Employee emp) {
		
		Serializable id=null;
		try{
			ses=HibernateUtil.getFactory().openSession();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
		return null;
		
			
	}

	@Override
	public boolean isEmployeeExist(int empid) {
		boolean isExist=false;
		try{
			ses=HibernateUtil.getFactory().openSession();
			Object ob=ses.createCriteria(Employee.class).add(Restrictions.eq("empId", empid)).uniqueResult();
			if(ob!=null)
				isExist=true;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(ses!=null)
				ses.close();
		}
		return isExist;
	}

}
