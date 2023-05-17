package practice13;

public class Message {
	
	public void printInfo(String str) {
		System.out.println(str);
	}
	
	public void printInfo(String str, int val) {
		System.out.println(str + ", " + val);
	}
	
	public void printInfo(int val) {
		System.out.println(val);
	}
	
	public void printInfo(int val, String str) {
		System.out.println(val + ", " + str);
	}

}
