package cn.itcast_06;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP协议接收数据：
 * A:创建接收端的Socket对象
 * B:监听客户端连接。返回一个对应的Socket对象
 * C:获取输入流，读取数据显示在控制台
 * D:释放资源
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建接收端的Socket对象
		// ServerSocket(int port)
		ServerSocket ss = new ServerSocket(8888);

		// 监听客户端连接。返回一个对应的Socket对象
		// public Socket accept()
		Socket s = ss.accept(); // 侦听并接受到此套接字的连接。此方法在连接传入之前一直阻塞。

		// 获取输入流，读取数据显示在控制台
		InputStream is = s.getInputStream();

		byte[] bys = new byte[1024];
		int len = is.read(bys); // 阻塞式方法
		String str = new String(bys, 0, len);

		String ip = s.getInetAddress().getHostAddress();

		System.out.println(ip + "---" + str);

		// 释放资源
		s.close();
		// ss.close(); //这个不应该关闭
	}
}
