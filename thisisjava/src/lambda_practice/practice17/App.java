package lambda_practice.practice17;

public class App {

	public static void main(String[] args) {

		System.out.println("\n===== DealerA =====");
		System.out.println("\n----- Anonymous -----");
		DealerA da1 = new DealerA() {
			@Override
			public Car getCar() {
				return new Car();
			}
		};
		Car c1 = da1.getCar();
		c1.pirntInfo();

		System.out.println("\n----- Lambda -----");
		DealerA da2 = () -> {
			return new Car();
		};
		Car c2 = da2.getCar();
		c2.pirntInfo();

		System.out.println("\n----- Lambda : Constructor Reference -----");
		DealerA da3 = Car::new;
		Car c3 = da3.getCar();
		c3.pirntInfo();

		System.out.println("\n===== DealerB =====");
		System.out.println("\n----- Anonymous -----");
		DealerB db1 = new DealerB() {
			@Override
			public Car getCar(String name, String company) {
				return new Car(name, company);
			}
		};
		Car c11 = db1.getCar("EV6", "기아자동차");
		c11.pirntInfo();

		System.out.println("\n----- Lambda -----");
		DealerB db2 = (name, company) -> {
			return new Car(name, company);
		};
		Car c12 = db2.getCar("A6", "Audi");
		c12.pirntInfo();

		System.out.println("\n----- Lambda : Constructor Reference -----");
		DealerB db3 = Car::new;
		Car c13 = db3.getCar("아이오닉6", "현대자동차");
		c13.pirntInfo();
	}

}
