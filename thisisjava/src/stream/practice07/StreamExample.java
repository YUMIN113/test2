package stream.practice07;

import java.util.stream.IntStream;

public class StreamExample {
	
	public static int sum;

	public static void main(String[] args) {
		
		IntStream.rangeClosed(1,  100).forEach(it -> sum += it);
		
		System.out.println("총합: " + sum);

	}

}
