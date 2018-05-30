package com.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���󣺰�c:\\a.txt���ݸ��Ƶ�d:\\b.txt��
 * 
 * ����Դ��
 * 		c:\\a.txt -- FileReader
 * Ŀ�ĵ�:
 * 		d:\\b.txt -- FileWriter
 */
public class CopyFileDemo3 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		FileReader fr = new FileReader("c:\\a.txt");
		// ��װĿ�ĵ�
		FileWriter fw = new FileWriter("d:\\b.txt");

		// ��д����
		// int ch = 0;
		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		
		//�ͷ���Դ
		fw.close();
		fr.close();
	}
}

