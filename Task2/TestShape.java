package Task2;

public class TestShape {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		 System.out.println("Shape:"
		 + " Color=" + s1.getColor()
		 + " Filled=" + s1.isFilled()
		 + " "
		 + s1.toString());
		 
		 Shape s2 = new Shape("blue", false);
		 System.out.println("Shape:"
		 + " Color=" + s2.getColor()
		 + " Filled=" + s2.isFilled()
		 + " "
		 + s2.toString());
	}

}
