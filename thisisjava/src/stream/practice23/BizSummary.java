package stream.practice23;

import java.util.List;

public class BizSummary {
	

	public static long howManyDishes(List<Dish> menu) {
		System.out.println("\n----- howManyDishes() -----");
		return menu.stream().count();
	}
	
	public static int getTotalCalory(List<Dish> menu) {
		System.out.println("\n----- getTotalCalory() -----");
		return menu.stream().map(it -> it.getKcal()).reduce(0, (x, y) -> x + y);
	}
	
//	public static double getAverageCalory(List<Dish> menu) {
//		System.out.println("\n----- getAverageCalory() -----");
//		return menu.stream()
//				.map(it -> it.getKcal())
//				
//				
//	}
	
//	public static String getDishNameWithComma(List<Dish> menu) {
//		menu.stream().forEach();
//	}
	
}
