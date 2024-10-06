package facade_design_pattern;

public class EmployeeClient {
	public void getEmployeeDtails(){
		EmployeeFacade facade = new EmployeeFacade();
		Employee emp = facade.getEmployeeDtails(123);
	}
}
