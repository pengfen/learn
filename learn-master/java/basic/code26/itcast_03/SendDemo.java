package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送端的Socket对象
		DatagramSocket ds = new DatagramSocket();

		// 创建数据并打包
		byte[] bys = "helloworld".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length,
				InetAddress.getByName("192.168.12.92"), 12345);

		// 发送数据
		ds.send(dp);

		// 释放资源
		ds.close();
	}
}
