package practice1.teacher_app;

public class TeacherApp {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		
		t1.setName("Lee");
		t1.setAge(20);
		t1.setLesson("Music");
		
		String name = t1.getName();
		int age = t1.getAge();
		String lesson = t1.getLesson();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("과목 : " + lesson);
		
		Teacher t2 = new Teacher();
		
		t2.setName("Park");
		t2.setAge(30);
		t2.setLesson("Music");
		t2.printInfo();

	}

}
