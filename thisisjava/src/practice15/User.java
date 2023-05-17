package practice15;

public class User {

	private String name = "Olivia"; // 이름
	private int age = 30; // 나이
	private float height = 170.5f; // 키
	private char sex = 'F';	//성별. F 여성, M 남성
	private boolean marriageYn = false; // 결혼여부	


	// Method
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

	public boolean getMarriageYn() {
		return marriageYn;
	}
	
	public void setMarriageYn(boolean marriageYn) {
		this.marriageYn = marriageYn;
	}
	
	public void printInfo() {
		System.out.println("이름=" + name);
		System.out.println("나이=" + age);
		System.out.println("키=" + height);
		System.out.println("성별=" + sex);
		System.out.println("결혼여부=" + marriageYn);
	}
	
}