package inheritance.practice07;

public class Cat extends Animal{

	private String animal;
	private int leg;
	
	public Cat(String name, int age, String sex, int leg) {
		super(name, age, sex);
		this.animal = "Cat";
		this.leg = leg;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	@Override
	public void printInfo() {
		System.out.println("===== Cat Info =====");
		System.out.print("동물=" + animal);
		System.out.print(" | 이름=" + getName());
		System.out.print(" | 나이=" + getAge());
		System.out.print(" | 성별=" + ((getSex() == "F") ? "여" : "남"));
		System.out.println(" | 다리=" + leg + "(개)");
		System.out.println();
	}
	
	public void sleep() {
		System.out.println(getName() + " :: sleep()");
		System.out.println();
	}
	
}
