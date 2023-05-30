package generic_practice.practice12;

public class SuperMan extends Person implements Fly, Hidden {

	public SuperMan(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		System.out.println("SuperMan.fly()");
	}

	@Override
	public void hidden() {
		System.out.println("SuperMan.hidden()");
	}

	@Override
	public void printInfo() {
		System.out.print("이름=" + getName());
		System.out.println(" | 나이=" + getAge());
	}

}