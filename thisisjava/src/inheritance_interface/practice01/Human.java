package inheritance_interface.practice01;

public class Human extends Animal {

	public Human(int age, String name) {
		super(age, name);
	}

	@Override
	public void eat() {
		System.out.println("Human.eat()");
	}

}
