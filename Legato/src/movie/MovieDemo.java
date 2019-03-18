package movie;
import java.util.*;
import java.util.regex.Pattern;
public class MovieDemo {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
	System.out.println("Enter the number of movies:");
		int num=sc.nextInt();		
		for(int i=0; i<num;i++) {
			System.out.print("Enter movie name:");
			String name=sc.next();
			
			while(!validate(name))
			{
				System.out.println("Enter only characters.");
				System.out.print("Enter movie name:");
				name=sc.next();
				System.exit(0);
				}
			
		System.out.print("Enter movie duration:");
		double duration=sc.nextDouble();
	
		Movie m=new Movie();
		m.setName(name);
		m.setDuration(duration);
		m.setMovieId(Movie.getCounter());
		ArrayList<Movie> mo= new ArrayList<Movie>();
mo.add(new Movie());
		
		
		Iterator<Movie> k=mo.iterator();
		while(k.hasNext()) {
		System.out.println(k.next());
		}
}
	}
	
	public static boolean validate(String name) {
		if(Pattern.matches("^[A-Za-z]+$",name))
			return true;
		else
			return false;
}
	
}
