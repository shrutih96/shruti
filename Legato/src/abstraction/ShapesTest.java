package abstraction;
import java.util.*;
public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the radius of circle:");
		double rad=sc.nextDouble();
		System.out.println("Enter the length of square:");
		double length=sc.nextDouble();
		
		Shapes c=new Circle();
			c.setRadius(rad);
			System.out.println("Area of circle is:"+c.area());
			
		Shapes s=new Square();
			s.setLength(length);
			System.out.println("Area of circle is:"+s.area());

	}
	
	

}
