import java.util.*;
public class List {

	public static void main(String[] args) {

		ArrayList a= new ArrayList();
		a.add(true);
		a.add("Shruti");
		a.add('S');
		a.add(56.4567);
		a.add(8);
	
		Iterator i=a.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
	}
	}

}
