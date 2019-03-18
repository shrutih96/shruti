package inherit;
import java.util.*;

public class EmployeeDemo {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the name of Manager:");
		String name= sc.nextLine();
		System.out.print("Enter the age of Manager:");
		int age= sc.nextInt();
		System.out.print("Enter the salary of Manager:");
		double salary= sc.nextDouble();
		System.out.print("Enter the number of employees under Manager:");
		int noOfEmp= sc.nextInt();
		
		Manager m1= new Manager();
		
		m1.setName(name);
		m1.setAge(age);
		m1.setSalary(salary);
		m1.setNoOfEmp(noOfEmp);
		
		
		Employee arr[]=new Employee[noOfEmp];
		for(int i=0;i<noOfEmp;i++) {
			Employee e= new Employee();
			System.out.print("Enter the name of Employee"+(i+1)+":");
			String e_name= sc.nextLine();
			System.out.print("Enter the age of Employee"+(i+1)+":");
			int e_age= sc.nextInt();
			System.out.print("Enter the salary of Employee"+(i+1)+":");
			double e_salary= sc.nextDouble();			
			e.setName(e_name);
			e.setAge(e_age);
			e.setSalary(e_salary);
			arr[i]=e;
			
		}
		
		m1.getMgDetails();
		for(int i=0;i<noOfEmp;i++) {
			arr[i].getDetails();
		}
		
	}
	
}

