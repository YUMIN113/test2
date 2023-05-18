package array.practice05;

public class MovieApp {

	public static void main(String[] args) {
		
	    String title = "탑건 매버릭";
	    String category = "액션";
	    String director = "조셉 코신스키";
	    int runningTime = 130;
		
		Actor[] actorArray = new Actor[3];
		actorArray[0] = Service.getActor("탐 크루즈", "남자", "1962.07.03", "미국");
		actorArray[1] = Service.getActor("마일스 텔러", "남자", "1987.02.20", "미국");
		actorArray[2] = Service.getActor("모니카 바바로", "여자", "1990.06.18", "미국");
	
		Movie movie = new Movie(title, category, director, runningTime, actorArray);
		movie.printInfo();
	}

}
