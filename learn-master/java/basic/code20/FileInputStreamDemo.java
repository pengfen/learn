package com.test;


import java.io.FileInputStream;
import java.io.IOException;

/*
 * һ�ζ�ȡһ���ֽ����飺int read(byte[] b)
 * ����ֵ��ʵ��ʵ�ʶ�ȡ���ֽڸ�����
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		// �����ֽ�����������
		// FileInputStream fis = new FileInputStream("fis2.txt");
		FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");

		// ��ȡ����
		// ����һ���ֽ�����
		// ��һ�ζ�ȡ
		// byte[] bys = new byte[5];
		// int len = fis.read(bys);
		// // System.out.println(len);
		// // System.out.println(new String(bys));
		// // System.out.println(new String(bys, 0, len));
		// System.out.print(new String(bys, 0, len));
		//
		// // �ڶ��ζ�ȡ
		// len = fis.read(bys);
		// // System.out.println(len);
		// // System.out.println(new String(bys));
		// // System.out.println(new String(bys, 0, len));
		// System.out.print(new String(bys, 0, len));
		//
		// // �����ζ�ȡ
		// len = fis.read(bys);
		// // System.out.println(len);
		// // System.out.println(new String(bys));
		// // System.out.println(new String(bys, 0, len));
		// System.out.print(new String(bys, 0, len));
		//
		// // ���Ĵζ�ȡ
		// len = fis.read(bys);
		// // System.out.println(len);
		// // System.out.println(new String(bys, 0, len));
		// System.out.print(new String(bys, 0, len));
		// // �����ظ��ˣ���ѭ���Ľ�
		// // ���ǣ��Ҳ�֪����������
		// // len = fis.read(bys);
		// // System.out.println(len);
		// // len = fis.read(bys);
		// // System.out.println(len);
		// // �����ȡ����ʵ�ʳ�����-1����˵��û��������

		// byte[] bys = new byte[115]; // 0
		// int len = 0;
		// while ((len = fis.read(bys)) != -1) {
		// System.out.print(new String(bys, 0, len));
		// // System.out.print(new String(bys)); //ǧ��Ҫ����len��ʹ��
		// }

		// ���հ����
		// ����ĳ���һ����1024����1024��������
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		// �ͷ���Դ
		fis.close();
	}
}