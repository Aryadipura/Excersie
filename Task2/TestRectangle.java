package Task2;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		 System.out.println("Rectangle:"
		 + " Color=" + r1.getColor()
		 + " Filled=" + r1.isFilled()
		 + " "
		 + " Width=" + r1.getWidth()
		 + " Length" + r1.getLength()
		 + " Area=" + r1.getArea()
		 + " Perimeter=" + r1.getPerimeter()
		 + "\n"
		 + r1.toString());
		 
		 Rectangle r2 = new Rectangle(10, 5);
		 System.out.println("Rectangle:"
		 + " Color=" + r2.getColor()
		 + " Filled=" + r2.isFilled()
		 + " "
		 + " Width=" + r2.getWidth()
		 + " Length" + r2.getLength()
		 + " Area=" + r2.getArea()
		 + " Perimeter=" + r2.getPerimeter()
		 + "\n"
		 + r2.toString());

		 Rectangle r3 = new Rectangle(6, 4, "black", false);
		 System.out.println("Rectangle:"
		 + " Color=" + r3.getColor()
		 + " Filled=" + r3.isFilled()
		 + " "
		 + " Width=" + r3.getWidth()
		 + " Length" + r3.getLength()
		 + " Area=" + r3.getArea()
		 + " Perimeter=" + r3.getPerimeter()
		 + "\n"
		 + r3.toString());
	}

}
