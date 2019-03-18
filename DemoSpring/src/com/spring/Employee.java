package com.spring;

public class Employee {
	
	private String name;
	private int age;
	private String gender;
	private String designation;
	static int count=0;
//	static Employee emp= null;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	
	
	
	public void display() {
		
		System.out.println("Employeee Name: "+this.name+" Age: "+this.age+
				" Gender: "+this.gender+" Desination: "+this.designation);
	}
	
	public Employee(){
		count++;
	}

/*	
	private Employee(){
		
	}
	
	 static public Employee getEmp() {
		 if(emp==null) {
			 emp= new Employee();
			count++;
		 } 
		 return emp;
	 }
	
	public static void main(String args[])     
	   { 
	       Employee emp = Employee.getEmp();
	       
	       Employee emp1 = Employee.getEmp();
	     

	       System.out.println("Count1 :" +count);
	       
	       System.out.println("Count2 :" +count);
	   }
	*/
}
