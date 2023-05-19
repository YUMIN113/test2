package array.practice08.service;

import array.practice08.domain.Shirt;

public class ShirtService {
	
	public static Shirt makeService(String shirtName, String shirtColor, String shirtCompany, String shirtMaterials, String shirtSize, int shirtPrice) {
		return new Shirt(shirtName, shirtColor, shirtCompany, shirtMaterials, shirtSize, shirtPrice);
	}

}
