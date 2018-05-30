package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader
 * ���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ�� 
 * ����ָ���������Ĵ�С�����߿�ʹ��Ĭ�ϵĴ�С�����������£�Ĭ��ֵ���㹻���ˡ� 
 * 
 * BufferedReader(Reader in)
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		// �����ַ���������������
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

		// ��ʽ1
		// int ch = 0;
		// while ((ch = br.read()) != -1) {
		// System.out.print((char) ch);
		// }

		// ��ʽ2
		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		// �ͷ���Դ
		br.close();
	}
}
