package cn.itcast_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UploadClient {
	public static void main(String[] args) throws IOException {
		// 创建客户端Socket对象
		Socket s = new Socket("192.168.12.92", 11111);

		// 封装文本文件
		BufferedReader br = new BufferedReader(new FileReader(
				"InetAddressDemo.java"));
		// 封装通道内流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 释放资源
		br.close();
		s.close();
	}
}
