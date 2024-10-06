package creational_design_patterns.factory_pattern;

public class PushNotification implements Notification {

	 @Override
	    public void notifyUser()
	    {
	        System.out.println("Sending a push notification");
	    }

}
