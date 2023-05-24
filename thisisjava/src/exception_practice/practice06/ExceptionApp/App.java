package exception_practice.practice06.ExceptionApp;

public class App {
	
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException {

		System.out.println("App.main()::Start");
		
//		try {
			Control c = new Control();
			c.method();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("\t----- catch : Main.main() -----");
//		} finally {
//			System.out.println("\t----- finally : Main.main() -----");
			System.out.println("App.main()::End");
				
//		}
		

	}

}