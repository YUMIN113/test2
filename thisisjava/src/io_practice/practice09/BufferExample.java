package io_practice.practice09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

	public static void main(String[] args) throws IOException {
		
		String originalFilePath1 = "C:/Temp/originalFile1.jpg";
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String originalFilePath2 = "C:/Temp/originalFile2.jpg";
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용: " + nonBufferTime + "ns");
		
		long BufferTime = copy(bis, bos);
		System.out.println("버퍼 사용: " + BufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}

	public static long copy(InputStream is, OutputStream os) throws IOException {
		
		long start = System.nanoTime();
		
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end - start);
	}
}
