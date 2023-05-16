package practice10;

public class ReportCardApp {

	public static void main(String[] args) {
		
		System.out.println("\n===== Object 1 =====");
		int korean1 = 96;
		int english1 = 82;
		int math1 = 78;
		
		ReportCard rc1 = new ReportCard("Victoria", korean1, english1, math1);
		
		int sum1 = rc1.sum();
		System.out.println("sum=" + sum1);
		int average1 = rc1.average();
		System.out.println("average=" + average1);
		char hakjum1 = rc1.hakjum();
		System.out.println("hakjum=" + hakjum1);
		
		rc1.printInfo();
		
		System.out.println("\n===== Object 2 =====");
		int korean2 = 88;
		int english2 = 100;
		int math2 = 92;
		
		ReportCard rc2 = new ReportCard("Paige", korean2, english2, math2);
		
		int sum2 = rc2.sum();
		System.out.println("sum=" + sum2);
		int average2 = rc2.average();
		System.out.println("average=" + average2);
		char hakjum2 = rc2.hakjum();
		System.out.println("hakjum=" + hakjum2);
		
		rc2.printInfo();

	}

}
