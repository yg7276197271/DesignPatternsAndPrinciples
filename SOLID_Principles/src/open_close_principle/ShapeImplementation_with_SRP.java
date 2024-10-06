package open_close_principle;
//Open Closed Principle means Software entities should be open for extension but closed
//for modification
//Following class implementation  follows OCP
//Becoz if we need to add more shapes we dont need to change ShapeImplementation area() method
//area() method in ShapeImplementation_with_SRP class is closed for modification
//but open for extension
//We can just add one more class that extends Area abstract class 
//And provide own implementation for area() method

public class ShapeImplementation_with_SRP {
	public double area(Shape1[] shapes){
		double area=0;
		for(Shape1 shape : shapes){
			area+=shape.area();
		}
		return area;
	}

}

class Rectangle1 extends Shape1{
	int width;
	int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double area() {
		return 	width*height;
	}
	
}

class Circle1 extends Shape1{
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius*radius*Math.PI;
	}
	

}

abstract class Shape1{
	public abstract double area();
	
	
}


