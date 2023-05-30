package generic_practice.practice07.chapter01;

public class GenericExample {

	public static void main(String[] args) {
		
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
		
	}

}
