package collection_practice.list_practice.practice02;

import java.text.DecimalFormat;

public class Coffee extends Menu {

	private String type;

	public Coffee(String name, int price, String type) {
		super(name, price);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void printInfo() {
		System.out.print("메뉴=" + getName());
		System.out.print(" | 가격=" + toDecimalFormat(getPrice()));
		System.out.println(" | 원두=" + type);
	}
	
	private String toDecimalFormat(int price) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(price);
	}

}
