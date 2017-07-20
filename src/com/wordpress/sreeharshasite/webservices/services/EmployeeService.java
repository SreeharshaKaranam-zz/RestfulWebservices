package com.wordpress.sreeharshasite.webservices.services;


import java.util.List;

import javax.ws.rs.core.Response;

import com.wordpress.sreeharshasite.webservices.services.entity.Employee;

public interface EmployeeService {
	
	
	List<Employee> getAllEmployees();
	
	Employee getEmployee(int empId);
	
	Response addEmployee(Employee emp);
	
	Response deleteEmployee(int empId);
	
	Response updateEmployee(Employee emp);

}
