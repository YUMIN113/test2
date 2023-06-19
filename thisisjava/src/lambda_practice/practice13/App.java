package lambda_practice.practice13;

public class App {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				while(true) {
					System.out.println("|");
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = () -> {
			while(true) {
				System.out.println("-");
			}
		};
		
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
