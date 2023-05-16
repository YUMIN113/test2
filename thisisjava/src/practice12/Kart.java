package practice12;

public class Kart {

	private String name;
	private String color;
	private int speed;
    private int booster;
    private final int MAX_SPEED = 150;
    private final int SPEED_UP = 40;
    private final int SPEED_DOWN = 80;
    private final int BOOSTER_SPEED_UP = 100;
    private final int MAX_BOOSTER = 1;
    
	public Kart(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void speedUp() {
		speed += SPEED_UP;
		if(speed > MAX_SPEED) {
			speed = MAX_SPEED;
		}
		printState("speedUp");
	}
	
	public void speedDown() {
		speed -= SPEED_DOWN;
		if(speed < 0) {
			speed = 0;
		}
		printState("speedDown");
	}
	
	public void pickupBooster() {
		booster++;
		
		if(booster > MAX_BOOSTER) {
			booster = MAX_BOOSTER;
			
			String warning = " | 부스터를 더 이상 추가할 수 없습니다.";
			printState("pickupBooster", warning);
			
		} else {
			printState("pickupBooster");
		}
	}
	
	public void useBooster() {
		speed += BOOSTER_SPEED_UP;
		
		if(speed > MAX_SPEED) {
			speed = MAX_SPEED;
		}
		
		booster--;
		
		if(booster < 0) {
			booster = 0;
			
			String warning = " | 사용 가능한 부스터가 없습니다.";	
			printState("useBooster", warning);
			
		} else {
			printState("useBooster");
		}
	}
	
	public void printKartInfo() {
		System.out.println("===== Kart Info =====");
		System.out.println("[" + this.name + "(" + this.color + ")" + "]");
		System.out.println("SpeedUp 증가 속도 : " + SPEED_UP + "(km)");
		System.out.println("SpeedDown 감소 속도 : " + SPEED_DOWN + "(km)");
		System.out.println("카트 최대 속도 : " + MAX_SPEED + "(km)");
		System.out.println("부스터 사용시 증가 속도 : " + BOOSTER_SPEED_UP + "(km)");
		System.out.println("부스터 최대 개수 : " + MAX_BOOSTER + "(개)");
	}
	
	private void printState(String function) {
		System.out.print("[" + this.name + "(" + this.color + ")" + "] ");
		System.out.println(function + " | 속도 : " + this.speed + "(km) | " + "부스터 : " + this.booster + "(개)");
	}
	
	private void printState(String function, String warning) {
		System.out.print("[" + this.name + "(" + this.color + ")" + "] ");
		System.out.println(function + " | 속도 : " + this.speed + "(km) | " + "부스터 : " + this.booster + "(개)" + warning);
	}
	
}
