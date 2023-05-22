package inheritance.practice08;

public class ClothesApp {

	public static void main(String[] args) {


		Clothes c = new Clothes("패딩", "White", "버커루");
		c.printInfo();
		
		Shirt s = new Shirt("코튼/린넨 셔츠", "blue", "마인드 브릿지", "긴소매", "L");
		s.printInfo();
		
		Pants p = new Pants("링클프리 팬츠", "black", "지오다노", "긴바지");
		p.printInfo();

	}

}
