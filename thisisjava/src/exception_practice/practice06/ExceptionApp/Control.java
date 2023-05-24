package exception_practice.practice06.ExceptionApp;

public class Control {
	
	public void method() throws ArrayIndexOutOfBoundsException {
		System.out.println("\tControl.method()::Start");	
		
//		try {
			Service s = new Service();
			s.method();		
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("\t----- catch : Control.method() -----");
//		} finally {
//				System.out.println("\t----- finally : control.method() -----");
	            System.out.println("\tControl.method()::End");
//	}

 }
}
