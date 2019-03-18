package movie;
import java.util.*;
public class ArraySwap {
	public static void main(String args[]) {
		ArrayList<Integer> a=new  ArrayList<Integer>();
		
		a.add(27);
		a.add(89);
		a.add(34);
		a.add(11);
		a.add(03);
		a.add(88);
		int temp;
			
		for(int i=0;i<a.size()/2;i++) {
			temp=a.get(i);
			a.set(i, a.get(a.size()-1-i));
			a.set(a.size()-1-i,temp);
		}
		
		System.out.println(a);
	}
}
