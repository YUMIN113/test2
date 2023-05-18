package array.practice04;

public class MovieApp {

	public static void main(String[] args) {
		
		String title = "탑건 매버릭";
		String category = "액션";
		String director = "조셉 코신스키";
		int runningTime = 130;
		
		String[] actorArray = new String[3];
		actorArray[0] = new String("탐 크루즈");
		actorArray[1] = new String("마일스 텔러");
		actorArray[2] = new String("모니카 바바로");
		
		Movie m1 = new Movie(title, category, director, runningTime, actorArray);
		m1.printInfo();

	}

}
