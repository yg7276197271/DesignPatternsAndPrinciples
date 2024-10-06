package decorator_design_pattern;

public class Mushroom extends ToppingDecorator{

	BasePizza basePizza;//has-a relationship
	
	public Mushroom(BasePizza pizza) {
		this.basePizza = pizza;
	}

	@Override
	public int cost() {
		return basePizza.cost() + 15;
	}

}
