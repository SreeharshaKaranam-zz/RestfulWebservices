package com.wordpress.sreeharshasite.webservices.services.dao;

import java.util.List;

import com.wordpress.sreeharshasite.webservices.services.entity.Employee;

public interface EmployeeDAO {
	
	 Employee addEmployee(Employee emp);
	 
	 void deleteEmployee(int empId);
	 
	 Employee updateEmployee(Employee emp);
	 
	 Employee findEmployee(int empId);
	 
	 List<Employee> getAllEmployees();
	 
	 
}
