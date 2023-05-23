package inheritance.practice15;

public class Game {

	public void attack(Character character) {
		if(character instanceof Archer) {
			System.out.print("[" + character.getName() + " / " + character.getCharacter() + "] ");
			System.out.println("원거리 공격");
		} else if(character instanceof Knight) {
			System.out.print("[" + character.getName() + " / " + character.getCharacter() + "] ");
			System.out.println("근거리 공격");
		} else if(character instanceof Wizard) {
			System.out.print("[" + character.getName() + " / " + character.getCharacter() + "] ");
			System.out.println("마법 공격");
		}
	}
}
