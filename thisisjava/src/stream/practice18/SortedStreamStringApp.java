package stream.practice18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedStreamStringApp {

	public static void main(String[] args) {

		System.out.println("===== sorted() =====");	
		
		List<String> list = Arrays.asList("Paige", "James", "Smith", "Tom", "Victoria");

		System.out.println("\n----- sorted() -----");
		Stream<String> stream1 = list.stream();
		Stream<String> stream2 = stream1.sorted(); // 오름차순
		stream2.forEach(a -> System.out.print(a + " "));

		System.out.println("\n\n----- sorted(Comparator.reverseOrder()) -----");
		Stream<String> stream11 = list.stream();
		Stream<String> stream12 = stream11.sorted(Comparator.reverseOrder()); // 내림차순
		stream12.forEach(a -> System.out.print(a + " "));

		System.out.println("\n\n----- length : 오름차순 -----");
		Stream<String> stream21 = list.stream();
		Stream<String> stream22 = stream21.sorted(Comparator.comparing(item -> item.length())); // 오름차순
		stream22.forEach(a -> System.out.print(a + " "));

		System.out.println("\n\n----- length : 내림차순 -----");
		Stream<String> stream31 = list.stream();
		Stream<String> stream32 = stream31.sorted(Comparator.comparing(String::length).reversed()); // 내림차순
		stream32.forEach(a -> System.out.print(a + " "));
	}

}
