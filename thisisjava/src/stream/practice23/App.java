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
		
		double averageCalory = BizSummary.getAverageCalory(menu);
		System.out.println("Calory : " + averageCalory + "(kcal)");
		
		Dish mostCaloricDish = BizSummary.getMostCaloricDish(menu);
		System.out.println("Dish : " + mostCaloricDish.getName() + " | " + mostCaloricDish.getCalories() + "(kcal)");
        	
		Dish leastCaloricDish = BizSummary.getLeastCaloricDish(menu);
		System.out.println("Dish : " + leastCaloricDish.getName() + " | " + leastCaloricDish.getCalories() + "(kcal)");
	
		String dishNameWithComma = BizSummary.getDishNameWithComma(menu);
		System.out.println("Name : " + dishNameWithComma);
	}

	
}
