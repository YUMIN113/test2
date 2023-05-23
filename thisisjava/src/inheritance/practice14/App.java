package inheritance.practice14;

public class App {

	public static void main(String[] args) {

		System.out.println("===== cry() =====");
		Animal animal = new Animal();
		Bird bird = new Bird();
		Cow cow = new Cow();

		animal.cry();
		bird.cry();
		cow.cry();

		System.out.println("\n===== Polymorphic Argument =====");
		Biz biz = new Biz();

		System.out.println("\n----- biz.cryAnimal() -----");
		biz.cryAnimal(animal);
		biz.cryAnimal(bird); // extends Animal 관계에서 가능. 
		biz.cryAnimal(cow); // extends Animal 관계에서 가능. 

		System.out.println("\n----- biz.cryBird() -----");
//		biz.cryBird(animal); // Error. Bird는 Animal의 하위 클래스
		biz.cryBird(bird);
//		biz.cryBird(cow); // Error. Bird와 Cow는 상속 관계 없음

		System.out.println("\n----- biz.cryCow() -----");
//		biz.cryCow(animal);// Error. Cow는 Animal의 하위 클래스
//		biz.cryCow(bird);// Error. Cow와 Bird는 상속 관계 없음
		biz.cryCow(cow);

	}
}
