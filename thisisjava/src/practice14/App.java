package practice14;

public class App {

	public static void main(String[] args) {
		
		Movie m1 = new Movie("탑건:매버릭");
		m1.category = "액션";
		m1.director = "조셉 코신스키";
		m1.runningTime = 132;
		m1.printInfo();
		
		Movie m2 = new Movie("탑건:매버릭", "액션");
		m2.director = "조셉 코신스키";
		m2.runningTime = 132;
		m2.printInfo();
		
		Movie m3 = new Movie("탑건:매버릭", "액션", "조셉 코신스키");
		m3.runningTime = 132;
		m3.printInfo();
		
		Movie m4 = new Movie("탑건:매버릭", "액션", "조셉 코신스키", 132);
		m4.printInfo();
		

	}

}
