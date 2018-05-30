package com.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �������ǳ����Ĳ�������ʹ�ñ���Ĭ�ϱ��룬���ԣ�����ָ�����롣
 * ��ת�����������е㳤�����ԣ�Java���ṩ�������๩����ʹ�á�
 * OutputStreamWriter = FileOutputStream + �����(GBK)
 * FileWriter = FileOutputStream + �����(GBK)
 * 
 * InputStreamReader = FileInputStream + �����(GBK)
 * FileReader = FileInputStream + �����(GBK)
 * 
 /*
 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�b.txt��
 * 
 * ����Դ��
 * 		a.txt -- ��ȡ���� -- �ַ�ת���� -- InputStreamReader -- FileReader
 * Ŀ�ĵأ�
 * 		b.txt -- д������ -- �ַ�ת���� -- OutputStreamWriter -- FileWriter
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		FileReader fr = new FileReader("a.txt");
		// ��װĿ�ĵ�
		FileWriter fw = new FileWriter("b.txt");

		// һ��һ���ַ�
		// int ch = 0;
		// while ((ch = fr.read()) != -1) {
		// fw.write(ch);
		// }

		// һ��һ���ַ�����
		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
			fw.flush();
		}

		// �ͷ���Դ
		fw.close();
		fr.close();
	}
}
