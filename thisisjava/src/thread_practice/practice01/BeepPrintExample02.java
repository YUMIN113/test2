package thread_practice.practice01;

public class BeepPrintExample02 {

	public static void main(String[] args) {
		
		Thread thread = new Thread() {
			
			@Override
			public void run() {

				for(int i = 0; i < 5; i++) {
					System.out.println("웅");
					
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
				}
			}
		};
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}

	}

}
