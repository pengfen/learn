package cn.itcast_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// ����������Socket����
		ServerSocket ss = new ServerSocket(23456);

		// �����ͻ�������
		Socket s = ss.accept();

		// ��װͨ���ڵ�����
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		// ��װ�ı��ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		bw.close();
		// br.close();
		s.close();
		// ss.close();
	}
}
