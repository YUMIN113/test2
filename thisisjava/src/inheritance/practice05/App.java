package inheritance.practice05;

public class App {

	public static void main(String[] args) {

		Person p = new Person();
		p.setName("Kim");
		p.setAge(20);
		System.out.println("\n===== Person =====");
		System.out.print("이름=" + p.getName());
		System.out.println(" | 나이=" + p.getAge());

		Student s = new Student();
		s.setName("Lee");
		s.setAge(30);
		s.setHakbun("2023-001");
		System.out.println("\n===== Student =====");
		System.out.print("이름=" + s.getName());
		System.out.print(" | 나이=" + s.getAge());
		System.out.println(" | 학번=" + s.getHakbun());

		Teacher t = new Teacher();
		t.setName("Hong");
		t.setAge(40);
		t.setLesson("music");
		System.out.println("\n===== Teacher =====");
		System.out.print("이름=" + t.getName());
		System.out.print(" | 나이=" + t.getAge());
		System.out.println(" | 과목=" + t.getLesson());
	}

}
