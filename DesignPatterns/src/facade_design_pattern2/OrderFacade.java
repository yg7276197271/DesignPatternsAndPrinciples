package facade_design_pattern2;

public class OrderFacade {
	ProductDAO productdao;
	Invoice invoice;
	Payment payment;
	Notification notification;
	public OrderFacade() {
		productdao = new ProductDAO();
		invoice = new Invoice();
		payment = new Payment();
		notification = new Notification();
	}
	
	public void createOrder(){
		Product Product = productdao.getProduct(121);
		payment.makePayment();
		invoice.generateInvoice();
		notification.sendNotification();
	}
	
}
