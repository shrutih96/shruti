package inherit;

public class Manager extends Employee{
	private int noOfEmp;

	public int getNoOfEmp() {
		return noOfEmp;
	}

	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	
	void getMgDetails() {
		super.getMgDetails();
	/* System.out.println("Details"+ getName() +this.noOfEmp);
	*/
		
		System.out.println(";Number of Emps under Manager:" +this.noOfEmp);
	}
}
