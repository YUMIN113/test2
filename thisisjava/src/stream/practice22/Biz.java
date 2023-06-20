package stream.practice22;

import java.util.List;

public class Biz {

	public static void viewMenu(List<Dish> menu) {
		System.out.println("===== 메뉴 : 전체 =====");
		menu.stream().forEach(it -> it.printInfo());
	}
	
	public static void viewHighCaloriesMenu(List<Dish> menu) {
		System.out.println("\n===== 메뉴 : 고열량(500 이상) =====");
		menu.stream()
		.filter(it -> it.getKcal() >= 500)
		.sorted((s1, s2) -> Integer.compare(s1.getKcal(), s2.getKcal()))
		.forEach(it -> it.printInfo());
	}
	
	public static void viewLowCaloriesMenu(List<Dish> menu) {
		System.out.println("\n===== 메뉴 : 저열량(300 미만) =====");
		menu.stream()
		.filter(it -> it.getKcal() < 300)
		.sorted((s1, s2) -> Integer.compare(s1.getKcal(), s2.getKcal()))
		.forEach(it -> it.printInfo());
	}
	
	public static void viewFishMenu(List<Dish> menu) {
		System.out.println("\n===== 메뉴 : 생선 =====");
		menu.stream()
		.filter(it -> it.getType().equals(Type.FISH))
		.sorted((s1, s2) -> Integer.compare(s1.getKcal(), s2.getKcal()))
		.forEach(it -> it.printInfo());
	}
	
	public static void viewMeatMenu(List<Dish> menu) {
		System.out.println("\n===== 메뉴 : 고기 =====");
		menu.stream()
		.filter(it -> it.getType().equals(Type.MEAT))
		.forEach(it -> it.printInfo());
	}
	
	public static void viewVegetarianMenu(List<Dish> menu) {
		System.out.println("\n===== 채식 메뉴 =====");
		menu.stream()
		.filter(it -> it.isVegetarian() == true)
		.sorted((s1, s2) -> Integer.compare(s1.getKcal(), s2.getKcal()))
		.forEach(it -> it.printInfo());
	}
}
