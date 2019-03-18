package movie;
import java.util.*;
public class MovieObjects {
	public static void main(String[] args) {
		LinkedList<Movie> a= new LinkedList<Movie>();
		Scanner sc= new Scanner(System.in);
		
	
		
		System.out.println("Enter the number of movies:");
		int num=sc.nextInt();		
		for(int i=0; i<num;i++) {
			
			Movie m=new Movie();
		System.out.print("Enter movie name:");
		String name=sc.next();
	
		System.out.print("Enter movie duration:");
		double duration=sc.nextDouble();
	
		m.setName(name);
		
		m.setDuration(duration);
		
		m.setMovieId(Movie.getCounter());
		
		a.add(m);
		
		}
		
		Iterator<Movie> i=a.iterator();
		while(i.hasNext()) {
		System.out.println(i.next()); 
		}
	}
		
}
