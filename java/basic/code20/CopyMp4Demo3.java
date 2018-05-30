package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰�e:\\��������.mp4���Ƶ���ǰ��ĿĿ¼�µ�copy.mp4��
 * 
 * �ֽ������ַ�ʽ�����ļ���
 * �����ֽ���һ�ζ�дһ���ֽڣ�	����ʱ��117235����
 * �����ֽ���һ�ζ�дһ���ֽ����飺 ����ʱ��156����
 * ��Ч�ֽ���һ�ζ�дһ���ֽڣ� ����ʱ��1141����
 * ��Ч�ֽ���һ�ζ�дһ���ֽ����飺 ����ʱ��47����
 */
public class CopyMp4Demo3 {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		// method1("e:\\��������.mp4", "copy1.mp4");
		// method2("e:\\��������.mp4", "copy2.mp4");
		// method3("e:\\��������.mp4", "copy3.mp4");
		method4("e:\\��������.mp4", "copy4.mp4");
		long end = System.currentTimeMillis();
		System.out.println("����ʱ��" + (end - start) + "����");
	}

	// ��Ч�ֽ���һ�ζ�дһ���ֽ����飺
	public static void method4(String srcString, String destString)
			throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcString));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(destString));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}

	// ��Ч�ֽ���һ�ζ�дһ���ֽڣ�
	public static void method3(String srcString, String destString)
			throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcString));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(destString));

		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);

		}

		bos.close();
		bis.close();
	}

	// �����ֽ���һ�ζ�дһ���ֽ�����
	public static void method2(String srcString, String destString)
			throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(destString);

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		fos.close();
		fis.close();
	}

	// �����ֽ���һ�ζ�дһ���ֽ�
	public static void method1(String srcString, String destString)
			throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(destString);

		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();
	}
}

