package assignment;
import java.util.*;
public class Factorial {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num= sc.nextInt();
		facto(num);
	}
	
	static void facto(int n) {
		int fact=n;
		if (n==0)
			System.out.println("Factorial of"+n+"is 0.");
		else if(n==1)
			System.out.println("Factorial of"+n+"is 1.");
		else
		{	
			while(n>1) {
			fact=fact*(--n);
			}
			System.out.println("Factorial of number is:"+fact);	
		}
	}
}