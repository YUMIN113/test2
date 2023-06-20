package stream.practice22;

import java.util.Arrays;
import java.util.List;

public class DishUtil {

	public static final List<Dish> getMenu() {

		List<Dish> menu = Arrays.asList(
				new Dish("갈비찜", false, 531, Type.MEAT),
				new Dish("불고기", false, 471, Type.MEAT), 
				new Dish("산적", false, 653, Type.MEAT),
				new Dish("떡국", false, 440, Type.OTHER), 
				new Dish("잡채", false, 191, Type.OTHER),
				new Dish("취나물무침", true, 30, Type.OTHER), 
				new Dish("배추김치", true, 25, Type.OTHER),
				new Dish("고등어구이", false, 302, Type.FISH), 
				new Dish("갈치구이", false, 450, Type.FISH));

		return menu;
	}

}
