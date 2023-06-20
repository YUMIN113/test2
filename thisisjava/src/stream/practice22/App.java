package stream.practice22;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Dish> menu = DishUtil.getMenu();
		
		Biz.viewMenu(menu);
		Biz.viewHighCaloriesMenu(menu);
		Biz.viewLowCaloriesMenu(menu);
		Biz.viewFishMenu(menu);
		Biz.viewMeatMenu(menu);
		Biz.viewVegetarianMenu(menu); 
	}
}
