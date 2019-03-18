package assignment;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of elements required in series:");
		int count=sc.nextInt();
		System.out.println("The fibonacci series is:");
		fibo(count);
	}
	
	static void fibo(int n) {
		int n1=0; 
		int n2=1;
		int n3=0;
		System.out.print(n1+","+n2);
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(","+n3);
		}
	}

}
