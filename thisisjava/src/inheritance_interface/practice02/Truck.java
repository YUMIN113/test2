package inheritance_interface.practice02;

public class Truck extends Car implements TruckModel {

	public Truck(String name) {
		super(name);
	}

	@Override
	public void load() {
		System.out.println(getName() + "에 짐을 싣다.");
		
	}

	@Override
	public void unload() {
		System.out.println(getName() + "에서 짐을 내리다.");
		
	}
	

}
