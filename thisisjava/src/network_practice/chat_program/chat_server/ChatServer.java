package network_practice.chat_program.chat_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import network_practice.chat_program.socket_client.SocketClient;

public class ChatServer {
	
	ServerSocket serverSocket;
	ExecutorService threadPool = Executors.newFixedThreadPool(100); // 인자 개수만큼 고정된 개수의 thread pool 생성 
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());

	public void start() {
		serverSocket = new ServerSocket(8088);
		System.out.println("[서버] 시작됨");
		
		Thread thread = new Thread(() -> {
			try {
				while(true) {
					Socket socket = serverSocket.accept();
					SocketClient sc = new SocketClient(this, socket);
				}
			} catch (IOException e) {
				
			}
		});
		thread.start();
	}
	
	
}
