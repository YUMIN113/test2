package stream.practice05;

import java.util.ArrayList;
import java.util.List;

public class StreamStringApp {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Paige");
		list.add("James");
		list.add("Smith");
		list.add("Tom");
		list.add("Victoria");

		System.out.println("===== Stream =====");
		list.stream().forEach(it -> System.out.print(it + " "));

	}

}
