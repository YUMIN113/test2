package practice03.footballplayer2;

public class FootBallPlayer {
	
	private String name;
	private String uniformNumber;
	private String teamName;
	private int speed;
	private int tech;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniformNumber() {
		return uniformNumber;
	}

	public void setUniformNumber(String uniformNumber) {
		this.uniformNumber = uniformNumber;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getTech() {
		return tech;
	}

	public void setTech(int tech) {
		this.tech = tech;
	}

	public void printInfo() {
		System.out.println("===== FootballPlayer Info =====");
		System.out.println("선수=" + this.getName());
		System.out.println("팀=" + this.getTeamName());
		System.out.println("유니폼 번호=" + this.getUniformNumber());
		System.out.println("스피드=" + this.getSpeed());
		System.out.println("기술=" + this.getTech());
		System.out.println();
	}

}
