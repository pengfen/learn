package com.test;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/*
 * ��ǰ�Ĳ�����
 * a.txt -- b.txt
 * c.txt -- d.txt
 * 
 * ������Ҫ��
 * a.txt+b.txt -- c.txt
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		// SequenceInputStream(InputStream s1, InputStream s2)
		// ���󣺰�ByteArrayStreamDemo.java��DataStreamDemo.java�����ݸ��Ƶ�Copy.java��
		InputStream s1 = new FileInputStream("ByteArrayStreamDemo.java");
		InputStream s2 = new FileInputStream("DataStreamDemo.java");
		SequenceInputStream sis = new SequenceInputStream(s1, s2);
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("Copy.java"));

		// ���д��д�أ���ʵ�ܼ򵥣���Ͱ�����ǰ��ô��д�����ڻ�����ô��д
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		sis.close();
	}
}