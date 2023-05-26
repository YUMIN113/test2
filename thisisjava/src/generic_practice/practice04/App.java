package generic_practice.practice04;

public class App {

	public static void main(String[] args) {
		
		Biz<Integer> biz1 = new Biz<>();
		biz1.setData(10);
		System.out.println(biz1.getData());
		
		Biz<String> biz2 = new Biz<>();
		biz2.setData("hello");
		System.out.println(biz2.getData());
		
		Biz<String> biz3 = new Biz<>();
		biz3.setData("world");
		System.out.println(biz3.getData());
		
	}

}
