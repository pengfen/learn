package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����ı��ļ���
 * 
 * ����Դ����������
 * a.txt	--	��ȡ����	--	FileInputStream	
 * 
 * Ŀ�ĵأ�������ȥ
 * b.txt	--	д����		--	FileOutputStream
 * 
 * java.io.FileNotFoundException: a.txt (ϵͳ�Ҳ���ָ�����ļ���)
 * 
 * ��һ�θ�������û�г����κ����⣬Ϊʲô��?
 * ��һ�����ǳ��������ԭ����������ÿ�λ�ȡ��һ���ֽ����ݣ��ͰѸ��ֽ�����ת��Ϊ���ַ����ݣ�Ȼ�����������̨��
 * ����һ����?ȷʵͨ��IO����ȡ���ݣ�д���ı��ļ������ȡһ���ֽڣ��Ҿ�д��һ���ֽڣ���û�����κε�ת����
 * �����Լ���ת����
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		FileInputStream fis = new FileInputStream("a.txt");
		// ��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("b.txt");

		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		// �ͷ���Դ(�ȹ�˭����)
		fos.close();
		fis.close();
	}
}