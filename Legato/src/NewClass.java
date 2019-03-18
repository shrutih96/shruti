import java.util.Scanner;
import java.util.regex.Pattern;
public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		try {
			validatePattern(name);
		} catch (NameInvalid e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void validatePattern(String name) throws NameInvalid{
		if(Pattern.matches("^[A-Za-z]+$", name))
			System.out.println("Valid Input");
		else
			System.out.println("Invalid Input");
			throw new NameInvalid("Entered name is Invalid");
	}

}
