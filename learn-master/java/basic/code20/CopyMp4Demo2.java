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
public class CopyMp4Demo2 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		FileInputStream fis = new FileInputStream("e:\\��������.mp4");
		// ��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("copy.mp4");

		// ��������
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		// �ͷ���Դ
		fos.close();
		fis.close();
	}
}
