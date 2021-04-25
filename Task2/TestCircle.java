package Task2;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		 System.out.println("Circle:"
		 + " Color=" + c1.getColor()
		 + " Filled=" + c1.isFilled()
		 + " "
		 + " Radius=" + c1.getRadius()
		 + " Area=" + c1.getArea()
		 + " Perimeter=" + c1.getPerimeter()
		 + "\n"
		 + c1.toString());
		 
		 Circle c2 = new Circle(10);
		 System.out.println("Circle:"
		 + " Color=" + c2.getColor()
		 + " Filled=" + c2.isFilled()
		 + " "
		 + " Radius=" + c2.getRadius()
		 + " Area=" + c2.getArea()
		 + " Perimeter=" + c2.getPerimeter()
		 + "\n"
		 + c2.toString());
		 
		 Circle c3 = new Circle(8, "red", false);
		 System.out.println("Circle:"
		 + " Color=" + c3.getColor()
		 + " Filled=" + c3.isFilled()
		 + " "
		 + " Radius=" + c3.getRadius()
		 + " Area=" + c3.getArea()
		 + " Perimeter=" + c3.getPerimeter()
		 + "\n"
		 + c3.toString());
	}
}
