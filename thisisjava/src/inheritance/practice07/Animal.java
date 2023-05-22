package inheritance.practice07;

public class Animal {

	private String animal;
	private String name;
	private int age;
	private String sex;
	
	
	
	public Animal(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Animal(String animal, String name, int age, String sex) {
		this.animal = animal;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void printInfo() {
		System.out.println("===== Animal Info =====");
		System.out.print("동물=" + animal);
		System.out.print(" | 이름=" + name);
		System.out.print(" | 나이=" + age);
		System.out.println(" | 성별=" + ((sex == "F") ? "여" : "남"));
		System.out.println();
	}

}
