package stream.practice14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapStringApp {

	public static void main(String[] args) {

		System.out.println("===== Stream.map() =====");

		List<String> list = Arrays.asList("Paige", "James", "Smith", "Tom", "Victoria");

		System.out.println("\n----- String.toUpperCase() -----");

		// Type 1.
		Stream<String> stream = list.stream().map(item -> item.toUpperCase());
		stream.forEach(a -> System.out.print(a + " "));

		// Type 2. Lambda(메서드 참조)
//		Stream<String> stream = list.stream().map(String::toUpperCase);
//		stream.forEach(a -> System.out.print(a + " "));

		System.out.println("\n\n----- String.valueOf() -----");

		list = Arrays.asList("1", "2", "3", "4", "5");

		Stream<Integer> stream2 = list.stream().map(item -> Integer.valueOf(item));
		stream2.forEach(a -> System.out.print(a + " "));

//		list.stream().map(Integer::valueOf).forEach(it -> System.out.print(it + " "));
//		System.out.println();
//		list.stream().mapToInt(Integer::valueOf).forEach(it -> System.out.print(it + " "));
	}

}