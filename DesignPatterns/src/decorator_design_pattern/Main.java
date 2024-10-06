package decorator_design_pattern;

public class Main {

	 public static void main(String[] args) {
		 //Margharitta + extra cheese
		BasePizza marghritaPizza = new Margherita();
		System.out.println("Cost of Margharitta + extra cheese " + new ExtraCheese(marghritaPizza).cost());
		
		
		System.out.println("Cost of Margharitta + extra cheese + mushroom " +
		new Mushroom(new ExtraCheese(marghritaPizza)).cost());
		
		//so here in decorator pattern we can have multiple permutation and combination of 
		//fields like different toppings.
		
		
	}
}
