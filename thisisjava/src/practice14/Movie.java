package practice14;

public class Movie {

	String name;
	String category;
	String director;
	int runningTime;
	
	public Movie(String name, String category, String director, int runningTime) {
		this.name = name;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
	}

	public Movie(String name) {
		this(name, "액션", "조셉 코신스키", 132);
	}
	
	Movie(String name, String category) {
		this(name, category, "조셉 코신스키", 132);
	}
	
	Movie(String name, String category, String director) {
		this(name, category, director, 132);
	}
	
	public void printInfo() {
		System.out.println();
		System.out.println("===== Movie Info =====");
		System.out.println("제목=" + this.name);
		System.out.println("카테고리=" + this.category);
		System.out.println("감독=" + this.director);
		System.out.println("상영시간=" + this.runningTime);
	}
	
	
	
}
