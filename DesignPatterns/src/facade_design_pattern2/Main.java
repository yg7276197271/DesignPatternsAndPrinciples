package facade_design_pattern2;

public class Main {
public static void main(String[] args) {
	//Client does not know the complex logic of Order Creation
	//And if there is any change in order logic client will not break 
	//as we are calling facade to create Order.
	OrderFacade facade = new OrderFacade();
	facade.createOrder();
}
}
