package stream.practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
 		
		IntStream.rangeClosed(1, 5).forEach(it -> list.add(new Product(it, "상품" + it, "멋진 회사", (int)(10000*Math.random()))));
		
		list.stream().forEach(System.out::println);

	}

}
