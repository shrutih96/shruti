package Test;

public class ArraySort {

	public static void main(String args[]) {
		String temp;
		String s[]= {"Shruti","Arpita","Priyanka","Vineet","Shiva"};
		
		System.out.println("Original array is:");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length-i-1;j++) {
				if(s[j]!=s[j+1]) {
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		
		System.out.print("Sorted array is:");
		for(i=0;i<s.length;i++) {
			System.out.println(s[i]+" ");
		}
		}
	}
	
}
