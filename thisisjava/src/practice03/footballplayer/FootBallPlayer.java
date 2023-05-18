package practice03.footballplayer;

public class FootBallPlayer {
	
	String name;
	String uniformNumber;
	String teamName;
	int speed;
	int tech;
	
	public void printInfo() {
		System.out.println("===== FootballPlayer Info =====");
		System.out.println("선수=" + this.name);
		System.out.println("팀=" + this.teamName);
		System.out.println("유니폼 번호=" + this.uniformNumber);
		System.out.println("스피드=" + this.speed);
		System.out.println("기술=" + this.tech);
		System.out.println();
	}

}
