package lambda_practice.practice17;

public class Car {

	private String name; // 자동차
	private String company; // 제조사

	public Car() {
		System.out.println("Car()");
	}

	public Car(String name) {
		this.name = name;
		System.out.println("Car(String name)");
	}

	public Car(String name, String company) {
		this.name = name;
		this.company = company;
		System.out.println("Car(String name, String company)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void pirntInfo() {
		System.out.print("이름=" + name);
		System.out.println(" | 제조사=" + company);
	}
}
