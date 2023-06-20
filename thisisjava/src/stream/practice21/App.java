package stream.practice21;

import java.util.Arrays;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(
				new Apple(200, Color.GREEN),
				new Apple(180, Color.RED),
				new Apple(120, Color.RED),
				new Apple(80, Color.GREEN),
				new Apple(155, Color.GREEN));
		
		System.out.println("\n===== 녹색 사과(정렬:무게) =====");
		inventory.stream()
		.filter(it -> it.getColor() == Color.GREEN)
		.sorted((s1, s2) -> Integer.compare(s1.getWeight(), s2.getWeight()))
		.forEach(Apple::printInfo);
	    
		System.out.println("\n===== 무거운 사과(정렬:무게) =====");
		System.out.println("* 기준 : 무게가 150 이상");
		
		inventory.stream()
		.filter(it -> it.getWeight() >= 150)
		.sorted((s1, s2) -> Integer.compare(s1.getWeight(), s2.getWeight()))
		.forEach(Apple::printInfo);
		
		System.out.println("\n===== 무거운 빨간 사과 =====");
		inventory.stream()
		.filter(it -> it.getColor() == Color.RED && it.getWeight() >= 150)
		.forEach(Apple::printInfo);

	}

}
