package stream.practice15;

import java.util.Arrays;

public class MapExample {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		Arrays.stream(intArray).asDoubleStream().forEach(System.out::println);
		System.out.println();
		
		Arrays.stream(intArray).boxed().forEach(it -> System.out.println(it.intValue()));

	}

}
