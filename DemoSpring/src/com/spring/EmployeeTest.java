package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String args[]) {
		
		
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
	    
		Employee emp =(Employee)ctx.getBean("employee");
		
		Employee emp1 =(Employee)ctx.getBean("employee");
		emp.setName("Shruti");
		emp.setAge(23);
		emp.setGender("Female");
		emp.setDesignation("Developer");
		
		
		
		emp1.setName("Shreya");
		emp1.setAge(20);
		emp1.setGender("Female");
		emp1.setDesignation("CA");
		
		emp.display();
		emp1.display();
		

		System.out.println("Number of objects created: "+ Employee.count);
}
}
