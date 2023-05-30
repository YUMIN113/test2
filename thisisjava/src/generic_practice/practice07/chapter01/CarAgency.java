package generic_practice.practice07.chapter01;

public class CarAgency implements Rentable<Car> {

	@Override
	public Car rent() {
		return new Car();
	}
	
}
