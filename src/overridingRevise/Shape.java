package overridingRevise;

public class Shape {
	
	public void area() {
		System.out.println("My shape is a circle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape myCircle = new Shape();
		Triangle myTriangle = new Triangle();
		Rectangle myRectangle = new Rectangle();
		myCircle.area();
		myTriangle.area();
		myRectangle.area();
	}
    }
class Triangle extends Shape{
	public void area() {
		System.out.println("My shape is a Triangle");
	}
    }
class Rectangle extends Shape{
	public void area() {
		System.out.println("My shape is a Rectangle");
	}

	
	
}
