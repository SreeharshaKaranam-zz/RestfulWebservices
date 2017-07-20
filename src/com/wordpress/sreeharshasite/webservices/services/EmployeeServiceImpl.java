package com.wordpress.sreeharshasite.webservices.services;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.wordpress.sreeharshasite.webservices.services.dao.EmployeeDAOImpl;
import com.wordpress.sreeharshasite.webservices.services.entity.Employee;

@Path ("/employees")
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAOImpl employeedao=new EmployeeDAOImpl();

	@GET
	@Produces ({MediaType.APPLICATION_XML})
	@Path ("/{empId}")
	public Employee getEmployee(@PathParam ("empId") int empId) {
		return employeedao.findEmployee(empId);
	}

	@POST
	@Produces ({MediaType.APPLICATION_XML})
	public Response addEmployee(Employee emp) {
		
		employeedao.addEmployee(emp);
	  return Response.status(200).build();

	}
	
	
	
	@DELETE
	@Path ("/{empId}")
	@Produces ({MediaType.APPLICATION_XML})
	public Response deleteEmployee(@PathParam ("empId") int empId) {
		employeedao.deleteEmployee(empId);
		return Response.status(200).build();

	}
	@PUT
	@Produces ({MediaType.APPLICATION_XML})
	public Response updateEmployee(Employee emp) {
		
		employeedao.updateEmployee(emp);
		return Response.status(200).build();
	}

	@Override
	@GET
	@Produces ({MediaType.APPLICATION_XML})
	public List<Employee> getAllEmployees() {
		
		return employeedao.getAllEmployees();
	}

}

