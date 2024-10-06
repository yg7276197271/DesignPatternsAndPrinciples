package observer_design_pattern;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

	String emailId;
	StocksObservable stockObservable; //has a relationship with Observable interface
	
	public EmailAlertObserverImpl(String emailId, StocksObservable stockObservable) {
		super();
		this.emailId = emailId;
		this.stockObservable = stockObservable;
	}
	
	@Override
	public void update() {
		sendMail(emailId, "product is in Stock . hurry up");
	}

	

	private void sendMail(String emailId2, String string) {

		System.out.println("mail sent to "+emailId);
	}

}
