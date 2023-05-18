package practice03.footballplayer;

public class App {

	public static void main(String[] args) {
		
		FootBallPlayer fp1 = new FootBallPlayer();
		
		fp1.name = "Kim";
		fp1.uniformNumber = "7";
		fp1.teamName = "Real Madrid";
		fp1.speed = 5;
		fp1.tech = 5;
		fp1.printInfo();
		
		FootBallPlayer fp2 = new FootBallPlayer();
		
		fp2.name = "Lee";
		fp2.uniformNumber = "19";
		fp2.teamName = "Barcelona";
		fp2.speed = 4;
		fp2.tech = 3;
		fp2.printInfo();

	}

}
