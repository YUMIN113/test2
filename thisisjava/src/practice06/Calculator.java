package practice06;

public class Calculator {
	
	public void plus(int val1, int val2) {
		int answer = val1 + val2;
		System.out.println("plus() :: " + val1 + " + " + val2 + " = " + answer);
	}
	
	public void minus(int val1, int val2) {
		int answer = val1 - val2;
		System.out.println("minus() :: " + val1 + " - " + val2 + " = " + answer);
	}
	
	public void multiply(int val1, int val2) {
		int answer = val1 * val2;
		System.out.println("multiply() :: " + val1 + " * " + val2 + " = " + answer);
	}
	
	public void divide(int val1, int val2) {
		int answer = val1 / val2;
		System.out.println("divide() :: " + val1 + " / " + val2 + " = " + answer);
	}
	
	public void rest(int val1, int val2) {
		int answer = val1 % val2;
		System.out.println("rest() :: " + val1 + " % " + val2 + " = " + answer);
	}

}
