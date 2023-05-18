package array.practice04;

public class Movie {

	private String title;
	private String category;
	private String director;
	private int runningTime;
	private String[] actorArray;
	
	public Movie(String title, String category, String director, int runningTime, String[] actorArray) {

		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actorArray = actorArray;
	}
	
	public void printInfo() {
		System.out.println("===== Movie Ifo =====");
		System.out.print("제목=" + title + " | ");
		System.out.print("분류=" + category + " | ");
		System.out.print("감독=" + director + " | ");
		System.out.println("상영시간=" + runningTime + "(분)");
		System.out.print("배우=");
		for(int i = 0; i < actorArray.length; i++) {
			if(i == 2) {
				System.out.print(actorArray[i]);
			} else {
			System.out.print(actorArray[i] + "," + " ");
			}
		}
	}
	
	
}
