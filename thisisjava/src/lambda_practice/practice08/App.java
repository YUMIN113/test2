package lambda_practice.practice08;

public class App {

	public static void main(String[] args) {
		
		System.out.println("===== Java =====");
		Sayable s = new Sayable() {
			@Override
			public void sayHello(String name) {
				System.out.println("Hello");
			}
		};
		s.sayHello("Victoria");
		
		System.out.println("\n===== Lambda =====");
		
		System.out.println("\n----- Type 1. -----");
		Sayable s1 = (String name) -> {
			System.out.println("Hello," + name);
			System.out.println("Welcome, " + name);
		};
		
		s1.sayHello("Smith");
		
		System.out.println("\n----- Type 2. -----");
		Sayable s2 = (name) -> {
			System.out.println("Hello," + name);
			System.out.println("Welcome, " + name);
		};
		
		s2.sayHello("Paige");
			
		System.out.println("\n----- Type 3. -----");
		Sayable s3 = name -> 
			System.out.println("Hello," + name);
			
		s3.sayHello("James");
	}

}
