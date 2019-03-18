package abstraction;

public class Manager extends Employees{
		private int noOfEmp;

		public int getNoOfEmp() {
			return noOfEmp;
		}

		public void setNoOfEmp(int noOfEmp) {
			this.noOfEmp = noOfEmp;
		}
		
		void getDetails() {
		super.getDetails();
		/* System.out.println("Details"+ getName() +this.noOfEmp);
		*/
			
			System.out.println(";Number of Emps under Manager:" +this.noOfEmp);
		}
}


