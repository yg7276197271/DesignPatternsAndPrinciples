package facade_design_pattern;

public class EmployeeFacade {

	EmployeeDAO employeeDao;

	public EmployeeFacade() {
		this.employeeDao = employeeDao;
	}
	
	public void insert(){
		employeeDao.insert();
	}
	
	public Employee getEmployeeDtails(int empID){
		return employeeDao.getEmployeeDetails(empID);
		
	}
	
}
