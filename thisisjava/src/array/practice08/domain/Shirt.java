package array.practice08.domain;

public class Shirt {
	
	private String shirtName;
	private String shirtColor;
	private String shirtCompany;
	private String shirtMaterials;
	private String shirtSize;
	private int shirtPrice;
	
	
	public Shirt(String shirtName, String shirtColor, String shirtCompany, String shirtMaterials, String shirtSize, int shirtPrice) {
		this.shirtName = shirtName;
		this.shirtColor = shirtColor;
		this.shirtCompany = shirtCompany;
		this.shirtMaterials = shirtMaterials;
		this.shirtSize = shirtSize;
		this.shirtPrice = shirtPrice;
	}


	public String getShirtName() {
		return shirtName;
	}

	public void setShirtName(String shirtName) {
		this.shirtName = shirtName;
	}

	public String getShirtColor() {
		return shirtColor;
	}

	public void setShirtColor(String shirtColor) {
		this.shirtColor = shirtColor;
	}

	public String getShirtCompany() {
		return shirtCompany;
	}

	public void setShirtCompany(String shirtCompany) {
		this.shirtCompany = shirtCompany;
	}

	public String getShirtMaterials() {
		return shirtMaterials;
	}

	public void setShirtMaterials(String shirtMaterials) {
		this.shirtMaterials = shirtMaterials;
	}

	public String getShirtSize() {
		return shirtSize;
	}

	public void setShirtSize(String shirtSize) {
		this.shirtSize = shirtSize;
	}

	public int getShirtPrice() {
		return shirtPrice;
	}

	public void setShirtPrice(int shirtPrice) {
		this.shirtPrice = shirtPrice;
	}
	
}
