package array;

public class ForEachApp {

	public static void main(String[] args) {
		
		String[] messageArr = {"hello", "world", "welcome"};
		
		System.out.println("\n===== for =====");
		for(int i = 0; i < messageArr.length; i++) {
			System.out.println(messageArr[i]);
		}
		
		System.out.println("\n===== advanced for =====");
		for(String str : messageArr) {
			System.out.println(str);
		}

	}

}
