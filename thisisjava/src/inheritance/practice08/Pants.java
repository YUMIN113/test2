package inheritance.practice08;

public class Pants extends Clothes {

	private String type;

	public Pants(String product, String color, String company, String type) {
		super(product, color, company);
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
		System.out.println("===== Pants Info =====");
		System.out.print("제품명=" + getProduct());
		System.out.print(" | 색상=" + getColor());
		System.out.print(" | 제조사=" + getCompany());
		System.out.print(" | 바지유형=" + type);
		System.out.println();
	}
	
}
