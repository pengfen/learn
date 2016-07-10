package cn.itcast_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建服务器Socket对象
		ServerSocket ss = new ServerSocket(22222);

		// 监听客户端连接
		Socket s = ss.accept();

		// 包装通道内容的流
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		// br.close();
		s.close();
		// ss.close();
	}
}
