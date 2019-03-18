import java.util.*;
import java.util.regex.Pattern;
public class AnimalTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Animal arr[]=null;
		for(;;) {
		System.out.println("Please enter 1 to add animals;\n"+"enter 2 to display the animals;\n"+" enter 3 to exit:");
		int option= sc.nextInt();
		
		switch(option) {
		case 1: arr= addAnimals(arr);
				break;
		case 2: displayAnimals(arr);
				break;
		case 3: System.exit(0);
				break;
		default: System.out.println("Enter the correct value.");
		}
		}
		
		
	}
	public static Animal[] addAnimals(Animal[]arr) {
		System.out.print("Enter the number of objects required:");
		Scanner sc=new Scanner(System.in);
		int obj=sc.nextInt();
		arr =new Animal[obj];
		ArrayList<Animal> a2= new ArrayList<Animal>();
		for(int i=0;i<obj;i++) {
			System.out.print("Enter animal name:");
			String name=sc.next();
	/*		int j=0;
			while(!validate(name))
			{
				System.out.println("Enter only characters.");
				System.out.print("Enter animal name:");
				name=sc.next();
				j++;
				if(j>=3) {
					System.out.println("You exceeded maximum attempts.");
					j=0;
					System.exit(0);
				}
			}
		*/
			System.out.print("Enter animal breed:");
			String breed=sc.next();
	/*		while(!validate(breed))
			{
				System.out.println("Enter only characters.");
				System.out.print("Enter animal breed:");
				name=sc.next();
				j++;
				if(j>=3) {
					System.out.println("You exceeded maximum attempts.");
					j=0;
					System.exit(0);
				}
			}	*/
			System.out.print("Please enter animal age:");
			String age=sc.next();
			int j=0;
			while(!validate(age))
			{
				System.out.println("Enter only numbers.");
				System.out.print("Please enter animal age:");
				age=sc.next();
				j++;
				if(j>=3) {
					System.out.println("You exceeded maximum attempts.");
					j=0;
					System.exit(0);
				}
			}
			int a1=Integer.parseInt(age);
		
		Animal a= new Animal();
		//String na="";
		//na=reverse (name);
		a.setName(name);
		a.setBreed(breed);
		a.setAge(a1);
		arr[i]=a;
		a.getAnimalLifestyle();
		}
		a2.add(new Animal());
		return arr;
	}
	/*	Animal a2= new Animal("Eagle","Bird",4);
		Animal a3=a1;
		a1=a2;
		
		a1.getAnimalLifestyle();
		a2.getAnimalLifestyle();
		a3.getAnimalLifestyle(); */
	public static void displayAnimals(Animal[]arr) {
	//	System.out.println("The array is"+arr);
		for(int i=0; i<arr.length; i++) {
			if(arr!=null) {
				System.out.println("Name:"+arr[i].getName()+" Breed:"+arr[i].getBreed()+" Age:"+arr[i].getAge());
			}
			else
				System.out.println("No Objects to display:");
		}
		
	}
	
/*	public static boolean validate(String name) {
		if(Pattern.matches("^[A-Za-z]+$", name))
			return true;
		else
			return false;
	}
*/
	public static boolean validate(String age) {
		if(Pattern.matches("^[0-9]+$", age))
			return true;
		else
			return false;
	}
/*	public static String reverse(String name) {
		String rev="";
		for(int i=name.length()-1;i>0;i++) {
		rev=rev+name.charAt(i);
		}
		return rev;
	}	*/
	
}
