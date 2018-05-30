package com.test;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ�������������裺
 * A:�����ֽ����������
 * B:����write()����
 * C:�ͷ���Դ
 * 
 * public void write(int b):дһ���ֽ�
 * public void write(byte[] b):дһ���ֽ�����
 * public void write(byte[] b,int off,int len):дһ���ֽ������һ����
 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// �����ֽ����������
		// OutputStream os = new FileOutputStream("fos2.txt"); // ��̬
		FileOutputStream fos = new FileOutputStream("fos2.txt");

		// ����write()����
		//fos.write(97); //97 -- �ײ����������	-- ͨ�����±��� -- ��97��Ӧ���ַ�ֵ -- a
		// fos.write(57);
		// fos.write(55);
		
		//public void write(byte[] b):дһ���ֽ�����
		byte[] bys={97,98,99,100,101};
		fos.write(bys);
		
		//public void write(byte[] b,int off,int len):дһ���ֽ������һ����
		fos.write(bys,1,3);
		
		//�ͷ���Դ
		fos.close();
	}
}
