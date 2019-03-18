package Test;
import java.util.*;
public class NonRepeating {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next(); int i=0;int k=0;int count=0;
		for(i=0;i<str.length()-1;i++) {
			boolean flag=true;
			
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {	
					flag=false;
					break;
				}
				
				
			}
			if(flag) {
				System.out.println("Character: "+ str.charAt(i));
				break;
			}
			
			
			 
		}	
		
	}
}
