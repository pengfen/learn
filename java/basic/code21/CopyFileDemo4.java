package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�b.txt��
 * 
 * ����Դ��
 * 		a.txt -- ��ȡ���� -- �ַ�ת���� -- InputStreamReader -- FileReader -- BufferedReader
 * Ŀ�ĵأ�
 * 		b.txt -- д������ -- �ַ�ת���� -- OutputStreamWriter -- FileWriter -- BufferedWriter
 */
public class CopyFileDemo4 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		// ��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		// ���ַ�ʽ���е�һ��һ�ζ�дһ���ַ�����
		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
			bw.flush();
		}

		// �ͷ���Դ
		bw.close();
		br.close();
	}
}