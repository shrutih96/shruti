package assignment;
import java.util.*;
public class Bank {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		Person ac[]=null;
		int count=0;
		System.out.print("Enter 1 to add customer details\n"+"Enter 2 to get customer details\n"+
										"Enter 3 to exit.");
		int option=sc.nextInt();
		for(;;) {
		switch(option) {
		case 1: ac= addCustomer(ac,count);
				break;
		case 2: displayDetails(ac);
				break;
		case 3: System.exit(0);
				break;
		default: System.out.println("Enter the correct value.");
		}
		}
	}
	
	public static Person[] addCustomer(Person ac[], int count) {
		System.out.print("Enter the number of customers:");
		Scanner sc=new Scanner(System.in);
		count=sc.nextInt(); //no. of customers
		
		ac =new Person[count];
		
		for(int i=0;i<count;i++) {
			
			Person acc= new Person();	//object creation
			
		System.out.println("Enter the name of customer:");	
		String name=sc.next();
		acc.setName(name);
		System.out.println("Enter the age of customer:");	
		float age=sc.nextFloat();
		Float f=age;
		String a=f.toString();
		acc.setAge(a);
			
		System.out.println("Enter the balance of customer:");	
		double balance=sc.nextDouble();
		acc.setBalance(balance);
	
		acc.setAccNum(Account.getCounter());
		System.out.println(acc);
		ac[i]=acc;
		System.out.println(acc);
		}
		return ac;
		
		}
	
	static void displayDetails(Account ac[]) {
		
		System.out.println(ac);
		
		
		
	}
}
