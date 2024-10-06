package factory_designPattern;

public class Main {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		factory.getShape("Circle").draw();
	}
}
