package stream.practice11;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		System.out.println("===== Java =====");
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Paige", 20));
		list.add(new Person("James", 30));
		list.add(new Person("Smith", 40));
		list.add(new Person("Tom", 50));
		list.add(new Person("Victoria", 60));

		System.out.println("\n===== Stream.filter() =====");

		System.out.println("\n----- 1. -----");
		// 이름이 "James"

		list.stream().filter(it -> it.getName().equals("James")).forEach(it -> it.printInfo());

		System.out.println("\n----- 2. -----");
		//  30세 이상
		
		list.stream().filter(it -> it.getAge() >= 30).forEach(it -> it.printInfo());
	
		System.out.println("\n----- 3. -----");
		//  60세 미만이고, 이름에 "a" 포함
		
		list.stream().filter(it -> it.getAge() < 60 && it.getName().contains("a")).forEach(it -> it.printInfo());

		
	    }
				
	}


