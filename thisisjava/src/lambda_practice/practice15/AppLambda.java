package lambda_practice.practice15;

public class AppLambda {

	public static void main(String[] args) {

		System.out.println("\n===== Lambda =====");

		System.out.println("\n----- Type 1 -----");

		Sayable s1 = () -> {
			System.out.println("World");
		};

		s1.sayHello();

		System.out.println("\n----- Type 2 -----");

		French french2 = new French();

		Sayable s2 = () -> {
			french2.sayHello();
		};
		
		s2.sayHello();

		System.out.println("\n----- Type 3 : Method Reference -----");

		Sayable s3 = french2::sayHello;
		s3.sayHello();

	}

}
