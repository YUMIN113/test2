package thread_practice.practice01;

public class BeepPrintExample01 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("웅");
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}

	}

}
