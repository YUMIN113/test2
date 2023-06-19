package lambda_practice.practice09;

public class App {

	public static void main(String[] args) {
		
		System.out.println("===== Java =====");
		
		Addable a1 = new Addable() {
			@Override
			public void add(int i, int j) {
				System.out.println("i + j=" + (i + j));
			}
		};
		a1.add(1,  2);
		
		System.out.println("\n===== Lambda =====");
		
		System.out.println("\n----- Type 1. -----");
		
		Addable a2 = (int i, int j) -> {
			System.out.println("i + j=" + (i + j));
		};
		a2.add(1,  2);
		
		System.out.println("\n----- Type 2. -----");
		
		Addable a3 = (i, j) -> {
			System.out.println("i + j=" + (i + j));
		};
		a3.add(3,  4);
		
	}

}
