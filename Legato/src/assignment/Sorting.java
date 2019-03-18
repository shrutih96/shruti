package assignment;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(45);
		li.add(234);
		li.add(98);
		li.add(456);
		int temp;
	//	ArrayList<Integer> op=new ArrayList<Integer>();
		/*for(int k=0;k<li.size();k++) {
			for(int j=1;j<li.size();j++) {
			if(li.get(k)<li.get(j)) {
				temp=li.get(j);
				li.add(li.get(k));
			}
			}
		}*/
		Collections.sort(li);  //Collections.reverse(li)
		System.out.println(li);
	}
}
