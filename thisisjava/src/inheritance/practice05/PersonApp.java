package inheritance.practice05;

public class PersonApp {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		System.out.println("===== public =====");
		s.setName("Lee");
		s.setAge(30);
		s.setHakbun("2023-001");
		
		System.out.println("이름=" + s.getName());
		System.out.println("나이=" + s.getAge());
		System.out.println("학번=" + s.getHakbun());
		
		System.out.println("===== private =====");
		System.out.println("이름");
	}

}
