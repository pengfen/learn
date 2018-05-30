package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/*
 * UDPЭ�鷢�����ݣ�
 * A:�������Ͷ�Socket����
 * B:�������ݣ��������ݴ��
 * C:����Socket����ķ��ͷ����������ݰ�
 * D:�ͷ���Դ
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		// �������Ͷ�Socket����
		// DatagramSocket()
		DatagramSocket ds = new DatagramSocket();

		// �������ݣ��������ݴ��
		// DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		// ��������
		byte[] bys = "hello,udp,������".getBytes();
		// ����
		int length = bys.length;
		// IP��ַ����
		InetAddress address = InetAddress.getByName("192.168.12.92");
		// �˿�
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);

		// ����Socket����ķ��ͷ����������ݰ�
		// public void send(DatagramPacket p)
		ds.send(dp);

		// �ͷ���Դ
		ds.close();
	}
}
