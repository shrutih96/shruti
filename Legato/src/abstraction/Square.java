package abstraction;

public class Square implements Shapes{
	private double length;

	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}

	
	public void setRadius(double radius) {

	}

	public double area() {
		double area;
		area= this.length*this.length;
		return area;
	}
}
