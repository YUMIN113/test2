package practice04.mobilephone1;

public class MobilePhone {
	
	String company;
	String product;
	String os;
	String color;
	boolean pen;
	int memory;
	int storage;
	int battery;
	
	public void printInfo() {
		System.out.println();
		System.out.println("===== Mobile Phone Info =====");
		System.out.println("회사 : " + this.company);
		System.out.println("제품 : " + this.product);
		System.out.println("운영체제 : " + this.os);
		System.out.println("컬러 : " + this.color);
		System.out.println("펜 : " + ((this.pen == true) ? "지원" : "미지원"));
		System.out.println("메모리 : " + this.memory + " (GB)");
		System.out.println("스토리지 : " + this.storage + " (GB)");
		System.out.println("배터리 : " + this.battery + " (mAh)");
	}

}
