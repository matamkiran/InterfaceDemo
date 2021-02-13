package service;

import java.math.BigInteger;

import bean.Employee;

public class ABCCompanyEmployeeService implements IEmployee {

	Employee e1=new Employee();

	
	
	public void whoami() {
		System.out.println("Am ABC Company employee will get joining bonus of 1lacs");
	}
	
	@Override
	public Employee addEmployeeService() {
		
		
		e1.setId(1);
		e1.setFirstName("ABC ");
		e1.setLastName("reddy");
		e1.setMobileNumber(new BigInteger("8090909090"));
		e1.setEmail("abc.reddy@gmail.com");
		
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

}
