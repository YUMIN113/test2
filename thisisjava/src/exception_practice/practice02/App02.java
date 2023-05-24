package exception_practice.practice02;

public class App02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			System.out.print("a=" + a);
			System.out.println(" b=" + b);
			int result = a / b;
			System.out.println("result=" + result);
		} catch(ArithmeticException e) {
			System.out.println("===== catch =====");
		} finally {
			System.out.println("===== finally =====");
		}
		
	}

}
