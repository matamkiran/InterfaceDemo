package service;

import java.math.BigInteger;

import bean.Employee;

public class EmployeeServiceImpl extends EmployeeAbstractServiceImpl implements IEmployee{

	Employee e1=new Employee();

	
	
	@Override
	public Employee addEmployeeService() {
		
		
		e1.setId(1);
		e1.setFirstName("John");
		e1.setLastName("Apparao");
		e1.setMobileNumber(new BigInteger("8090909090"));
		e1.setEmail("jhon.apparao@gmail.com");
		
		return e1;
	}

	@Override
	public Employee fetchEmployeeService() {
		return e1;
	}

	@Override
	public Employee addEmployeeService(String firstname, String secondName, String email) {
		
		if(firstname!=null && email!=null) {
			
			e1.setId(1);
			e1.setFirstName(firstname);
			e1.setLastName(secondName);
			e1.setEmail(email);
		}
		return e1;
	}

	@Override
	void displayAllEmployee() {
		// TODO Auto-generated method stub
		
	}

}
