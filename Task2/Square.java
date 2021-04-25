package Task2;

public class Square extends Rectangle {
	
public Square() {
	super();
}
public Square(double side) {
	super(side, side); // Call superclass Rectangle(double, double)
}
public Square(double side, String c, boolean f) {
	super(side, side, c, f);
}

public void setSide(double side) {
	super.setLength(side);
	super.setWidth(side);
}
public void setLength(double side) {
	setSide(side);
}
public void setWidth(double side) {
	setSide(side);
}
public double getSide() {
	return super.getLength();
}
@Override
public String toString() {
	return "A Square with side="+ getSide() + ", which is a subclass of" + super.toString();
}
}