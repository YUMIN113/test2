package array.personarray;

public class PersonArrayApp {

	public static void main(String[] args) {
		
		Person[][] personArray = new Person[2][];
		
		personArray[0] = new Person[1];
		personArray[1] = new Person[2];
		
		personArray[0][0] = new Person("Lee", 30);
		
		personArray[1][0] = new Person("Hong", 20);
		personArray[1][1] = new Person("Choi", 25);
		
		System.out.println("\n===== personArray[0] =====");
		System.out.println("배열길이=" + personArray[0].length);
		for(int i = 0; i < personArray[0].length; i++) {
			System.out.println("이름=" + personArray[0][i].getName() + " 나이=" + personArray[0][i].getAge());
		}
		
		System.out.println("\n===== personArray[1] =====");
		System.out.println("배열길이=" + personArray[1].length);
		for(int i = 0; i < personArray[1].length; i++) {
			System.out.println("이름=" + personArray[1][i].getName() + " 나이=" + personArray[1][i].getAge());
		}
		
		System.out.println("\n===== personArray =====");
		System.out.println("배열길이=" + personArray.length);
		for(int i = 0; i < personArray.length; i++) {
			for(int j = 0; j < personArray[i].length; j++) {
				System.out.println("personArray[" + i + "]" + "[" + j + "] " + "이름=" + personArray[i][j].getName() + " 나이=" + personArray[i][j].getAge());
			}
		}
	}
}
