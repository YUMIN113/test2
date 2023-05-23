package inheritance.practice16;

public class Student extends Person {

	private String hakbun;

	// Constructor
	public Student() {
	}

	public Student(String name, int age, String hakbun) {
		super(name, age);
		this.hakbun = hakbun;
	}

	// Method
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	@Override
	public void printInfo() {
		System.out.println("\n===== Student =====");
		System.out.print("이름=" + getName());
		System.out.print(" | 나이=" + getAge());
		System.out.println(" | 학번=" + getHakbun());
	}

}