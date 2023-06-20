package stream.practice10;

import java.util.Arrays;
import java.util.List;

public class StreamIntegerFilterApp {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("===== Stream.filter() =====");
		
		list.stream().filter(it -> it % 2 == 0).forEach(it -> System.out.print(it + " "));

	}

}
