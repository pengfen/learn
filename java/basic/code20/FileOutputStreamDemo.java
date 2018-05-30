package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO���ķ��ࣺ
 * 		����
 * 			������	��ȡ����
 * 			����� д������
 * 		�������ͣ�
 * 			�ֽ���
 * 				�ֽ�������	��ȡ����	InputStream
 * 				�ֽ������	д������	OutputStream
 * 			�ַ���
 * 				�ַ�������	��ȡ����	Reader
 * 				�ַ������	д������	Writer
 * 
 * 		ע�⣺һ��������̽��IO����ʱ�����û����ȷ˵�������ַ�����˵��Ĭ��������ǰ��������������ֵġ�
 * 
 * ������Ҫ��һ���ı��ļ�������һ�仰��"hello,io"
 * 
 * ������
 * 		A:�����������ǲ����ַ��������������أ��ַ��������ֽ���֮��ų��ֵģ����ԣ��������Ƚ����ֽ�����β�����
 * 		B:��������Ҫ���ļ���дһ�仰����������Ҫ�����ֽ��������
 * 
 * ͨ������ķ���������֪��Ҫʹ�ã�OutputStream
 * ����ͨ���鿴API�����Ƿ��ָ���������һ�������࣬����ʵ������
 * ���ԣ�����Ҫ��һ����������ࡣ
 * ������Ҫ�ҵ�������ʲô���ֵ���?���ʱ�򣬺ܼ򵥣����ǻ���һ�£������ǲ���Ҫ���ļ���д������
 * �ļ����ĸ����ʣ�File
 * Ȼ���õ����ֽ�����������������ǣ�FileOutputStream
 * ע�⣺ÿ�ֻ�������඼���Ը�������Ϊ��׺����
 * 		XxxOutputStream
 * 		XxxInputStream
 * 		XxxReader
 * 		XxxWriter
 * �鿴FileOutputStream�Ĺ��췽����
 * 		FileOutputStream(File file) 
 *		FileOutputStream(String name)
 *
 * �ֽ�������������裺
 * 		A:�����ֽ����������
 * 		B:д����
 * 		C:�ͷ���Դ
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		// �����ֽ����������
		// FileOutputStream(File file)
		// File file = new File("fos.txt");
		// FileOutputStream fos = new FileOutputStream(file);
		// FileOutputStream(String name)
		FileOutputStream fos = new FileOutputStream("fos.txt");
		/*
		 * �����ֽ���������������˼������飺
		 * A:����ϵͳ����ȥ�����ļ�
		 * B:����fos����
		 * C:��fos����ָ������ļ�
		 */
		
		//д����
		fos.write("hello,IO".getBytes());
		fos.write("java".getBytes());
		
		//�ͷ���Դ
		//�رմ��ļ���������ͷ�������йص�����ϵͳ��Դ��
		fos.close();
		/*
		 * Ϊʲôһ��Ҫclose()��?
		 * A:���������������������Ϳ��Ա�����������������
		 * B:֪ͨϵͳȥ�ͷŸ����ļ���ص���Դ
		 */
		//java.io.IOException: Stream Closed
		//fos.write("java".getBytes());
	}
}
