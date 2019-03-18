package mappackage;

import java.util.*;

import movie.Movie;
public class HashmapTest {

	public static void main(String[] args) {
		Movie mo=new Movie();
			mo.setName("ASD");
			mo.setDuration(3);
			mo.setMovieId(Movie.getCounter());
		
		Map<Movie,Integer> m=new TreeMap<Movie,Integer>();
		m.put(mo,102);
		
	
		
		System.out.println("Size of HashMap: "+m.size());
		System.out.println("Element with key 103: "+m.get(103));
		
		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();
		Set s1=m.keySet();
		Iterator it1=s1.iterator();
		while(it1.hasNext()) {
			Movie i=(Movie)it1.next();
			System.out.println("Key="+i+" Value="+m.get(i));
		}
	}

}
