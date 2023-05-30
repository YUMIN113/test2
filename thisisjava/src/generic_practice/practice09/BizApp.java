package generic_practice.practice09;

public class BizApp {

	public static void main(String[] args) {


		System.out.println("===== Class : new Biz<Cat>(new Cat()) =====");
		Biz<Cat> bizCat1 = new Biz<>(new Cat());
		Cat cat1 = bizCat1.getT();
		cat1.printInfo();
		
		System.out.println("\n===== Class : new Biz<Eagle>(new Eagle()) =====");
		Biz<Eagle> bizEagle1 = new Biz<>(new Eagle());
		Eagle eagle1 = bizEagle1.getT();
		eagle1.printInfo();

		System.out.println("\n===== Class : new Biz<Cat>(new Cat()) =====");
		Biz<Cat> bizCat2 = new Biz<>(new Cat());
		Eagle eagle2 = bizCat2.biz(new Eagle());
		eagle2.printInfo();
	}

}
