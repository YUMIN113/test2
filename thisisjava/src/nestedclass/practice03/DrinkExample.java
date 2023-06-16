package nestedclass.practice03;

public class DrinkExample {

	public static void main(String[] args) {
		System.out.println("===== Outer Class =====");
		Drink drink = new Drink("Water");
		drink.printInfo();

		System.out.println("\n===== Inner Class =====");
		Drink.Coffee coffee = drink.new Coffee("아메리카노");
		coffee.printInfo();
		
		coffee.printAllInfo();
	}

}
