package cn.itcast_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * ͨ��whileѭ�����ԸĽ�һ�����������ն���ͻ��ˡ�
 * ���������������ġ�
 * �������������������һ������������ģ������������˷ֱ�ִ�пͻ���
 * �������ú�ѧϰ.avi(100M)			256k
 * ���ģ���������.mp3(3M)				1M
 * ���壺ILoveJava.txt(1k)			100M
 */
public class UploadServer {
	public static void main(String[] args) throws IOException {
		// �����������˵�Socket����
		ServerSocket ss = new ServerSocket(11111);

		while (true) {
			// �����ͻ�������
			Socket s = ss.accept();// ����

			// ��װͨ���ڵ���
			BufferedReader br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			// ��װ�ı��ļ�
			BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));

			String line = null;
			while ((line = br.readLine()) != null) { // ����
				bw.write(line);
				bw.newLine();
				bw.flush();
			}

			// ��������
			BufferedWriter bwServer = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream()));
			bwServer.write("�ļ��ϴ��ɹ�");
			bwServer.newLine();
			bwServer.flush();

			// �ͷ���Դ
			bw.close();
			s.close();
		}
	}
}
