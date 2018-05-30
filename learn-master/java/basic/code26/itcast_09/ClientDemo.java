package cn.itcast_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * �ͻ��˼���¼�룬����������ı��ļ�
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// �����ͻ���Socket����
		Socket s = new Socket("192.168.12.92", 23456);

		// ��װ����¼��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ��װͨ���ڵ�����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			if ("over".equals(line)) {
				break;
			}

			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// bw.close();
		// br.close();
		s.close();
	}
}
