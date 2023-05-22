package inheritance.practice07;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal a = new Animal("Dog", "콩이", 1, "F");
		a.printInfo();
		
		Cat c = new Cat("나비", 5, "F", 3);
		c.printInfo();
		c.sleep();
		
		Eagle e = new Eagle("그리", 4, "M", 2);
		e.printInfo();
		e.fly();

	}

}
