package interface_practice.practice01;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;
		
		System.out.println("\n===== Television =====");
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("\n===== Audio =====");
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("\n===== MAX_VOLUME & MIN_VOLUME =====");
		System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최저 볼륨 : " + RemoteControl.MIN_VOLUME);
		
		System.out.println("\n===== static Method() =====");
		RemoteControl.changeBattery();
		
	}

}
