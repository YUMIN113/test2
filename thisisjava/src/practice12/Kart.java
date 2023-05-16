package practice12;

public class Kart {

	private String name;
	private String color;
	private int speed;
    private int booster;
    
	public Kart(String name, String color) {
		this.name = name;
		this.color = color;
		this.speed = 0;
		this.booster = 0;
	}
	
	public void speedUp() {
		speed = this.speed + 40;
		if(speed > 150) {
			speed = 150;
		}
		System.out.println("[" + this.name + "(" + this.color + ")" + "] " + "speedUp | 속도 : " + this.speed + "(km) | " + "부스터 : " + this.booster + "(개)" );
	}
	
	public void speedDown() {
		speed = this.speed - 80;
		if(speed < 0) {
			speed = 0;
		}
		System.out.println("[" + this.name + "(" + this.color + ")" + "] " + "speedDown | 속도 : " + this.speed + "(km) | " + "부스터 : " + this.booster + "(개)" );
	}
	
	public void pickupBooster() {
		booster++;
		
		if(booster > 1) {
			booster = 1;
			String str = " | 부스터를 더 이상 추가할 수 없습니다.";
			System.out.println("[" + this.name + "(" + this.color + ")" + "] " + "pickupBooster | 속도 : " + this.speed + "(km) | " + "부스터 : " + this.booster + "(개)" + str);
		} else {
			System.out.println("[" + this.name + "(" + this.color + ")" + "] " + "pickupBooster | 속도 : " + this.speed + "(km) | " + "부스터 : " + this.booster + "(개)");
		}
	}
	
	public void useBooster() {
		speed = this.speed + 100;
		if(speed > 150) {
			speed = 150;
		}
		
		booster--;
		
		if(booster < 0) {
			booster = 0;
			String str = " | 사용 가능한 부스터가 없습니다.";	
			System.out.println("[" + this.name + "(" + this.color + ")" + "] " + "useBooster | 속도 : " + this.speed + "(km) | " + "부스터 : " + this.booster + "(개)" + str);
		} else {
			System.out.println("[" + this.name + "(" + this.color + ")" + "] " + "useBooster | 속도 : " + this.speed + "(km) | " + "부스터 : " + this.booster + "(개)");
		}
	}
	
	public void printKartInfo() {
		System.out.println("===== Kart Info =====");
		System.out.println("[" + this.name + "(" + this.color + ")" + "]");
		System.out.println("SpeedUp 증가 속도 : 40(km)");
		System.out.println("SpeedDown 감소 속도 : 80(km)");
		System.out.println("카트 최대 속도 : 150(km)");
		System.out.println("부스터 사용시 증가 속도 : 100(km)");
		System.out.println("부스터 최대 개수 : 1(개)");
	}
    
}
