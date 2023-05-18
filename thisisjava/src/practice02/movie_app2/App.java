package practice02.movie_app2;

public class App {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		
		movie.setTitle("탑건:매버릭");
		System.out.println(movie.getTitle());
		
		movie.setCategory("액션");
		System.out.println(movie.getCategory());
		
		movie.setDirector("조셉 코신스키");
		System.out.println(movie.getDirector());
		
		movie.setRunningTime(132);
		System.out.println(movie.getRunningTime());

	}

}
