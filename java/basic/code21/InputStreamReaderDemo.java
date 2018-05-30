package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader(InputStream is):��Ĭ�ϵı����ȡ����
 * InputStreamReader(InputStream is,String charsetName):��ָ���ı����ȡ����
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		// ��������
		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "osw.txt"));

		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "osw.txt"), "GBK");

		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"osw.txt"), "UTF-8");

		// ��ȡ����
		// һ�ζ�ȡһ���ַ�
		int ch = 0;
		while ((ch = isr.read()) != -1) {
			System.out.print((char) ch);
		}

		// �ͷ���Դ
		isr.close();
	}
}