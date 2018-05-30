package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter�ķ�����
 * public void write(int c):дһ���ַ�
 * public void write(char[] cbuf):дһ���ַ�����
 * public void write(char[] cbuf,int off,int len):дһ���ַ������һ����
 * public void write(String str):дһ���ַ���
 * public void write(String str,int off,int len):дһ���ַ�����һ����
 * 
 * �����⣺close()��flush()������?
 * A:close()�ر������󣬵�����ˢ��һ�λ��������ر�֮�������󲻿��Լ�����ʹ���ˡ�
 * B:flush()����ˢ�»�����,ˢ��֮�������󻹿��Լ���ʹ�á�
 */
public class OutputStreamWriterDemo2 {
	public static void main(String[] args) throws IOException {
		// ��������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"osw2.txt"));

		// д����
		// public void write(int c):дһ���ַ�
		// osw.write('a');
		// osw.write(97);
		// Ϊʲô����û�н�ȥ��?
		// ԭ���ǣ��ַ� = 2�ֽ�
		// �ļ������ݴ洢�Ļ�����λ���ֽڡ�
		// void flush()

		// public void write(char[] cbuf):дһ���ַ�����
		// char[] chs = {'a','b','c','d','e'};
		// osw.write(chs);

		// public void write(char[] cbuf,int off,int len):дһ���ַ������һ����
		// osw.write(chs,1,3);

		// public void write(String str):дһ���ַ���
		// osw.write("�Ұ�����ϼ");

		// public void write(String str,int off,int len):дһ���ַ�����һ����
		osw.write("�Ұ�����ϼ", 2, 3);

		// ˢ�»�����
		osw.flush();
		// osw.write("�Ұ�����ϼ", 2, 3);

		// �ͷ���Դ
		osw.close();
		// java.io.IOException: Stream closed
		// osw.write("�Ұ�����ϼ", 2, 3);
	}
}
