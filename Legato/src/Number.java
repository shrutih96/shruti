import java.util.*;
public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		check(num);
		add(num);
		type(num);
	}


	static void check(int n) {
	if(n==0) {
		System.out.print("Number is neutral.");
	}
	else if(n>0)
		System.out.print("Number is positive.");
	else
		System.out.print("Number is negative.");
	}
	
	
	static void add(int a) {
		int sum=0;
		for(int i=a;i>0;i--) {
			sum=sum+i;
			
		}
		System.out.print("Sum is:"+sum);
	}

	static void type(int t) {
		if(t%2==0)
			System.out.print("  Number is even.");
		else
			System.out.print("  Number is odd.");
	}
}
