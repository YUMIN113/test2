package practice02.movie_app4;

public class Actor {

	String name;
	String sex;
	String birthday;
	String nationality;
	
	public Actor(String name, String sex, String birthday, String nationality) {

		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.nationality = nationality;
	}
	
	public void printInfo() {

		System.out.println("이름=" + name);
		System.out.println("성별=" + sex);
		System.out.println("생년월일=" + birthday);
		System.out.println("국적=" + nationality);
	}
	
	
}
