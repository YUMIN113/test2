package io_practice.practice08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		
		Reader reader = null;
		
		try {
			reader = new FileReader("C:/Temp/test.txt");
			
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char) data);
			}
			
			reader.close();
			System.out.println();
			
			reader = new FileReader("C:/Temp/test.txt");
			char[] data = new char[100];
			
			while(true) {
				int num = reader.read(data);
				if(num == -1) break;
				
				for(int i = 0; i < num; i++) {
					System.out.print(data[i]);
				}
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} 

	}

}
