package practice2.movie_app3;

public class Movie {

	String title;
	
	String category;
	
	String director;
	
	int runningTime;
	
	

	public Movie() {
		System.out.println("Movie()");
	}



	public Movie(String title, String category, String director, int runningTime) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		
		System.out.println("\n===== Field =====");
		System.out.println(title + "\n" + category + "\n" + director + "\n" + runningTime);
	}
	
	

}
