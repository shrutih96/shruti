import java.util.Scanner;
class Voter {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age:");
		int age= sc.nextInt();
		try {
			valid(age);
		} catch (AgeInvalid e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	static void valid(int a) throws AgeInvalid{
		if(a>=18)
			System.out.print("Valid age group.");
		else
			 throw new AgeInvalid("Invaid age group");		
	}
}
	
