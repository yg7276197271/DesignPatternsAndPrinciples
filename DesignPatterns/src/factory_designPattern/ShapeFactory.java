package factory_designPattern;

public class ShapeFactory {
	//Depending on the input your provide to getShape() method it will create corresponding class object
	Shape getShape(String name) {
		switch (name) {
		case "Rectangle":
			return new Rectangle();
		case "Circle":
			return new Circle();
		default:
			throw new IllegalArgumentException("Unknown channel " + name);
		}
	}
}
