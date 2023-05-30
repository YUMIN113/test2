package collection_practice.list_practice.practice02;

import java.text.DecimalFormat;

public class Ade extends Menu {

	private String material;

	public Ade(String name, int price, String material) {
		super(name, price);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void printInfo() {
		System.out.print("메뉴=" + getName());
		System.out.print(" | 가격=" + toDecimalFormat(getPrice()));
		System.out.println(" | 재료=" + material);
	}
	
	private String toDecimalFormat(int price) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(price);
	}
	
}
