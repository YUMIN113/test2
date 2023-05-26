package generic_practice.practice05;

public class Coffee extends Menu {

	private String bean; // 원두명

	public Coffee(String name, int price, String bean) {
		super(name, price);
		this.bean = bean;
	}

	public String getBean() {
		return bean;
	}

	public void setBean(String bean) {
		this.bean = bean;
	}

	public void printInfo() {
		System.out.print("메뉴=" + getName());
		System.out.print(" | 가격=" + getPrice());
		System.out.println(" | 원두=" + bean);
	}

}