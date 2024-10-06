package open_close_principle;
//Open Closed Principle means Software entities should be open for extension but closed
//for modification
//Following class implementation does not follow OCP
//Becoz if we need to add more shapes we need to change ShapeImplementation area() method
//by adding one more if block
public class ShapeImplementation {
	public double area(Object[] shapes){
		double area=0;
		for(Object shape : shapes){
			if(shape.equals(Rectangle)){
				Rectangle rectangle = (Rectangle) shape;
				area+=rectangle.getHeight()*rectangle.getWidth();
			}else{
				Circle circle =(Circle)shape;
				area+=circle.getRadius()*circle.getRadius()*Math.PI;
			}
		}
		return 0;
		
	}

}

class Rectangle{
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
	
}

class Circle{
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}


