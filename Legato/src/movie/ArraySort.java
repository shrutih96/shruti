package movie;
import java.util.*;
public class ArraySort {
	public static void main(String args[]) {
		ArrayList<Integer> a=new  ArrayList<Integer>();
		
		a.add(27);
		a.add(89);
		a.add(34);
		a.add(11);
		a.add(03);
		a.add(88);
		System.out.println("Before Sorting:"+a);
		int temp;
		for(int j=0;j<a.size();j++) {
		for(int i=0;i<a.size()-1-j;i++) {
			if(a.get(i)>(a.get(i+1))) {
			temp=a.get(i);
			a.set(i, a.get(i+1));
			a.set(i+1,temp);
			}
		}
		}
		
		System.out.println("After Sorting:"+a);
	}
}
