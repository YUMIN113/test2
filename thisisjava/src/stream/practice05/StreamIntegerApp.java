package stream.practice05;

import java.util.ArrayList;
import java.util.List;

public class StreamIntegerApp {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("===== Stream =====");
		list.stream().forEach(it -> System.out.print(it + " "));
	}

}
