package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����ͼƬ
 * 
 * ������
 * 		�������ݣ��������֪���ü��±��򿪲��ܹ������������ַ������������ֽ�����
 * 		ͨ����ԭ������֪������Ӧ�ò����ֽ�����
 * 		���ֽ�����4�ַ�ʽ�������������Ŀ������4�ַ�ʽ���Ƽ����յ�4�֡�
 * 
 * ����Դ��
 * 		c:\\a.jpg -- FileInputStream -- BufferedInputStream
 * Ŀ�ĵأ�
 * 		d:\\b.jpg -- FileOutputStream -- BufferedOutputStream
 */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		// ʹ���ַ�����Ϊ·��
		// String srcString = "c:\\a.jpg";
		// String destString = "d:\\b.jpg";
		// ʹ��File������Ϊ����
		File srcFile = new File("c:\\a.jpg");
		File destFile = new File("d:\\b.jpg");

		// method1(srcFile, destFile);
		// method2(srcFile, destFile);
		// method3(srcFile, destFile);
		method4(srcFile, destFile);
	}

	// �ֽڻ�����һ�ζ�дһ���ֽ�����
	private static void method4(File srcFile, File destFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(destFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}

	// �ֽڻ�����һ�ζ�дһ���ֽ�
	private static void method3(File srcFile, File destFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(destFile));

		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}

		bos.close();
		bis.close();
	}

	// �����ֽ���һ�ζ�дһ���ֽ�����
	private static void method2(File srcFile, File destFile) throws IOException {
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		fos.close();
		fis.close();
	}

	// �����ֽ���һ�ζ�дһ���ֽ�
	private static void method1(File srcFile, File destFile) throws IOException {
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);

		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();
	}
}