package service;

import java.math.BigInteger;

import bean.Employee;

public class XYZCompanyEmployeeService implements IEmployee {
	
	
	Employee e1=new Employee();
	
	
	public void iamEmployee() {
		System.out.println("Am ABC Company employee will get joining bonus of 10lacs");
	}
	
	@Override
	public Employee addEmployeeService() {
		
		
		e1.setId(1);
		e1.setFirstName("Dave");
		e1.setLastName("Smith");
		e1.setMobileNumber(new BigInteger("8009090900"));
		e1.setEmail("davesmith007@gmail.com");
		
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
