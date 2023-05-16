package practice12;

public class KartApp {

	public static void main(String[] args) {
		
		Kart kart = new Kart("버스트", "Green");
		
		System.out.println("===== READY =====");
		kart.printKartInfo();
		
		System.out.println("\n===== RUN =====");
		kart.speedUp();
		kart.speedUp();
		kart.pickupBooster();
		kart.pickupBooster();
		kart.useBooster();
		kart.useBooster();
		kart.speedDown();
		kart.speedDown();

	}

}
