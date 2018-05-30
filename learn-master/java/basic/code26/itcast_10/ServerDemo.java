package cn.itcast_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// ����������Socket����
		ServerSocket ss = new ServerSocket(34567);

		// �����ͻ�������
		Socket s = ss.accept();

		// ��װͨ���ڵ���
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		
		s.close();
	}
}
