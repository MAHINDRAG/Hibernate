package com.app.dao;

import java.io.Serializable;

import com.app.model.Employee;

public interface IEmployeeDao{
   public Serializable insertEmployeeRecord(Employee emp);
   public boolean isEmployeeExist(int empid);
}
