package observer_design_pattern;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

	String userName;
	StocksObservable stockObservable; //has a relationship with Observable interface
	
	public MobileAlertObserverImpl(String userName, StocksObservable stockObservable) {
		super();
		this.userName = userName;
		this.stockObservable = stockObservable;
	}
	
	@Override
	public void update() {
		sendMessageOnMobile(userName, "product is in Stock . hurry up");
	}

	private void sendMessageOnMobile(String userName, String string) {

		System.out.println("message sent to "+userName);
	}

}
