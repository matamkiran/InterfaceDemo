import service.ABCCompanyEmployeeService;
import service.EmployeeServiceImpl;
import service.IEmployee;
import service.XYZCompanyEmployeeService;

public class InterfaceDemo {
	
	private static IEmployee employeeService;

	
	public static void main(String[] args) {
		
		/*
		 * EmployeeServiceImpl es= new EmployeeServiceImpl();
		 * 
		 * List<Employee> emplist=new ArrayList<>();
		 * 
		 * es.addEmployeeService();
		 * System.out.println(es.fetchEmployeeService().getFirstName());
		 * System.out.println(es.fetchEmployeeService().getLastName());whoami
		 * 
		 * 
		 * es.addEmployeeService("Jhon","cena","youcantsee@gmail.com");
		 * emplist.add(es.addEmployeeService("Jhon","cena","youcantsee@gmail.com"));
		 */
		
		employeeService= new EmployeeServiceImpl();
		employeeService= new ABCCompanyEmployeeService();
		
		((ABCCompanyEmployeeService) employeeService).whoami();
		
		employeeService= new XYZCompanyEmployeeService();
		
		

	}

}
