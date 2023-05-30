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
		DecimalFormat df = new DecimalFormat("#,###");
		String result = df.format(getPrice());
		System.out.print(" | 가격=" + result);
		System.out.println(" | 원두=" + type);
	}

}
