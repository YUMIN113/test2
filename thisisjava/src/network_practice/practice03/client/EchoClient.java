package network_practice.practice03.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				Socket socket = new Socket("localhost", 8085);
				System.out.println("[클라이언트] 연결 성공");
				
				String sendMessage = sc.nextLine();
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				dos.writeUTF(sendMessage);
				dos.flush();
				System.out.println("[클라이언트] 데이터 보냄 : " + sendMessage);
				
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				String receiveMessage = dis.readUTF();
				System.out.println("[클라이언트] 데이터 받음 : " + receiveMessage);

				socket.close();
				System.out.println("[클라이언트] 연결 끊음");
				break;

			} catch (UnknownHostException e) {
				
			} catch (IOException e) {
				
			}
		}
	
	}

}
