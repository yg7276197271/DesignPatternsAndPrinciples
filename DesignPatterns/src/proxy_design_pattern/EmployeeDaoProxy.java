package proxy_design_pattern;

public class EmployeeDaoProxy implements EmployeeDao {
	
	EmployeeDao employeeDaoObj; //has-a relationship

	public EmployeeDaoProxy() {
		employeeDaoObj = new EmployeeDaoImpl();
	}

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		if (client.equals("ADMIN")) {
			employeeDaoObj.create(client, obj);
			return;
		}
		throw new Exception("Access denied");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {

		if (client.equals("ADMIN")) {
			employeeDaoObj.delete(client, employeeId);
			return;
		}
		throw new Exception("Access denied");

	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		if (client.equals("ADMIN") || client.equals("USER")) {
			employeeDaoObj.get(client, employeeId);
		}
		throw new Exception("Access denied");
	}

}
