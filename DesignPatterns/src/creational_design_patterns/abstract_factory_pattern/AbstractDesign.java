package creational_design_patterns.abstract_factory_pattern;

public class AbstractDesign {
	
	//https://www.geeksforgeeks.org/abstract-factory-pattern/
	 public static void main(String[] args)
	    {
	        System.out.println(CarFactory.buildCar(CarType.MICRO));
	        System.out.println(CarFactory.buildCar(CarType.MINI));
	        System.out.println(CarFactory.buildCar(CarType.LUXURY));
	    }
}
