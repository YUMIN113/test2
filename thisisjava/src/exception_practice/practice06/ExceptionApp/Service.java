package exception_practice.practice06.ExceptionApp;

public class Service {

	public void method() throws ArrayIndexOutOfBoundsException {
		System.out.println("\t\tService.method()::Start");

		String[] stringArray = new String[3];
		stringArray[0] = "A";
		stringArray[1] = "B";
		stringArray[2] = "C";
//		try {
			for (int i = 0; i < 4; i++) {
				System.out.println("\t\tstringArray[" + i + "]=" + stringArray[i]);
			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("\t----- catch : Service.method() -----");
//		} finally {
//			System.out.println("\t----- finally : Service.method() -----");
			System.out.println("\t\tService.method()::End");
//		}
		

	}

	}

