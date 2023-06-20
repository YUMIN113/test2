package stream.practice13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapApp {

	public static void main(String[] args) {

		System.out.println("===== Stream.map() =====");
		// # map()
		// - 조건에 해당하는 값으로 변환
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Stream<Integer> stream = list.stream().map(item -> item * 10);
		stream.forEach(item -> System.out.print(item + " "));
		
				
		System.out.println("\n===== Stream.filter().map() =====");
		Stream<Integer> stream2 = list.stream().filter(item -> item % 2 == 0).map(item -> item * 10);
		stream2.forEach(a -> System.out.print(a + " "));

	}

}