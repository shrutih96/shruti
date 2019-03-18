package movie;

public class Swapping {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5};
		int temp;
		System.out.println("Value of array before swapping:");
		for(int i=0;i<a.length;i++) {
		System.out.print(" "+a[i]);
		}
		
		
		for(int i=0;i<a.length/2;i++) {
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		
		}
		System.out.println("Value of array after swapping:");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
			}
	}
}
