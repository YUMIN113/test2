package practice04.mobilephone2;

public class MobilePhone {
	
	private String company;
	private String product;
	private String os;
	private String color;
	private boolean pen;
	private int memory;
	private int storage;
	private int battery;
	
	
	
	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getProduct() {
		return product;
	}



	public void setProduct(String product) {
		this.product = product;
	}



	public String getOs() {
		return os;
	}



	public void setOs(String os) {
		this.os = os;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public boolean isPen() {
		return pen;
	}



	public void setPen(boolean pen) {
		this.pen = pen;
	}



	public int getMemory() {
		return memory;
	}



	public void setMemory(int memory) {
		this.memory = memory;
	}



	public int getStorage() {
		return storage;
	}



	public void setStorage(int storage) {
		this.storage = storage;
	}



	public int getBattery() {
		return battery;
	}



	public void setBattery(int battery) {
		this.battery = battery;
	}



	public void printInfo() {
		System.out.println();
		System.out.println("===== Mobile Phone Info =====");
		System.out.println("회사 : " + this.getCompany());
		System.out.println("제품 : " + this.getProduct());
		System.out.println("운영체제 : " + this.getOs());
		System.out.println("컬러 : " + this.getColor());
		System.out.println("펜 : " + ((this.isPen() == true) ? "지원" : "미지원"));
		System.out.println("메모리 : " + this.getMemory() + " (GB)");
		System.out.println("스토리지 : " + this.getStorage() + " (GB)");
		System.out.println("배터리 : " + this.getBattery() + " (mAh)");
	}

}
