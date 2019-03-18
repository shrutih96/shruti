
public class Calculator {
	int a,b;
	
	int addition(int a,int b) {
		this.a=a; this.b=b;
		int add=a+b;
		return add;
	}
	int subtraction(int a,int b) {
		this.a=a; this.b=b;
		int sub=a-b;
		return sub;		
	}
	int multiplication(int a,int b) {
		this.a=a; this.b=b;
		int mul=a*b;
		return mul;		
	}
	int division(int a,int b) {
		this.a=a; this.b=b;
		if(b==0) {
			System.out.println("Denominator cannot be 0");
			return 0;
		}
		else {
			return a/b;
		}	
	
				
	}
}
