package thread_practice.practice02;

public class SleepExample {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			System.out.println("웅");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}

}
