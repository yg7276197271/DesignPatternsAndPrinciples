package observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

	public List<NotificationAlertObserver> observerList = new ArrayList<>();
	public int stockCount = 0;

	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {

		for (NotificationAlertObserver observer : observerList) {
			observer.update();
		}
	}

	@Override
	public void setStockCount(int newStockAdded) {
		//when new stock is added and earlier stockCount was zero then only notification will be sent.
		//If we already have stock and then new stock is added then no notification
		if (stockCount == 0) {
			notifyObservers();
		}
		stockCount=stockCount+newStockAdded;
	}

	@Override
	public int getStockCount() {
		// TODO Auto-generated method stub
		return stockCount;
	}

}
