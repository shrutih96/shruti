package Test;
import java.util.regex.*;
public class Count{

	public static void main(String[] args) {
		String str= "This is a      paragraph     where "
				+ "every    character is to be      converted to I     ";
		int count=0;
		String a[]=str.split("[ ]+");
		
		for(int i=0;i<a.length;i++) {
			 
			String w=a[i];
			count=count+ w.length();
				}
			
			 
		System.out.println("The number of characters are: "+count);
	
}
}