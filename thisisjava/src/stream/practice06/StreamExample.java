package stream.practice06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamExample {

	public static void main(String[] args) {
		String[] strArray = {"홍길동", "신용권", "김미나"};
		Arrays.stream(strArray).forEach(it -> System.out.print(it + ","));
		System.out.println();
		
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(it -> System.out.print(it + ","));
	}

}
