package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter(OutputStream out):����Ĭ�ϱ�����ֽ���������ת��Ϊ�ַ���
 * OutputStreamWriter(OutputStream out,String charsetName):����ָ��������ֽ�������ת��Ϊ�ַ���
 * ���ֽ���ת��Ϊ�ַ�����
 * �ַ��� = �ֽ��� +�����
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		// ��������
		// OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
		// "osw.txt")); // Ĭ��GBK
		// OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
		// "osw.txt"), "GBK"); // ָ��GBK
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"osw.txt"), "UTF-8"); // ָ��UTF-8
		// д����
		osw.write("�й�");

		// �ͷ���Դ
		osw.close();
	}
}