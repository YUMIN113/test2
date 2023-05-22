package inheritance.practice05;

public class Teacher extends Person {

	private String lesson; // 과목
	
	

	public Teacher() {
		System.out.println("Teacher()");
	}
	
	public Teacher(String name, int age, String lesson) {
		super(name, age);
		this.lesson = lesson;
		System.out.println("Teacher(String name, int age, String lesson)");
	}

	public void setLesson(String newLesson) {
		lesson = newLesson;
	}

	public String getLesson() {
		return lesson;
	}

	@Override
	public void printInfo() {
		System.out.print("Teacher.printInfo() : ");
		System.out.print("이름=" + getName());
		System.out.print(" | 나이=" + getAge());
		System.out.println(" | 과목=" + lesson);
	}
	
}
