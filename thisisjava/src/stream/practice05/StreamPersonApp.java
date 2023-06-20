package stream.practice05;

import java.util.ArrayList;
import java.util.List;


public class StreamPersonApp {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Paige", 20));
		list.add(new Person("James", 30));
		list.add(new Person("Smith", 40));

		System.out.println("===== Stream =====");
		list.stream().forEach(it -> {
			System.out.print(it + " ");
			it.printInfo();
		});
	}
}
