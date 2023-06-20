package stream.practice16;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		System.out.println("===== Stream.flatMap() =====");
		/**
		 # flatMap()
		 	- 다차원을 1차원으로 평면화
		 */

		String[][] arrays = new String[][] { { "a1", "a2" }, { "b1", "b2" }, { "c1", "c2", "c3" } };

		System.out.println("\n----- Stream -----");
		Stream<String[]> stream1 = Arrays.stream(arrays); // Stream<String[])
		stream1.forEach(item -> System.out.println(item));// 배열 객체 출력

		System.out.println("\n----- Stream.flatMap() -----");
		Stream<String[]> stream2 = Arrays.stream(arrays); // Stream<String[])
		Stream<String> stream3 = stream2.flatMap(item -> Arrays.stream(item)); // Stream<String>
		stream3.forEach(item -> System.out.println(item));

	}

}
