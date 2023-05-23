package inheritance_interface.practice01;

public class Animal {

	private int age;
	private String name;
	
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Animal(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("나이=" + age + " : " + "이름=" + name);
	}
	
	public void eat() {
		System.out.println("Animal.eat()");
	}
	
}
