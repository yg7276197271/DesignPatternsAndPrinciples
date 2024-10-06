package proxy_design_pattern;

public class Main {
	public static void main(String[] args) {
			try{
				EmployeeDao empTableOnj = new EmployeeDaoProxy();
				empTableOnj.create("USER", new EmployeeDo());
				//empTableOnj.create("ADMIN", new EmployeeDo());
				System.out.println("Created successfully");
			}catch(Exception e){
				e.printStackTrace();
			}
	}
}
