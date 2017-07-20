package com.wordpress.sreeharshasite.webservices.services.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wordpress.sreeharshasite.webservices.services.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final Map<Integer,Employee> employeeMap=new HashMap<Integer,Employee>();
	
	static
	{
		initEmps();
	}
	
	private static void initEmps()
	{
		Employee emp1=new Employee(100,"Abhi","Chennai","Associate");
		Employee emp2=new Employee(101,"Ravi","Delhi","SeniorAssociate");
		Employee emp3=new Employee(102,"Harsha","Bengaluru","Associate");
		employeeMap.put(emp1.getEmpId(), emp1);
		employeeMap.put(emp2.getEmpId(), emp2);
		employeeMap.put(emp3.getEmpId(), emp3);
	}

	public Employee addEmployee(Employee emp) {
		
		employeeMap.put(emp.getEmpId(), emp);
		
		return emp;
	}

	public void deleteEmployee(int empId) {
		
		employeeMap.remove(empId);
	
	}

	public Employee findEmployee(int empId)
	{
		
		Employee emp=employeeMap.get(empId);
		
		return emp;
	}
	public Employee updateEmployee(Employee emp) {
			
		employeeMap.put(emp.getEmpId(), emp);
		
		return emp;
		
	}

	@Override
	public List<Employee> getAllEmployees() {
	
		Collection<Employee> employees=employeeMap.values();
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.addAll(employees);
		return employeeList;
		
		
	}

}
