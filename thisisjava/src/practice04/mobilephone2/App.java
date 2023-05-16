package practice04.mobilephone2;

public class App {

	public static void main(String[] args) {
		
		MobilePhone mp1 = new MobilePhone();
		
		mp1.setCompany("삼성전자");
		mp1.setProduct("Galaxy S23 Ultra");
		mp1.setOs("Android");
		mp1.setColor("black");
		mp1.setPen(true);
		mp1.setMemory(12);
		mp1.setStorage(512);
		mp1.setBattery(5000);
		mp1.printInfo();
		
		MobilePhone mp2 = new MobilePhone();
		
		mp2.setCompany("애플");
		mp2.setProduct("iphone 14 Pro");
		mp2.setOs("iOS");
		mp2.setColor("gold");
		mp2.setPen(false);
		mp2.setMemory(8);
		mp2.setStorage(512);
		mp2.setBattery(5000);
        mp2.printInfo();
        
	}

}
