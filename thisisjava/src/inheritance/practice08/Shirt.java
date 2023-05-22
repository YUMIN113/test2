package inheritance.practice08;

public class Shirt extends Clothes {

	private String type;
	private String size;
	
	public Shirt(String product, String color, String company, String type, String size) {
		super(product, color, company);
		this.type = type;
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public void printInfo() {
		System.out.println("===== Shirt Info =====");
		System.out.print("제품명=" + getProduct());
		System.out.print(" | 색상=" + getColor());
		System.out.print(" | 제조사=" + getCompany());
		System.out.print(" | 소매유형=" + type);
		System.out.println(" | 크기=" + size);
		System.out.println();
	}
	
}
