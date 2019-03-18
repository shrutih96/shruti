import java.util.*;
public class Count {
	public static void main(String[] args) {
	String str="1a2d!@#$ASD 3f4g";
	value(str);
	}
	
	public static void value(String str) {
		int d=0;int c=0;int s=0;
/*WRAPPER CLASS
 	Integer i1=d;  					//converting primitive to Wrapper class
 	int u=i1;						//converting primitive from Wrapper class
	String s=u.toString();			//converting Wrapper class to String
	int a=Integer.parseInt(s);		//converting string to integer
		
		*/									
		for (int i=0; i<str.length(); i++) {
			if( Character.isDigit(str.charAt(i))) {
				d=d+1;
			}
			else if(Character.isLetter(str.charAt(i))) {
					c=c+1;
				}
			else s=s+1;
		}
		System.out.println("Numbers:"+d);
		System.out.println("Characters:"+c);
		System.out.println("Special Characters:"+s);
		
	}
}

