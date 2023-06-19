package lambda_practice.practice02;

public class App {

	public static void main(String[] args) {

		System.out.println("===== x + y =====");
		System.out.println("\n----- 익명 객체 -----");
		action(new Calculator() {

			@Override
			public void calculate(int x, int y) {
				int result = x + y;
				System.out.println("x + y : " + result);
			}

		});

		System.out.println("\n----- 람다 -----");
		action((x, y) -> {
			int result = x + y;
			System.out.println("x + y : " + result);
		});

		System.out.println("\n===== x - y =====");
		System.out.println("\n----- 익명 객체 -----");
		action(new Calculator() {

			@Override
			public void calculate(int x, int y) {
				int result = x - y;
				System.out.println("x - y : " + result);
			}

		});

		System.out.println("\n----- 람다 -----");
		action((x, y) -> {
			int result = x - y;
			System.out.println("x - y : " + result);
		});

	}

	public static void action(Calculator calculator) {
		System.out.println("action()");

		int x = 10;
		int y = 4;
		calculator.calculate(x, y);
	}

}
