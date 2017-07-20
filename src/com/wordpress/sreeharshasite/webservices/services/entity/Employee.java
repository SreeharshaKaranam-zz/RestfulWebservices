package com.wordpress.sreeharshasite.webservices.services.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="employee")
@XmlAccessorType (XmlAccessType.FIELD)
public class Employee {
	
	private int empId;
	private String empName;
	private String city;
	private String designation;
	
	public Employee()
	{
		
	}
	public Employee(int empId,String empName,String city,String designation)
	{
		this.empId=empId;
		this.empName=empName;
		this.city=city;
		this.designation=designation;		
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
