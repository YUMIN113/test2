package array.practice05;

public class Actor {

	private String name;
	private String sex;
	private String birthDate;
	private String nationality;
	
	
	public Actor(String name, String sex, String birthDate, String nationality) {
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.nationality = nationality;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
