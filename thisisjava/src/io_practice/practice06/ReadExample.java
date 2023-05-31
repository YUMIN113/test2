package io_practice.practice06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		String originalFileName = "C:/Temp/test.jpg";
		String targetFileName = "C:/Temp/test2.jpg";
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream(originalFileName);
			os = new FileOutputStream(targetFileName);
			
			byte[] data = new byte[1024];
			
			while(true) {
				int num = is.read(data);
				
				if(num == -1) break;
				
				os.write(data, 0, num);
			}
			os.flush();
			os.close();
			is.close();
			
			System.out.println("복사가 잘 되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os != null || is != null) {
					os.close();
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
