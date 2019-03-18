package assignment;
import java.util.*;
public class Reverse{
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		rev(num);
	}
	
	static void rev(int n) {
		int rem=0;
		int digi=0;
		while(n!=0) {
		rem=n%10;
		digi=(digi*10)+rem;
		n=n/10;
		}
		System.out.println("Reverse of the number is:"+digi);
	}
}
