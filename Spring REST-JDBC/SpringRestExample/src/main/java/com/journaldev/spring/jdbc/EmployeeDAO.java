package com.journaldev.spring.jdbc;

import com.journaldev.spring.model.Employee;

public interface EmployeeDAO {
	
	//Read
		public Employee getById(int id);

}
