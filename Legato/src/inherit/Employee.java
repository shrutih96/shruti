package inherit;

public class Employee {
		
	private String name;
	private	int age;
	private	double salary;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void getMgDetails() {
		System.out.print("Details of Manager are: Name-" +this.name+";Age-" +this.age+";Salary-" +this.salary);
	}

	void getDetails() {
		System.out.println("Details of Employee are: Name-" +this.name+";Age-" +this.age+";Salary-" +this.salary);
	}

}
