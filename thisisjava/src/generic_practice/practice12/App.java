package generic_practice.practice12;

public class App {

	public static void main(String[] args) {
		
		System.out.println("===== GenericP =====");
		System.out.println("----- Person -----");
		GenericP<Person> g1 = new GenericP<>();
		g1.setField(new Person("Paige", 20));
		g1.getField().printInfo();
		
		System.out.println("\n----- SuperMan -----");
		GenericP<SuperMan> g2 = new GenericP<>();
		g2.setField(new SuperMan("Clock", 40));
		g2.getField().printInfo();

		System.out.println("\n===== GenericFH =====");
		System.out.println("----- UFO -----");
		GenericFH<UFO> g10 = new GenericFH<>();
		g10.setField(new UFO("쟁반"));
		g10.getField().printInfo();
		g10.getField().fly();
		g10.getField().hidden();

		System.out.println("\n----- SuperMan -----");
		GenericFH<SuperMan> g11 = new GenericFH<>();
		g11.setField(new SuperMan("Clock", 40));
		g11.getField().printInfo();
		g11.getField().fly();
		g11.getField().hidden();
		
		System.out.println("\n===== GenericPFH =====");
		System.out.println("----- UFO -----");
//		GenericPFH<UFO> g20 = new GenericPFH<>();
//		UFO 는 Person 을 상속받지 않았기 때문에 GenericPFH 객체 생성 불가능
		
		System.out.println("\n----- SuperMan -----");
		GenericPFH<SuperMan> g21 = new GenericPFH<>();
		g11.setField(new SuperMan("Clock", 40));
		g11.getField().printInfo();
		g11.getField().fly();
		g11.getField().hidden();
		
	}

}
