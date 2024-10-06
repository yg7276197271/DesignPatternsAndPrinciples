package creational_design_patterns.factory_pattern;

public class SMSNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Sending SMS Notification");		
		
	}

}
