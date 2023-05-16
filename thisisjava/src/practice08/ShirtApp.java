package practice08;

public class ShirtApp {

	public static void main(String[] args) {
		
		Shirt s1 = new Shirt();
		
		s1.setName("코튼/린넨 버튼 다운 셔츠");
		s1.setColor("White");
		s1.setCompany("Wow");
		s1.setMaterials("면 50%, 마 50%");
		s1.setSize("L");
		s1.setPrice(35000);
		s1.printInfo();
		
		Shirt s2 = new Shirt("린넨 밴드칼라 하프 플라켓 셔츠", "black", 25000);
		
		s2.setCompany("Wow");
		s2.setMaterials("면 50%, 마 50%");
		s2.setSize("L");
		s2.printInfo();
		
		Shirt s3 = new Shirt("코튼/린넨 버튼 다운 셔츠", "blue", "Wow", "면 50%, 마 50%", "M", 30000);
		s3.printInfo();

	}

}
