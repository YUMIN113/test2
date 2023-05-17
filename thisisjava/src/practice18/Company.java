package practice18;

public class Company {

	private String companyName;
	private String address;
	private String phone;
	
	public Company(String companyName, String address, String phone) {
		this.companyName = companyName;
		this.address = address;
		this.phone = phone;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void printInfo() {
		
		System.out.println("회사명=" + companyName);
		System.out.println("주소=" + address);
		System.out.println("전화번호=" + phone);

	}
	
	
}
