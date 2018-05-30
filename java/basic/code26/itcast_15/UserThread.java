package cn.itcast_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UserThread implements Runnable {
	private Socket s;

	public UserThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			// 封装通道内的流
			BufferedReader br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			// 封装文本文件
			// BufferedWriter bw = new BufferedWriter(new
			// FileWriter("Copy.java"));

			// 为了防止名称冲突
			String newName = System.currentTimeMillis() + ".java";
			BufferedWriter bw = new BufferedWriter(new FileWriter(newName));

			String line = null;
			while ((line = br.readLine()) != null) { // 阻塞
				bw.write(line);
				bw.newLine();
				bw.flush();
			}

			// 给出反馈
			BufferedWriter bwServer = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream()));
			bwServer.write("文件上传成功");
			bwServer.newLine();
			bwServer.flush();

			// 释放资源
			bw.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
