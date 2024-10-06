package Interface_Segregarion_principle;

public class ISP_demo {

	//Below is bad design
	//As  we have added groom method in Animal abstarct class we have to add it in both child classes
	//But in tiger class its not useful
	
}
abstract class Animal{
	abstract void feed();
	abstract void groom();
}

class Dog extends Animal{

	@Override
	void feed() {
		System.out.println("Feeding Dog");		
	}

	@Override
	void groom() {
		System.out.println("Grooming Dog");		
		
	}
	
}

class Tiger extends Animal{

	@Override
	void feed() {
		System.out.println("Feeding Tiger");		
		
	}
	@Override
	void groom() {
		System.out.println("Dummy method to keep compiler happy");		
		
	}
}