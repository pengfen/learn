package cn.itcast_15;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) throws IOException {
		// 创建服务器Socket对象
		ServerSocket ss = new ServerSocket(11111);

		while (true) {
			Socket s = ss.accept();
			new Thread(new UserThread(s)).start();
		}
	}
}
