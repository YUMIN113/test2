package practice16;

public class Data {
	
	private int no;
	private static int count;
	
	public Data() {
		no = no + 1;
		count = count + 1;
	}
	
	public void printInfo() {
		System.out.println("번호=" + no);
		System.out.println("카운트=" + count);
		System.out.println();
	}
	
}
