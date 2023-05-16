package practice08;

public class Shirt {
	
	private String name;
	private String color;
	private String company;
	private String materials;
	private String size;
	private int price;
	
	
	public Shirt() {}


	public Shirt(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}


	public Shirt(String name, String color, String company, String materials, String size, int price) {
		super();
		this.name = name;
		this.color = color;
		this.company = company;
		this.materials = materials;
		this.size = size;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public String getMaterials() {
		return materials;
	}


	public void setMaterials(String materials) {
		this.materials = materials;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void printInfo() {
		System.out.println();
		System.out.println("===== Shirt Info =====");
		System.out.println("이름 : " + this.getName());
		System.out.println("컬러 : " + this.getColor());
		System.out.println("회사 : " + this.getCompany());
		System.out.println("소재 : " + this.getMaterials());
		System.out.println("사이즈 : " + this.getSize());
		System.out.println("가격 : " + this.getPrice());
	}
	
	
	
}
