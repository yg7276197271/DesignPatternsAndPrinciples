package proxy_design_pattern;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		System.out.println("Created New Row in Employee Table");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		System.out.println("Deleted  Row with employee Id " + employeeId);

	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		System.out.println("Fetching Data from DB");
		return new EmployeeDo();
	}

}
