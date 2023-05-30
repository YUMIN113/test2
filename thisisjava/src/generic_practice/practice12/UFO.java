package generic_practice.practice12;

public class UFO implements Fly, Hidden {

	private String shape;

	public UFO(String shape) {
		this.shape = shape;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public void fly() {
		System.out.println("UFO.fly()");
	}

	@Override
	public void hidden() {
		System.out.println("UFO.hidden()");
	}

	public void printInfo() {
		System.out.println("모양=" + shape);
	}
}
