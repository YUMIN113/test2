package stream.practice08;

import java.util.stream.IntStream;

public class App_1To10 {

	public static void main(String[] args) {

		System.out.println("===== Java =====");
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}

		System.out.println("\n\n===== Stream =====");

		IntStream.range(0, 10).forEach(it -> System.out.print(it));


		System.out.println("\n\n----- Method Reference -----");
		
		IntStream.range(0, 10).forEach(System.out::print);
		
	}

}
