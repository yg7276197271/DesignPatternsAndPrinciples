package observer_design_pattern;

public class Store {

	public static void main(String[] args) {

		StocksObservable iphoneStockObservable = new IphoneObservableImpl();
		
		NotificationAlertObserver observer1 = new MobileAlertObserverImpl("Yogesh", iphoneStockObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("yg@123", iphoneStockObservable);
		NotificationAlertObserver observer3 = new EmailAlertObserverImpl("indraani@123", iphoneStockObservable);

		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);
		
		iphoneStockObservable.setStockCount(10);
		iphoneStockObservable.setStockCount(100);//Notification will be sent only when stock was empty and then some items are added

	}

}
