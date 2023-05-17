package practice19;

public class Singer {

	private String name;
	private char sex;
	private String birthDate;
	private String company;
	
	public Singer(String name, char sex, String birthDate, String company) {
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public void printInfo() {
		System.out.println("이름=" + name);
		System.out.println("성별=" + ((sex == 'F') ? "여" : "남"));
		System.out.println("생년월일=" + birthDate);
		System.out.println("소속사=" + company);
	}
}
