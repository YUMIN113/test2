package io_practice.practice01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamByteApp {

	public static void main(String[] args) {

		// finally 에서 'os' 사용하기 위해서 try 문 밖에 선언
		OutputStream os = null;

		try {
			System.out.println("===== Start =====");
			
			os = new FileOutputStream("C:/Temp/os_byte.dat");

			byte b1 = 1;
			byte b2 = 2;
			byte b3 = 3;
			
			os.write(b1);
			os.write(b2);
			os.write(b3);
			
			os.flush();
			os.close();
			
			System.out.println("\n===== End =====");

		} catch (IOException e) {
			System.out.println("\n===== catch() :  IOException =====");
			e.printStackTrace();
		} finally {
			// releases all system resources from the streams
			// try 문에서 오류가 발생하여 'os' 가 close 되지 않았을 때, 문제가 발생한다.
			// 따라서 finally 에 try 문을 정의하여 'os'가 반드시 close 되도록 한다.
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				System.out.println("\n===== finally() :  IOException  =====");
				e.printStackTrace();
			}
		}
	}

}
