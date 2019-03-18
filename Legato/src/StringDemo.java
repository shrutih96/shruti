import java.util.*;
public class StringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the text");
		String str=sc.nextLine();
		String evenStr=""; String oddStr="";
		char vowel[]= {'a','e','i','o','u'};
		
	/*	for (int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			for(int j=0;j< vowel.length;j++) {
				if (ch==vowel[j])
					count=count+1;
			}
		}
		System.out.println("Number of vowels are:"+count); */
		
		for (int i=0;i<str.length();i++) {
			if(i%2==0) {
				evenStr=evenStr+str.charAt(i);
			}
			else
				oddStr=oddStr+str.charAt(i);			
		}
		System.out.println("Even: "+evenStr);
		System.out.println("Odd: "+oddStr);
			
	}

}
