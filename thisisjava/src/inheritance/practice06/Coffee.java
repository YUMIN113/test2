package inheritance.practice06;

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
		System.out.println();
		System.out.println("===== Coffee Info =====");
		System.out.print("메뉴=" + getName());
		System.out.print(" | 가격=" + getPrice());
		System.out.println(" | 원두=" + type);
	}

}
