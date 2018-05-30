package cn.itcast_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UploadClient {
	public static void main(String[] args) throws IOException {
		// �����ͻ���Socket����
		Socket s = new Socket("192.168.12.92", 11111);

		// ��װ�ı��ļ�
		BufferedReader br = new BufferedReader(new FileReader(
				"InetAddressDemo.java"));
		// ��װͨ������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// �ͷ���Դ
		br.close();
		s.close();
	}
}
