package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰�e:\\��������.mp4���Ƶ���ǰ��ĿĿ¼�µ�copy.mp4��
 * 
 * ����Դ��
 * 		e:\\��������.mp4--��ȡ����--FileInputStream
 * Ŀ�ĵأ�
 * 		copy.mp4--д������--FileOutputStream
 */
public class CopyMp4Demo {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		FileInputStream fis = new FileInputStream("e:\\��������.mp4");
		// ��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("copy.mp4");

		// ��������
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		// �ͷ���Դ
		fos.close();
		fis.close();
	}
}