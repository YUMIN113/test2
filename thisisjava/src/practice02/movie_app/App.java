package practice02.movie_app;

public class App {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		
		System.out.println("===== Field =====");
		
		movie.title = "탑건:매버릭";
		System.out.println(movie.title);
		
		movie.category = "액션";
		System.out.println(movie.category);
		
		movie.director = "조셉 코신스키";
		System.out.println(movie.director);
		
		movie.runningTime = 132;
		System.out.println(movie.runningTime);

	}

}
