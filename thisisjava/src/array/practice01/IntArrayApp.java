package array.practice01;

public class IntArrayApp {

	public static void main(String[] args) {


		int[] intArray;
		
		intArray = new int[2];
		
		intArray[0] = 1;
		intArray[1] = 2;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		
		int arrayLength = intArray.length;
		System.out.println("배열길이=" + arrayLength);

		for(int i = 0; i <intArray.length; i++) {
			System.out.print("intArray[" + i + "] ");
			System.out.println(intArray[i]);
		}
	}
}
