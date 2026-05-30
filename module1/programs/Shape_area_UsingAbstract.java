package module1.programs;

abstract class shape{
	String shapename;
	shape(String name){
		this.shapename=name;
	}
	abstract double calculateArea();
	void display() {
		System.out.println("Shape: "+ shapename+"|Area:" + calculateArea());
	}
}
class Circle extends shape{
	double radius;
	Circle(double radius){
		super("Circle");
		this.radius=radius;	
	}
	double calculateArea() {
		return Math.PI*Math.pow(radius, 2);
	}
}
class Rectangle extends shape{
	double length, width;
	Rectangle(double length, double width){
		super("Rectangle");
		this.length=length;
		this.width=width;
	}
	@Override
	double calculateArea() {
		return length*width;
	}
}
public class Shape_area_UsingAbstract {
	public static void main(String[] args) {
    shape myCircle=new Circle(5.0);
    shape myRectangle=new Rectangle(10.0,4.0);
    myCircle.display();
    myRectangle.display();
	}
}
