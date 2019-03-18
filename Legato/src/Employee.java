class Employee {

	String name;
	int age;
	double salary;




	Employee(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
		System.out.println("3 parameter constructor.");
	}
	
	Employee(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("2 parameter constructor. Name:"+name);
	}
	Employee(String name){
		this.name=name;
		System.out.println("1 parameter constructor. Name:"+name);
	}
	Employee(){
		System.out.println("0 parameter constructor.");
	}
	

}