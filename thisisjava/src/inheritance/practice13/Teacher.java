package inheritance.practice13;

public class Teacher extends Person {

	private String lesson;

	// Constructor
	public Teacher() {
	}

	public Teacher(String name, int age, String lesson) {
		super(name, age);
		this.lesson = lesson;
	}

	// Method
	public void setLesson(String newLesson) {
		lesson = newLesson;
	}

	public String getLesson() {
		return lesson;
	}

	@Override
	public void printInfo() {
		System.out.println("\n===== Teacher =====");
		System.out.print("이름=" + getName());
		System.out.print(" | 나이=" + getAge());
		System.out.println(" | 과목=" + getLesson());
	}

}
