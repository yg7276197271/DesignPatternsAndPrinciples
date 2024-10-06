package observer_design_pattern;

public interface StocksObservable {

	public void add(NotificationAlertObserver observer);
	
	public void remove(NotificationAlertObserver observer);
	
	public void notifyObservers();
	
	public void setStockCount(int newStockAdded);
	
	public int getStockCount();
	
	
}
