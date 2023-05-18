package practice03.footballplayer2;

public class App {

	public static void main(String[] args) {
		
		FootBallPlayer fp1 = new FootBallPlayer();
		
		fp1.setName("Kim");
		fp1.setUniformNumber("7");
		fp1.setTeamName("Real Madrid");
		fp1.setSpeed(5);
		fp1.setTech(5);
		fp1.printInfo();
		
		FootBallPlayer fp2 = new FootBallPlayer();
		
		fp2.setName("Lee");
		fp2.setUniformNumber("19");
		fp2.setTeamName("Barcelona");
		fp2.setSpeed(4);
		fp2.setTech(3);
		fp2.printInfo();
		
	}

}
