package io_practice.practice04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		InputStream is = null;
		
		try {
			is = new FileInputStream("C:/Temp/test1.db");
			
			while(true) {
				int data = is.read();
				
				if(data == -1) break;
				System.out.println(data);
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
