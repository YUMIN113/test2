package stream.practice23;

import java.util.List;
import java.util.stream.Collectors;

public class BizSummary {
	

	public static final long howManyDishes(List<Dish> menu) {
		System.out.println("\n----- howManyDishes() -----");
		return menu.stream()
				.count();
	}
	
	public static final int getTotalCalory(List<Dish> menu) {
		System.out.println("\n----- getTotalCalory() -----");
		return menu.stream()
				.map(it -> it.getCalories())
				.reduce(0, (x, y) -> x + y);
	}
	
	public static final double getAverageCalory(List<Dish> menu) {
		System.out.println("\n----- getAverageCalory() -----");
		return menu.stream()
				.mapToDouble(it -> it.getCalories())
				.average()
				.orElse(0);
	}
	
	public static final Dish getMostCaloricDish(List<Dish> menu) {
		System.out.println("\n----- getMostCaloricDish() -----");
		return menu.stream()
				.max((s1, s2) -> Integer.compare(s1.getCalories(), s2.getCalories()))
				.get();
	}
	
	public static final Dish getLeastCaloricDish(List<Dish> menu) {
		System.out.println("\n----- getLeastCaloricDish() -----");
		return menu.stream()
				.min((s1, s2) -> Integer.compare(s1.getCalories(), s2.getCalories()))
				.get();
	}
	
	public static String getDishNameWithComma(List<Dish> menu) {
		System.out.println("\n----- getDishNameWithComma() -----");
		return menu.stream()
				.map(it -> it.getName())
				.collect(Collectors.joining(","));
	}
	
}
