package cafe.ade;

import cafe.coffee.Americano;

public class PackageCoffeeApp {

	public static void main(String[] args) {
		
		
		System.out.println("===== Same Package =====");
		LemonAde la = new LemonAde();
		OrangeAde oa = new OrangeAde();
		la.printInfo();
		oa.printInfo();
		
		System.out.println("\n===== Other Package =====");
		Americano ame = new Americano();
		ame.printInfo();
		
		System.out.println("\n===== No import =====");
		cafe.coffee.CafeLatte latte = new cafe.coffee.CafeLatte();
		latte.printInfo();

	}

}
