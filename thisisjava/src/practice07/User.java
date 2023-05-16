package practice07;

public class User {

	private String name;
	private int age;
	private float height;
	private char sex;
	private boolean marriageYn;
	
	public User() {}

	public User(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public User(String name, int age, char sex, float height, boolean marriageYn) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
		this.marriageYn = marriageYn;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isMarriageYn() {
		return marriageYn;
	}

	public void setMarriageYn(boolean marriageYn) {
		this.marriageYn = marriageYn;
	}

	public void printInfo() {
		System.out.println();
		System.out.println("===== User Info =====");
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("키 : " + this.height);
		System.out.println("성별 : " + ((this.sex == 'W') ? "여" : "남"));
		System.out.println("결혼 여부 : " + ((this.marriageYn == true) ? "기혼" : "미혼"));
	}
	
}
