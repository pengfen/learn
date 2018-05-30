package cn.itcast_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) throws IOException {
		// 创建服务器端的Socket对象
		ServerSocket ss = new ServerSocket(11111);

		// 监听客户端连接
		Socket s = ss.accept();

		// 封装通道内的流
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		// 封装文本文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		bw.close();
		s.close();
	}
}
