package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ������������ⷽ����
 * BufferedWriter:
 * 		public void newLine():����ϵͳ���������з�
 * BufferedReader:
 * 		public String readLine()��һ�ζ�ȡһ������
 * 		�����������ݵ��ַ������������κ�����ֹ��������ѵ�����ĩβ���򷵻� null
 */
public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		// write();
		read();
	}

	private static void read() throws IOException {
		// �����ַ���������������
		BufferedReader br = new BufferedReader(new FileReader("bw2.txt"));

		// public String readLine()��һ�ζ�ȡһ������
		// String line = br.readLine();
		// System.out.println(line);
		// line = br.readLine();
		// System.out.println(line);

		// ���հ����
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		//�ͷ���Դ
		br.close();
	}

	private static void write() throws IOException {
		// �����ַ��������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw2.txt"));
		for (int x = 0; x < 10; x++) {
			bw.write("hello" + x);
			// bw.write("\r\n");
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}