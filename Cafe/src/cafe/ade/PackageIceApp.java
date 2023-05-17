package cafe.ade;

import cafe.coffee.*;
import cafe.coffee.ice.*;

public class PackageIceApp {

	public static void main(String[] args) {
		
		System.out.println("===== Package =====");
		Americano ame = new Americano();
		ame.printInfo();
		
		System.out.println("\n===== Sub-Package =====");
		IceAmericano iceAme = new IceAmericano();
		iceAme.printInfo();
	}

}
