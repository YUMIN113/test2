package array.practice05;

public class Movie {
	
	private String title;
	private String category;
	private String director;
	private int runningTime;
	private Actor[] actorArray;
	
	public Movie(String title, String category, String director, int runningTime, Actor[] actorArray) {

		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actorArray = actorArray;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public Actor[] getActorArray() {
		return actorArray;
	}

	public void setActorArray(Actor[] actorArray) {
		this.actorArray = actorArray;
	}
	
	public void printInfo() {
		System.out.println("===== Movie Info =====");
		System.out.println("제목=" + title + " | " + "분류=" + category + " | " + "감독=" + director + " | " + "상영시간=" + runningTime + "(분)");
		System.out.println("     " + "----- Actor Info -----");
		for(int i = 0; i < actorArray.length; i++) {
			System.out.println("     " + (i + 1) + "." + "이름=" + actorArray[i].getName() + " | " + "성별=" + actorArray[i].getSex() + " | " + "생년월일=" + actorArray[i].getBirthDate() + " | " + "국적=" + actorArray[i].getNationality());
		}
	}
	
	

}
