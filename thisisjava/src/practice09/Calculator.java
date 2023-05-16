package practice09;

public class Calculator {
	
	private int val1;
	private int val2;
	
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}
	
	public void plus() {
		int answer = val1 + val2;
		System.out.println("plus() :: " + this.getVal1() + " + " + this.getVal2() + " = " + answer);
	}
	
	public void minus() {
		int answer = val1 - val2;
		System.out.println("minus() :: " + this.getVal1() + " - " + this.getVal2() + " = " + answer);
	}
	
	public void multiply() {
		int answer = val1 * val2;
		System.out.println("multiply() :: " + this.getVal1() + " * " + this.getVal2() + " = " + answer);
	}
	
	public void divide() {
		int answer = val1 / val2;
		System.out.println("divide() :: " + this.getVal1() + " / " + this.getVal2() + " = " + answer);
	}
	
	public void rest() {
		int answer = val1 % val2;
		System.out.println("rest() :: " + this.getVal1() + " % " + this.getVal2() + " = " + answer);
	}
	
	public void printInfo() {
		System.out.println();
		System.out.println("===== printInfo() =====");
		System.out.println("val1 = " + this.getVal1() + " val2 = " + this.getVal2());
	}
	
	public void clear() {
		this.setVal1(0);
		this.setVal2(0);
	}

}
