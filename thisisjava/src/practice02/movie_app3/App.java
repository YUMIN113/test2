package practice02.movie_app3;

public class App {

	public static void main(String[] args) {

		System.out.println("===== Creation =====");
		Movie movie1 = new Movie();

		System.out.println("\n===== Field =====");
		movie1.title = "탑건:매버릭";
		System.out.println(movie1.title);

		movie1.category = "액션";
		System.out.println(movie1.category);

		movie1.director = "조셉 코신스키";
		System.out.println(movie1.director);

		movie1.runningTime = 132;
		System.out.println(movie1.runningTime);
		
		Movie movie2 = new Movie("아바타:물의 길", "SF", "제임스 카메론", 192);
		
		System.out.println();
		System.out.println(movie2.title);
		System.out.println(movie2.category);
		System.out.println(movie1.director);
		System.out.println(movie2.runningTime);
		
	}

}
