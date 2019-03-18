package movie;

public class Movie implements Comparable{
	private int movieId;
	private String name;
	private double duration;
	private static int counter=63826;
	
	public int getMovieId() {
		return movieId;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Movie.counter = counter;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public Movie(){
		counter=counter++;
	}
	
	@Override
	public String toString() {
		return "Movie ID: "+this.movieId+"Movie Name:"+this.name+ " Movie Duration:"+this.duration;
	}
	
	
	public int compareTo(Movie o) {

		/* 	int val= o.name.compareTo(this.name);
		if(val>0)
			return 1;
		else if (val<0)
			return -1;
		else		
			return 0;
		*/	
		
		if (o.movieId<this.movieId)
			return 1;
		else if(o.movieId>this.movieId)
				return -1;
			else 
				return 0;
	}

}
