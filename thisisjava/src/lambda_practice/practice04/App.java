package lambda_practice.practice04;

public class App {

	public static void main(String[] args) {
		
		System.out.println("===== Java =====");
		Sayable s = new Sayable() {
			@Override
			public void sayHello() {
				System.out.println("Hello");
			}
		};
		s.sayHello();
		
		System.out.println("\n===== Lambda =====");
		
		System.out.println("\n----- Type 1. -----");
		Sayable s1 = () -> {
			System.out.println("Hello");
			System.out.println("Welcome");
		};
		
		s1.sayHello();
		
		System.out.println("\n----- Type 2. -----");
		Sayable s2 = () -> {
			System.out.println("Hello");
		};
		
		s2.sayHello();
			
		System.out.println("\n----- Type 3. -----");
		Sayable s3 = () -> 
			System.out.println("Hello");
			
		s3.sayHello();
	}

}
