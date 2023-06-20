package stream.practice23;

import java.util.Arrays;
import java.util.List;

public class DishUtil {

	public static final List<Dish> getMenu() {

		List<Dish> menu = Arrays.asList(
				new Dish("갈비찜", 531),
				new Dish("불고기", 471), 
				new Dish("산적", 653),
				new Dish("떡국", 440), 
				new Dish("잡채", 191),
				new Dish("취나물무침", 30), 
				new Dish("배추김치", 25),
				new Dish("고등어구이", 302), 
				new Dish("갈치구이", 450));

		return menu;
	}

}
