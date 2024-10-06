package creational_design_patterns.factory_pattern;

public class NotificationService {
	//Read the stuff from geeks from geeks
	//https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/
	 public static void main(String[] args)
	    {
	        NotificationFactory notificationFactory = new NotificationFactory();
	        Notification notification = notificationFactory.createNotification("SMS");
	        notification.notifyUser();
	    }
}
