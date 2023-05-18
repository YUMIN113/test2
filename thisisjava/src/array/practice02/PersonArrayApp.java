package array.practice02;

public class PersonArrayApp {

	public static void main(String[] args) {


		Person[] personArray;
		
		personArray = new Person[3];
		
		personArray[0] = new Person();
		personArray[0].setName("Hong");
		personArray[0].setAge(25);
		
		personArray[1] = new Person("Lee", 40);
		
		Person p = new Person("Park" , 35);
		personArray[2] = p;
		
		personArray[0].printInfo();
		personArray[1].printInfo();
		personArray[2].printInfo();
		
		int arrayLength = personArray.length;
		System.out.println("배열길이=" + arrayLength);
		
		System.out.println("\n===== for() =====");
		for(int i = 0; i < personArray.length; i++) {
			System.out.print("personArray[" + i + "] ");
			personArray[i].printInfo();
		}
		
	}

}
