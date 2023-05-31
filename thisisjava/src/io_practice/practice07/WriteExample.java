package io_practice.practice07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		
		Writer writer = null;
		
		try {
			writer = new FileWriter("C:/Temp/test.txt");
			
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			writer.write("FGH");
			
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} 

	}

}
