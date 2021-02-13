package service;

import bean.Employee;

public interface IEmployee {
	
	
	
	Employee addEmployeeService();
	Employee fetchEmployeeService();
	Employee addEmployeeService(String firstname,String secondName,String email);
	
	/*
	 * void deleteEmployeeService();  boolean
	 * updateEmployee(); List<Employee> fetchAllEmployee();
	 */

}
