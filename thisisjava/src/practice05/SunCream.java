package practice05;

public class SunCream {
	
	private String company;
	private String product;
	private boolean isSticky;
	private char skinType;
	private int volume; 
	private int spf;
	private String pa;
	
	
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
	public boolean isSticky() {
		return isSticky;
	}
	public void setSticky(boolean isSticky) {
		this.isSticky = isSticky;
	}
	public char getSkinType() {
		return skinType;
	}
	public void setSkinType(char skinType) {
		this.skinType = skinType;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getSpf() {
		return spf;
	}
	public void setSpf(int spf) {
		this.spf = spf;
	}
	public String getPa() {
		return pa;
	}
	public void setPa(String pa) {
		this.pa = pa;
	}
	
	public void printInfo() {
		System.out.println();
		System.out.println("===== SunCream Info =====");
		System.out.println("회사 : " + this.getCompany());
		System.out.println("제품 : " + this.getProduct());
		System.out.println("끈적임 " + ((this.isSticky() == true) ? "있음" : "없음"));
		System.out.println("피부타입 : " + this.checkSkinType(this.getSkinType()));
		System.out.println("용량 : " + this.getVolume() + "(ml)");
		System.out.println("SPF : " + this.getSpf());
		System.out.println("PA : " + this.getPa());
	}
	
	private String checkSkinType(char skinType) {
		String value = " ";
		
		switch(skinType) {
		case 's' :
			value = "민감성";
			break;
			
		case 'o' :
			value = "지성";
			break;
			
		case 'n' :
			value = "중성";
			break;
			
		case 'd' :
			value = "건성";
			break;
		}
		
		return value;
	}
}
	
	

