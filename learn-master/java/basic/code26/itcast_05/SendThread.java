package cn.itcast_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {

	private DatagramSocket ds;

	public SendThread(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			// ��װ����¼������
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String line = null;
			while ((line = br.readLine()) != null) {
				if ("886".equals(line)) {
					break;
				}

				// �������ݲ����
				byte[] bys = line.getBytes();
				// DatagramPacket dp = new DatagramPacket(bys, bys.length,
				// InetAddress.getByName("192.168.12.92"), 12345);
				DatagramPacket dp = new DatagramPacket(bys, bys.length,
						InetAddress.getByName("192.168.12.255"), 12306);

				// ��������
				ds.send(dp);
			}

			// �ͷ���Դ
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
