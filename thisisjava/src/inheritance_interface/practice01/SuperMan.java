package inheritance_interface.practice01;

public class SuperMan extends Human implements Flyer {

	public SuperMan(int age, String name) {
		super(age, name);
	}
	
	@Override
	public void eat() {
		System.out.println("SuperMan.eat()");
	}

	@Override
	public void takeOff() {
		System.out.println("SuperMan.takeOff()");
	}

	@Override
	public void land() {
		System.out.println("SuperMan.land()");
	}

	@Override
	public void fly() {
		System.out.println("SuperMan.fly()");
	}

}
