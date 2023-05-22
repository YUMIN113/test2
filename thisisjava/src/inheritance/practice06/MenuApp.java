package inheritance.practice06;

public class MenuApp {

	public static void main(String[] args) {


		Menu m = new Menu("녹차", 3500);
		m.printInfo();
		
		Coffee c = new Coffee("아메리카노", 3000, "에티오피아 예가체프");
		c.printInfo();
		
		Ade a = new Ade("레몬에이드", 4000, "레몬, 시럽");
		a.printInfo();
	}

}
