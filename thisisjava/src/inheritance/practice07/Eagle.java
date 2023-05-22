package inheritance.practice07;

public class Eagle extends Animal{

	private String animal;
	private int wing;
	
	public Eagle(String name, int age, String sex, int wing) {
		super(name, age, sex);
		this.animal = "Eagle";
		this.wing = wing;
	}
	
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	@Override
	public void printInfo() {
		System.out.println("===== Eagle Info =====");
		System.out.print("동물=" + animal);
		System.out.print(" | 이름=" + getName());
		System.out.print(" | 나이=" + getAge());
		System.out.print(" | 성별=" + ((getSex() == "F") ? "여" : "남"));
		System.out.println(" | 날개=" + wing + "(개)");
		System.out.println();
	}
	
	public void fly() {
		System.out.println(getName() + " :: fly()");
		System.out.println();
	}
}
