package inheritance_interface.practice01;

public class Bird extends Animal implements Flyer {

	private int wing;
	
	public Bird(int age, int wing) {
		super(age);
		this.wing = wing;
	}

	@Override
	public void printInfo() {
		System.out.println("나이=" + super.getAge() + " : " + "날개수=" + wing);
	}
	
	@Override
	public void eat() {
		System.out.println("Bird.eat()");
	}

	@Override
	public void takeOff() {
		System.out.println("Bird.takeOff()");
	}

	@Override
	public void land() {
		System.out.println("Bird.land()");
	}

	@Override
	public void fly() {
		System.out.println("Bird.fly()");
	}


	

}
