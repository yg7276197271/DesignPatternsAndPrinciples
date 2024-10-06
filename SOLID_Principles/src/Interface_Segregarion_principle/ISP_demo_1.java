package Interface_Segregarion_principle;

public class ISP_demo_1 {

	//Below design is as per ISP 
	// We have added Pet class which extends Animal and pet has grrom method
	// Dog class can now extend Pet
	//Tiger can extend animal which has only feed method
	
	//ISP : Dependency of one class to another one should depend on the smallest possible interface
	//Clients should not be forced to implement interfaces they don't use
	//Instead of one fat interface many small interfaces are preferred based on group of methods,
	//each one serving one submodule
	
	
}
abstract class Animal1{
	abstract void feed();
}
abstract class Pet extends Animal1{
	abstract void groom();

	
}
class Dog1 extends Pet{

	@Override
	void feed() {
		System.out.println("Feeding Dog");		
	}

	@Override
	void groom() {
		System.out.println("Grooming Dog");		
		
	}
	
}

class Tiger1 extends Animal1{

	@Override
	void feed() {
		System.out.println("Feeding Tiger");		
		
	}
	
}