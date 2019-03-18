package Test;
import java.util.*;
public class ListSort {

	public static void main(String[] args) {
			ArrayList<String> li=new ArrayList<String>();
			li.add("Shruti");
			li.add("Priyanka");
			li.add("Arpita");
			li.add("Chiragi");
			System.out.println("Before Reversing: "+li);		
			Collections.reverse(li);
			System.out.println("After Reversing: "+li);
	}
}

