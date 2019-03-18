package assignment;

public class OddEven {
	public static void main(String []args) {
		int num=0;
		even(num);
		odd(num);
	}
	
	static void even(int num) {
		int count=0; 
		System.out.println("Even numbers are:");
		while(count<10) {
			if(num%2==0) {
				count++;
				System.out.print(num+" ");
			}
			num=num+1;
		}
		
	}
		
	static void odd(int num) {
		int count=0;
		System.out.println();
		System.out.println("Odd numbers are:");
		while(count<10) {
			if(num%2!=0) {
				count++;
				System.out.print(num+" ");
			}
			num=num+1;
		}
	}
}
