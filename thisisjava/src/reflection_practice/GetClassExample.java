package reflection_practice;

public class GetClassExample {

	public static void main(String[] args) {
		
		Class clazz = Car.class;
		
		System.out.println(clazz.getPackage());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getName());

	}

}
