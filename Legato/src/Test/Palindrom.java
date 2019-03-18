package Test;
import java.util.*;
public class Palindrom {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		boolean flag=false;int k=0; int i=0;
		for(i=0;i<str.length()/2;i++) {
			
			if(str.charAt(i)==str.charAt(str.length()-1-i)) {
				k=k+1;
			}
			
	}
		if(k>=i) {
			flag=true;
			System.out.println("test");
		}
		 if(flag) {	
				System.out.println("String is a Palindrome.");
			}
			else {
				System.out.println("String is not a Palindrome.");
			}
	}	
		
	
}
