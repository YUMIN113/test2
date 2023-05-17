package practice18;

public class Car {
	
	private String name;
	private String color;
	private int door;
	private int maxSpeed;
	private Company company;
	
	public Car(String name, String color, int door, int maxSpeed, Company company) {
		this.name = name;
		this.color = color;
		this.door = door;
		this.maxSpeed = maxSpeed;
		this.company = company;
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

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public void printInfo() {
		System.out.println("자동차명=" + name);
		System.out.println("색상=" + color);
		System.out.println("문개수=" + door);
		System.out.println("최대속력=" + maxSpeed);
		System.out.println("----- Company Info -----");
		this.company.printInfo();
	}
	
	
	
	

}
