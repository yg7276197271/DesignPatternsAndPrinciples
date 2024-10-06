package creational_design_patterns.factory_pattern;


public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending EMAIL Notification");		
	}

}
