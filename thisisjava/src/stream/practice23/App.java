package stream.practice23;

import java.util.List;

public class App {
	
	public static void main(String[] args) {
		List<Dish> menu = DishUtil.getMenu();
		
		System.out.println("\n===== Summary =====");
		long howManyDishes = BizSummary.howManyDishes(menu);
		System.out.println("Dishes : " + howManyDishes);
		
		int totalCalory = BizSummary.getTotalCalory(menu);
		System.out.println("Calory : " + totalCalory + "(kcal)");
		
	
	}

	
}
