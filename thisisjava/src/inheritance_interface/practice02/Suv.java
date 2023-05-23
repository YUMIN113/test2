package inheritance_interface.practice02;

public class Suv extends Car implements PassengerModel, TruckModel {

	public Suv(String name) {
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
	

	@Override
	public void getOn() {
		System.out.println(getName() + "에 타다.");
		
	}

	@Override
	public void getOff() {
		System.out.println(getName() + "에서 내리다.");
		
	}

	
}
