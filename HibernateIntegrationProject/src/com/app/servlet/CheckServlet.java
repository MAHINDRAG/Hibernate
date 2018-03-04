package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.IEmployeeDao;
import com.app.dao.impl.EmployeeHibernateImpl;


@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
	 String eid=request.getParameter("eid");
	 if(eid==(null)||"".equals(eid.trim())){
		response.getWriter().write("id is required");
	 }else{
		 int empId=Integer.parseInt(eid);
		 IEmployeeDao dao=new EmployeeHibernateImpl();
		 boolean stat=dao.isEmployeeExist(empId);
		 if(stat)
			 response.getWriter().write("Id"+empId+"already exist");
		 }
		}catch(Exception e){
			e.printStackTrace();
		}
		
	 
	}
	
}
