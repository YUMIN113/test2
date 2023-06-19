package anonymous_practice.practice04;

public class App {

	public static void main(String[] args) {

		System.out.println("===== Variable =====");
		System.out.println("\n----- implements Interface -----");

		Beer beer = new Beer();
		beer.drink();
		
		Soda soda = new Soda();
		soda.drink();
		
		Water water = new Water();
		water.drink();

		System.out.println("\n----- Anonymous -----");
		// 익명 클래스는 Beer, Soda, Water 클래스를 생성하지 않는다.
		
		Drink beer1 = new Drink() {
			@Override
			public void drink() {
				System.out.println("맥주를 마시다.");
			}
		};
		beer1.drink();
		
		Drink soda1 = new Drink() {
			@Override
			public void drink() {
				System.out.println("소다를 마시다.");
			}
		};
		soda1.drink();
		
		Drink water1 = new Drink() {
			@Override
			public void drink() {
				System.out.println("물을 마시다.");
			}
		};
		water1.drink();
		
		System.out.println("\n----- Lambda Expression -----");
		
		Drink beer2 = () -> {
			System.out.println("맥주를 마시다.");
		};
		beer2.drink();
		
		Drink soda2 = () -> {
			System.out.println("소다를 마시다.");
		};
		soda2.drink();
		
		Drink water2 = () -> {
			System.out.println("물을 마시다.");
		};
		water2.drink();
		

		System.out.println("\n===== Method =====");
		System.out.println("\n----- implements Interface -----");



		System.out.println("\n----- Anonymous -----");

		Biz biz = new Biz();
		biz.biz(beer1);
		biz.biz(soda1);
		biz.biz(water1);

		biz.biz(new Drink() {

			@Override
			public void drink() {
				System.out.println("와인을 마시다.");
			}
			
		});
		
		biz.biz(new Drink() {

			@Override
			public void drink() {
				System.out.println("커피를 마시다.");
			}
			
		});

		System.out.println("\n----- Lambda Expression -----");
		
		biz.biz(() -> {
			System.out.println("콜라를 마시다.");
		});
		
		biz.biz(() -> {
			System.out.println("주스를 마시다.");
		});
	}

}
