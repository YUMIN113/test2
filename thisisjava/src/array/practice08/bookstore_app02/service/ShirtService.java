package array.practice08.bookstore_app02.service;

import array.practice08.bookstore_app02.domain.Shirt;

public class ShirtService {
	
	public static Shirt makeService(String shirtName, String shirtColor, String shirtCompany, String shirtMaterials, String shirtSize, int shirtPrice) {
		return new Shirt(shirtName, shirtColor, shirtCompany, shirtMaterials, shirtSize, shirtPrice);
	}

}
