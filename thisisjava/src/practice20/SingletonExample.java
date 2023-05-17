package practice20;

public class SingletonExample {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getIncetance();
		Singleton obj2 = Singleton.getIncetance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
