package collection_practice.list_practice.practice02;

public class Menu {

	private String name;
	private int price;
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println();
		System.out.println("===== Menu Info =====");
		System.out.print("메뉴=" + name);
		System.out.println(" | 가격=" + price);
	}
}
