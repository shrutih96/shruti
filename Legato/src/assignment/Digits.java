package assignment;
import java.util.*;
public class Digits {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		digit(num);
	}
	
	static void digit(int n) {
		int rem=0;
		int digi=0;
		while(n!=0) {
		rem=n%10;
		digi=digi+rem;
		n=n/10;
		}
		System.out.println("Sum of digits of number is:"+digi);
	}
}
