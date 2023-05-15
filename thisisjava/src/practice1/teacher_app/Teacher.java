package practice1.teacher_app;

public class Teacher {
	
	private String name;
	private int age;
	private String lesson;

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

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
	public void printInfo() {
		System.out.println("===== Teacher Info =====");
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("과목 : " + this.lesson);
	}
}
