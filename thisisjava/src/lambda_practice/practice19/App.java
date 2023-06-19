package lambda_practice.practice19;

public class App {

	public static void main(String[] args) {
		System.out.println("\n===== Java =====");
		Conversion c1 = new Conversion() {
			@Override
			public int stringToInt(String s) {
				return Integer.parseInt(s);
			}
		};
		
		int result1 = c1.stringToInt("10");
		System.out.println(result1);
		
		System.out.println("\n===== Lambda =====");
		
		System.out.println("\n----- Type 1 -----");
		
		Conversion c2 = (s) -> {
			return Integer.parseInt(s);
		};
		
		int result2 = c2.stringToInt("20");
		System.out.println(result2);
		
		System.out.println("\n----- Type 2 -----");
		Conversion c3 = (s) -> Integer.parseInt(s);
		
		int result3 = c3.stringToInt("30");
		System.out.println(result3);
		
		System.out.println("\n----- Type 3 : Method Reference -----");
		Conversion c4 = Integer::parseInt;
		
		int result4 = c4.stringToInt("40");
		System.out.println(result4);

	}

}
