package array.practice05;

public class Service {
	
	static Actor getActor(String name, String sex, String birthDate, String nationality) {
		return new Actor(name, sex, birthDate, nationality);
	}

}
