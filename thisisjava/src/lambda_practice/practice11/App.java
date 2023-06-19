package lambda_practice.practice11;

public class App {

	public static void main(String[] args) {
		
		System.out.println("===== Java =====");
		
		Addable a1 = new Addable() {
			@Override
			public int add(int i, int j) {
				int add = i + j;
				return add;
			}
		};
		int add1 = a1.add(1,  2);
		System.out.println("i + j=" + add1);
		
		System.out.println("\n===== Lambda =====");
		
		System.out.println("\n----- Type 1. -----");
		
		Addable a2 = (int i, int j) -> {
			return i + j;
		};
		int add2 = a2.add(1,  2);
		System.out.println("i + j=" + add2);
		
		System.out.println("\n----- Type 2. -----");
		
		Addable a3 = (int i, int j) -> (i + j);
		int add3 = a3.add(1,  2);
		System.out.println("i + j=" + add3);
		
	}

}
