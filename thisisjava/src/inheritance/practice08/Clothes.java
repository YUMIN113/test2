package inheritance.practice08;

public class Clothes {

	private String product;
	private String color;
	private String company;
	
	public Clothes(String product, String color, String company) {
		this.product = product;
		this.color = color;
		this.company = company;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public void printInfo() {
		System.out.println("===== Clothes Info =====");
		System.out.print("제품=" + product);
		System.out.print(" | 색상=" + color);
		System.out.println(" | 제조사=" + company);
		System.out.println();
	}
}
