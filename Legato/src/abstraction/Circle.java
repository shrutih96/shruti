package abstraction;

public class Circle implements Shapes{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setLength(double length) {

	}
	
	public double area() {
		double area;
		area= 3.14*this.radius*this.radius;
		return area;
	}
}
