package cafe.ade;

//import cafe.*; ERROR!
import cafe.coffee.*;

public class PackageCoffeeAllApp {

	public static void main(String[] args) {

		System.out.println("===== Other Package =====");
		Americano ame = new Americano();
		ame.printInfo();
		
		CafeLatte latte = new CafeLatte();
		latte.printInfo();

	}

}
