package anonymous_practice.practice05;

public class App {

	public static void main(String[] args) {

		System.out.println("===== Variable =====");
		System.out.println("\n----- implements Interface -----");
		Designer designer = new Designer();
		designer.work();
		
		Programmer programmer = new Programmer();
		programmer.work();

		System.out.println("\n----- Anonymous -----");
		Job designer1 = new Job() {
			@Override
			public void work() {
				System.out.println("디자이너");
				
			}
		};
		designer1.work();
		
		Job programmer1 = new Job() {
			@Override
			public void work() {
				System.out.println("프로그래머");
				
			}
		};
		programmer1.work();
		
		System.out.println("\n----- Lambda -----");
		
		Job designer2 = () -> {
			System.out.println("디자이너");
		};
		designer2.work();
		
		Job programmer2 = () -> {
			System.out.println("프로그래머");
		};
		programmer2.work();

		System.out.println("\n===== Method =====");
		System.out.println("\n----- implements Interface -----");
		Biz b = new Biz();
		b.biz(designer);
		b.biz(programmer);


		System.out.println("\n----- Anonymous -----");
		b.biz(designer1);
		b.biz(programmer1);
		
		b.biz(new Job() {
			@Override
			public void work() {
				System.out.println("가수");
			}
		});

		System.out.println("\n----- Lambda -----");
		b.biz(() -> {
			System.out.println("유튜버");
		});
		
		b.biz(() -> {
			System.out.println("PD");
		});
	}

}
