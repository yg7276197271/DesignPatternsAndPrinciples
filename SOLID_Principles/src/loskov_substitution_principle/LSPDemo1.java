package loskov_substitution_principle;

//Subtypes must be substitutable for their base/super types
public class LSPDemo1 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		area(rectangle);
		
	}
	//In this method we cannot substitute Square in place  of Rectangle
	//So this is bad design as per LSP
	//User inheritance only when your super class is replaceable by subclass
	public static double area(Rectangle r){
		Rectangle rectangle = r;
		rectangle.setWidth(5);
		rectangle.setHeight(4);
		return rectangle.getHeight()*rectangle.getWidth();
	}
}
//Base class
class Rectangle{
	double height;
	double width;
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	
}
//Child class
class Square extends Rectangle{
	double height;
	double width;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) { //set both height & width to height
		this.height = height;
		this.width=height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {//set both height & width to width
		this.width = width;
		this.height = width;

	}
	
	
}