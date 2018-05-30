package com.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * �ڴ�����������ڴ�����ʱ�洢��Ϣ�ģ�������������ݾʹ��ڴ�����ʧ��
 * �ֽ����飺
 * 		ByteArrayInputStream
 * 		ByteArrayOutputStream
 * �ַ����飺
 * 		CharArrayReader
 * 		CharArrayWriter
 * �ַ�����
 * 		StringReader
 * 		StringWriter
 */
public class ByteArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		// д����
		// ByteArrayOutputStream()
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// д����
		for (int x = 0; x < 10; x++) {
			baos.write(("hello" + x).getBytes());
		}

		// �ͷ���Դ
		// ͨ���鿴Դ������֪������ʲô��û�������Ը�����Ҫclose()
		// baos.close();

		// public byte[] toByteArray()
		byte[] bys = baos.toByteArray();

		// ������
		// ByteArrayInputStream(byte[] buf)
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);

		int by = 0;
		while ((by = bais.read()) != -1) {
			System.out.print((char) by);
		}

		// bais.close();
	}
}
